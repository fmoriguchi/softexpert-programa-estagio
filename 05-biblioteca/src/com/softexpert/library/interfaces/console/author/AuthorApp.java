/**
 * 
 */
package com.softexpert.library.interfaces.console.author;

import java.util.Scanner;

import com.softexpert.library.domain.Authors;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class AuthorApp implements ComponentView {

	private final Scanner scanner;
	private final Authors authors;

	public AuthorApp(Scanner scanner, Authors authors) {
		this.scanner = scanner;
		this.authors = authors;
	}

	@Override
	public void run() {

		while (true) {

			printMenu();

			String choice = scanner.nextLine();

			if ("6".equals(choice)) {
				break;
			}

			AuthorOptions operation = AuthorOptions.operationBy(choice);

			operation.action(scanner, authors).run();
		}
	}

	private void printMenu() {

		System.out.println("O que deseja fazer em 'autores' ?");
		System.out.println("1 - Criar um autor");
		System.out.println("2 - Atualizar um autor");
		System.out.println("3 - Remover um autor");
		System.out.println("4 - Buscar autor por codigo");
		System.out.println("5 - Listar autores");
		System.out.println("6 - Sair");
	}

}
