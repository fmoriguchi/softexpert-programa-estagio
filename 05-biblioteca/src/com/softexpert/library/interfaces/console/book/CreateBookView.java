/**
 * 
 */
package com.softexpert.library.interfaces.console.book;

import java.util.Scanner;

import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.Book;
import com.softexpert.library.domain.Books;
import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.CreateRecordException;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class CreateBookView implements ComponentView {

	private final Scanner scanner;
	private final Books books;
	private final Categories categories;
	private final Authors authors;

	public CreateBookView(Scanner scanner, Books books, Categories categories, Authors authors) {
		this.scanner = scanner;
		this.books = books;
		this.categories = categories;
		this.authors = authors;
	}

	@Override
	public void run() {

		System.out.println("Digite o título do livro: ");

		String title = this.scanner.nextLine();

		Book book = new Book(title);
		
		System.out.println("Digite o resumo do livro: ");

		String resume = this.scanner.nextLine();

		book.setResume(resume);
		
		System.out.println("Digite a quantidade de páginas: ");

		Integer pages = this.scanner.nextInt();

		book.setPages(pages);

		this.runAddCategoryIn(book);
		
		this.runAddAuthorsIn(book);
		
		try {
			
			this.books.create(book);
			
		} catch (CreateRecordException e) {
			
			System.err.println(e.getMessage());
		}
	}

	private void runAddCategoryIn(Book book) {

		ComponentView addCategoryInBook = new AddCategoryView(scanner, categories, book);
		addCategoryInBook.run();
	}

	private void runAddAuthorsIn(Book book) {

		ComponentView addAuthorsInBook = new AddAuthorsView(scanner, authors, book);
		addAuthorsInBook.run();

	}
}
