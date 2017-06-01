/**
 * 
 */
package com.softexpert.library.domain;

/**
 * @author japa
 *
 */
public interface LibraryFactory {

	Authors getAuthors();
	
	Books getBooks();
	
	Categories getCategories();
}
