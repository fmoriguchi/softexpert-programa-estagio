/**
 * 
 */
package com.softexpert.library.interfaces.console.book;

import java.util.Collection;
import java.util.Scanner;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.Book;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class AddAuthorsView implements ComponentView {

	private final Scanner scanner;
	private final Authors authors;
	private final Book book;

	public AddAuthorsView(Scanner scanner, Authors authors, Book book) {

		this.scanner = scanner;
		this.authors = authors;
		this.book = book;
	}

	@Override
	public void run() {

		System.out.println("Agora vamos adicionar autores ao livro\n\n");

		this.printAuthors();

		while (true) {

			System.out.println("Deseja adicionar um autor ? ((S)im ou (N)ão)");

			String choice = this.scanner.nextLine();

			if ("N".equalsIgnoreCase(choice)) {
				break;
			}

			System.out.println("Digite o código do autor: ");

			String authorId = this.scanner.nextLine();

			Author author = this.authors.findBy(authorId);

			if (author == null) {
				System.err.println("Autor inexistente, tente outro ... \n");
				continue;
			}
			
			book.add(author);
		}

	}

	private void printAuthors() {

		System.out.println("Autores disponiveis:\n\n");
		
		Collection<Author> all = this.authors.all();

		for (Author author : all) {
			System.out.println(author);
		}
	}

}
