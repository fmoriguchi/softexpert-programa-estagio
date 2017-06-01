/**
 * 
 */
package com.softexpert.library.interfaces.console.category;

import java.util.Scanner;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public class CategoryApp implements ComponentView {

	private final Scanner scanner;
	private final Categories categories;

	public CategoryApp(Scanner scanner, Categories categories) {

		this.scanner = scanner;
		this.categories = categories;
	}

	@Override
	public void run() {

		while (true) {

			this.printMenu();

			String choice = scanner.nextLine();

			if ("6".equals(choice)) {
				return;
			}
			
			ComponentView app = CategoryOptions.byCode(choice)
												 .action(scanner, categories);
			app.run();
		}

	}

	private void printMenu() {

		System.out.println("O que deseja fazer em categorias ?");
		System.out.println("1 - Criar categoria");
		System.out.println("2 - Atualizar categoria");
		System.out.println("3 - Remover categoria");
		System.out.println("4 - Buscar categoria por codigo");
		System.out.println("5 - Listar categorias");
		System.out.println("6 - Sair");
	}
}
