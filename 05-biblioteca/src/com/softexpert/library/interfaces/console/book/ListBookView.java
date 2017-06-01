/**
 * 
 */
package com.softexpert.library.interfaces.console.book;

import java.util.Collection;
import java.util.Scanner;

import com.softexpert.library.domain.Book;
import com.softexpert.library.domain.Books;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class ListBookView implements ComponentView {

	private final Scanner scanner;
	private final Books books;
	
	
	public ListBookView(Scanner scanner, Books books) {

		this.scanner = scanner;
		this.books = books;
	}


	@Override
	public void run() {

		Collection<Book> all = books.all();
		
		for (Book book : all) {
			
			System.out.println(book);
		}
	}

}
