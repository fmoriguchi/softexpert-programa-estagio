/**
 * 
 */
package com.softexpert.library.infrastructure.memory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;

/**
 * @author japa
 *
 */
public final class CategoriesInMemory implements Categories {

	private static final Map<String, Category> CATEGORIES = new HashMap<>();
	private static final GenerateID GENERATEID = new GenerateID();
	
	@Override
	public void create(Category category) {

		category.setId(GENERATEID.create());
		
		CATEGORIES.put(category.getId(), category);
	}

	@Override
	public void update(Category category) {
		
	     if (CATEGORIES.containsValue(category)) {
	    	 CATEGORIES.put(category.getId(), category);
	     }
	}

	@Override
	public void remove(Category category) {

	       CATEGORIES.remove(category.getId()); 
	}

	@Override
	public Category findBy(String id) {
		
		return CATEGORIES.get(id);
	}

	@Override
	public Collection<Category> all() {
		
		return CATEGORIES.values();
	}

}
