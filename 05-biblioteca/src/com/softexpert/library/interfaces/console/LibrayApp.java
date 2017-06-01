package com.softexpert.library.interfaces.console;

import java.util.Date;
import java.util.Scanner;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;
import com.softexpert.library.domain.LibraryFactory;
import com.softexpert.library.infrastructure.memory.LibraryMemoryFactory;

/**
 * 
 * @author japa
 *
 */
public final class LibrayApp implements ComponentView {

	private final Scanner scanner;
	private final LibraryFactory repository;

	public LibrayApp(Scanner scanner) {

		this.scanner = scanner;
		this.repository = new LibraryMemoryFactory();
	}

	@Override
	public void run() {

		while (true) {

			System.out.println("Ola, digite uma das opcoes abaixo:");
			System.out.println("1 - Categoria");
			System.out.println("2 - Autor");
			System.out.println("3 - Livro");
			System.out.println("4 - Sair");
			System.out.println("");

			String choice = this.scanner.nextLine();

			if (choice.equals("4")) {
				break;
			}

			LibrayOperations operation = LibrayOperations.options(choice);
			
			ComponentView app = operation.component(scanner, repository);
			
			app.run();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void upManyRecords() {
		
		try {
			Authors authors = this.repository.getAuthors();
			authors.create(new Author("Japa", new Date(1982, 4, 15), "Brasileiro"));
			authors.create(new Author("Maria Elisa Moriguchi", new Date(2012, 7, 31), "Brasileira"));
			
			Categories categories = this.repository.getCategories();
			categories.create(new Category("Terror", "Buuuuuuuu"));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
