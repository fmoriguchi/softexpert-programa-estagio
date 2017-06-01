/**
 * 
 */
package com.softexpert.library.domain;

import java.util.Collection;

/**
 * @author japa
 *
 */
public interface Authors {
	
	void create(Author author) throws CreateRecordException;
	
	void update(Author author);
	
	void remove(Author author);
	
	Author findBy(String id); 

	Collection<Author> all();
}
