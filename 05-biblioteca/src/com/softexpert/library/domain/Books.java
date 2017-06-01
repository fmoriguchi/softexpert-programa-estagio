/**
 * 
 */
package com.softexpert.library.domain;

import java.util.Collection;

/**
 * @author japa
 *
 */
public interface Books {

	void create(Book book) throws CreateRecordException;

	void update(Book book);

	void remove(Book book);

	Book findBy(String id);

	Collection<Book> all();
}
