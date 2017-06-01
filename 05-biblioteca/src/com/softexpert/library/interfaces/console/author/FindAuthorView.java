/**
 * 
 */
package com.softexpert.library.interfaces.console.author;

import java.util.Scanner;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class FindAuthorView implements ComponentView {

	private final Scanner scanner;
	private final Authors authors;

	public FindAuthorView(Scanner scanner, Authors authors) {
	
		this.scanner = scanner;
		this.authors = authors;
	}

	@Override
	public void run() {
		
		System.out.println("Digite o código do autor: ");

		String id = scanner.nextLine();
		
		Author author = this.authors.findBy(id);
		
		if (author == null) {
			System.out.println("Autor não encontrado");
			return;
		}
		
		System.out.println(author);
	}

}
