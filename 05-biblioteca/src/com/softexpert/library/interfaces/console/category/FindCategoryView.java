/**
 * 
 */
package com.softexpert.library.interfaces.console.category;

import java.util.Scanner;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class FindCategoryView implements ComponentView {

	private final Scanner scanner;
	private final Categories categories;

	public FindCategoryView(Scanner scanner, Categories categories) {

		this.scanner = scanner;
		this.categories = categories;
	}

	@Override
	public void run() {

		System.out.println("Digite o código da categoria: ");

		String id = this.scanner.nextLine();

		Category category = this.categories.findBy(id);

		if (category == null) {
			System.out.println("Não existe categoria com o código " + id);
			return;
		}

		System.out.println(category);
	}

}
