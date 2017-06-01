/**
 * 
 */
package com.softexpert.library.domain;

import java.util.Collection;

/**
 * @author japa
 *
 */
public interface Categories {

	void create(Category category) throws CreateRecordException;

	void update(Category category);

	void remove(Category category);

	Category findBy(String id);
	
	Collection<Category> all();
}
