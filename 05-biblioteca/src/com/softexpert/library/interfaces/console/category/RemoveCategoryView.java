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
public final class RemoveCategoryView implements ComponentView {

	private Scanner scanner;
	private Categories categories;

	public RemoveCategoryView(Scanner scanner, Categories categories) {
		this.scanner = scanner;
		this.categories = categories;
	}

	@Override
	public void run() {

		System.out.println("Digite o código da categoria que deseja remover: ");

		String id = scanner.nextLine();

		Category category = categories.findBy(id);

		if (category == null) {

			System.out.println("Não existe categoria com o código: " + id);
			return;
		}

		System.out.println("Ter certeza que deseja remover a categoria '" + category.getName() + "' ?");
		System.out.println("(S)im ou (N)ão");

		String decision = scanner.nextLine();

		if ("S".equalsIgnoreCase(decision)) {
			categories.remove(category);
		}
	}
}
