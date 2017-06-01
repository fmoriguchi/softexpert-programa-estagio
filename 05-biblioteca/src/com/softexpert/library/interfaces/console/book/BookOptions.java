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
public enum BookOptions {

	CREATE("1") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory library) {

			return new CreateBookView(scanner, library.getBooks(), library.getCategories(), library.getAuthors());
		}
	},

	UPDATE("2") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory library) {
			return null;
		}
	},

	REMOVE("3") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory library) {
			return null;
		}
	},

	FIND("4") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory library) {
			return null;
		}
	},

	LIST("5") {

		@Override
		ComponentView component(Scanner scanner, LibraryFactory library) {
			return new ListBookView(scanner, library.getBooks());
		}
	};

	private final String choice;

	private BookOptions(String option) {
		this.choice = option;
	}

	abstract ComponentView component(Scanner scanner, LibraryFactory library);

	public static BookOptions by(String choice) {

		for (BookOptions option : values()) {
			
			if (option.choice.equals(choice)) {
				return option;
			}
		}
		
		throw new IllegalArgumentException("BookOptions not found");
	}
}
