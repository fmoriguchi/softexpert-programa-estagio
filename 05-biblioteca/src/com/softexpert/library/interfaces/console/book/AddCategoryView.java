/**
 * 
 */
package com.softexpert.library.interfaces.console.book;

import java.util.Collection;
import java.util.Scanner;

import com.softexpert.library.domain.Book;
import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class AddCategoryView implements ComponentView {

	private final Scanner scanner;
	private final Categories categories;
	private final Book book;

	public AddCategoryView(final Scanner scanner, final Categories categories, final Book book) {

		this.scanner = scanner;
		this.categories = categories;
		this.book = book;
	}

	@Override
	public void run() {

		System.out.println("Agora, selecione uma das categorias abaixo:\n\n");

		this.printCategories();
		
		System.out.println("\n\nDigite o código de uma das categorias acima:");

		String categoryId = this.scanner.nextLine();

		Category category = this.categories.findBy(categoryId);

		book.setCategory(category);
	}

	private void printCategories() {

		Collection<Category> all = this.categories.all();

		for (Category category : all) {
			System.out.println(category);
		}
	}

}
