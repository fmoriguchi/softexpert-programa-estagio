/**
 * 
 */
package com.softexpert.library.interfaces.console.author;

import java.util.Scanner;

import com.softexpert.library.domain.Authors;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public enum AuthorOptions {

	CREATE("1") {
		
		@Override
		public ComponentView action(Scanner scanner, Authors authors) {
			return new CreateAuthorView(scanner, authors);
		}
	},
	
	UPDATE("2") {
		
		@Override
		public ComponentView action(Scanner scanner, Authors authors) {
			return new UpdateAuthorView(scanner, authors);
		}
	},
	
	REMOVE("3") {
	
		@Override
		public ComponentView action(Scanner scanner, Authors authors) {
			return new RemoveAuthorView(scanner, authors);
		}
	},
	
	FIND("4") {
		
		@Override
		public ComponentView action(Scanner scanner, Authors authors) {
			return new FindAuthorView(scanner, authors);
		}
	},
	
	LISTALL("5") {
		@Override
		public ComponentView action(Scanner scanner, Authors authors) {
			return new ListAuthorView(authors);
		}
	};
	
	
	private final String choice;

	private AuthorOptions(String choice) {
		this.choice = choice;
	}

	abstract ComponentView action(Scanner scanner, Authors authors);
	
	public static AuthorOptions operationBy(String choice) {
		
		for (AuthorOptions operation : values()) {
			
			if (operation.choice.equals(choice)) {
				return operation;
			}
		}
		
		throw new IllegalArgumentException("Author operation not found by choice " + choice);
	}
	
}
