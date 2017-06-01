/**
 * 
 */
package com.softexpert.library.interfaces.console;

import java.util.Scanner;

import com.softexpert.library.domain.LibraryFactory;
import com.softexpert.library.interfaces.console.author.AuthorApp;
import com.softexpert.library.interfaces.console.book.BookApp;
import com.softexpert.library.interfaces.console.category.CategoryApp;

/**
 * @author japa
 *
 */
public enum LibrayOperations {

	CATEGORY("1") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory libray) {
			return new CategoryApp(scanner, libray.getCategories());
		}
	},

	AUTHOR("2") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory libray) {
			return new AuthorApp(scanner, libray.getAuthors());
		}
	},

	BOOK("3") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory libray) {
			return new BookApp(scanner, libray);
		}
	};

	private final String code;

	private LibrayOperations(String code) {
		this.code = code;
	}

	abstract ComponentView component(Scanner scanner, LibraryFactory libray);

	public static final LibrayOperations options(String option) {

		for (LibrayOperations operation : values()) {

			if (operation.code.equals(option)) {
				return operation;
			}
		}

		throw new IllegalArgumentException("Libray option not found by code: " + option);
	}
}
