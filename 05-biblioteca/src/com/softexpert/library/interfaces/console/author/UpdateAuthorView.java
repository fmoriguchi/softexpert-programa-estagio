/**
 * 
 */
package com.softexpert.library.interfaces.console.author;

import java.util.Scanner;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.interfaces.console.ComponentView;
import com.softexpert.library.interfaces.console.author.utils.DateFormat;

/**
 * @author japa
 *
 */
public final class UpdateAuthorView implements ComponentView {

	private final Scanner scanner;
	private final Authors authors;
	private final DateFormat format;
	
	public UpdateAuthorView(final Scanner scanner, Authors authors) {
		this.scanner = scanner;
		this.authors = authors;
		this.format = new DateFormat();
	}

	@Override
	public void run() {

		System.out.println("Digite o código do autor: ");

		String id = this.scanner.nextLine();

		Author author = this.authors.findBy(id);

		if (author == null) {
			System.out.println("Não foi encontrado o autor pelo codigo: " + id);
			return;
		}
		
		System.out.println("Digite o nome do autor: ");
		
		String name = this.scanner.nextLine();

		System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");

		String born = this.scanner.nextLine();

		System.out.println("Digite o nome do autor: ");

		String nationality = this.scanner.nextLine();
		
		Author newAuthor = new Author(name, format.parser(born), nationality);
		newAuthor.setId(id);
				
		this.authors.update(newAuthor);
	}
}
