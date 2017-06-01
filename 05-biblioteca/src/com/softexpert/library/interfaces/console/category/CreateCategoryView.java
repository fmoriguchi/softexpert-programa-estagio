/**
 * 
 */
package com.softexpert.library.interfaces.console.category;

import java.util.Scanner;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;
import com.softexpert.library.domain.CreateRecordException;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class CreateCategoryView implements ComponentView {

	private final Scanner scanner;
	private final Categories categories;

	public CreateCategoryView(final Scanner scanner, final Categories categories) {

		this.scanner = scanner;
		this.categories = categories;
	}
	
	@Override
	public void run() {
		
		System.out.println("Digite o nome: ");
		String name = scanner.nextLine();
		
		System.out.println("Digite uma descrição: ");
		String description = scanner.nextLine();
		
		Category category = new Category(name, description);
		
		try {
			categories.create(category);
		} catch (CreateRecordException e) {
			System.err.println(e.getMessage());
		}
	}

}
