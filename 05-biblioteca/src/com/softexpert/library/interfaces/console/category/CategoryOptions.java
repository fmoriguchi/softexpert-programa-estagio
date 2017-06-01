/**
 * 
 */
package com.softexpert.library.interfaces.console.category;

import java.util.Scanner;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public enum CategoryOptions {

	CREATE("1") {

		@Override
		ComponentView action(Scanner scanner, Categories categories) {
			return new CreateCategoryView(scanner, categories);
		}
	},

	UPDATE("2") {

		@Override
		ComponentView action(Scanner scanner, Categories categories) {
			return new UpdateCategoryView(scanner, categories);
		}
	},
	REMOVE("3") {

		@Override
		ComponentView action(Scanner scanner, Categories categories) {

			return new RemoveCategoryView(scanner, categories);
		}
	},
	FIND("4") {

		@Override
		ComponentView action(Scanner scanner, Categories categories) {
			return new FindCategoryView(scanner, categories);
		}
	},
	LISTALL("5") {
		@Override
		ComponentView action(Scanner scanner, Categories categories) {

			return new ListCategoryView(categories);
		}
	};

	private CategoryOptions(String code) {
		this.code = code;
	}

	private String code;

	abstract ComponentView action(Scanner scanner, Categories categories);
	
	public static CategoryOptions byCode(String code) {
		
		for (CategoryOptions operation : CategoryOptions.values()) {
			
			if (operation.code.equals(code)) {
				return operation;
			}
		}
		
		throw new IllegalArgumentException("Category operation not found by code " + code);
	}
	
}
