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
public class UpdateCategoryView implements ComponentView {

	private Scanner scanner;
	private Categories categories;

	public UpdateCategoryView(Scanner scanner, Categories categories) {
		this.scanner = scanner;
		this.categories = categories;
	}

	@Override
	public void run() {

		System.out.println("Digite o código da categoria que deseja modificar: ");

		String id = scanner.nextLine();

		Category category = categories.findBy(id);

		if (category == null) {

			System.out.println("Não existe categoria com o código '" + id + "'");
			return;
		}

		System.out.println("Digite um novo nome para categoria (nome atual: '" + category.getName() + "')");

		String name = scanner.nextLine();

		System.out.println("Digite um nova descrição para categoria (descriçao atual: '" + category.getDescription() + "')");

		String description = scanner.nextLine();

		Category newCategory = new Category(name, description);
		newCategory.setId(id);
		
		categories.update(newCategory);
	}
}
