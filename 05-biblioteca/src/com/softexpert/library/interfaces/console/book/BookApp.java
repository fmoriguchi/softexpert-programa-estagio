/**
 * 
 */
package com.softexpert.library.interfaces.console.book;

import java.util.Scanner;

import com.softexpert.library.domain.LibraryFactory;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class BookApp implements ComponentView {

	
	private final Scanner scanner;
	private final LibraryFactory library;
	
	public BookApp(Scanner scanner, LibraryFactory library) {
		this.scanner = scanner;
		this.library = library;
	}

	@Override
	public void run() {
		
		try {
			
			this.printMenu();
			
			String choice = this.scanner.nextLine();
			
			BookOptions options = BookOptions.by(choice);
			
			ComponentView bookComponent = options.component(scanner, library);
			
			bookComponent.run();
			
		}catch (Exception e) {
		  
			System.err.println("Deu zica: " + e.getMessage());
		}
		

	}

	private void printMenu() {

		System.out.println("O que deseja fazer em livro ?");
		System.out.println("1 - Criar livro");
		System.out.println("2 - Atualizar livro");
		System.out.println("3 - Remover livro");
		System.out.println("4 - Buscar livro por codigo");
		System.out.println("5 - Listar livros");
		System.out.println("6 - Sair");
	}
}
