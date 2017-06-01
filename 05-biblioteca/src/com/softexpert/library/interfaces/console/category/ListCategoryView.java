/**
 * 
 */
package com.softexpert.library.interfaces.console.category;

import java.util.Collection;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public class ListCategoryView implements ComponentView {

	private Categories categories;
	
	public ListCategoryView(Categories categories) {
		this.categories = categories;
	}
	
	@Override
	public void run() {
		
		Collection<Category> all = categories.all();
		
		for (Category category : all) {
			System.out.println(category);
		}
	}
	
}
