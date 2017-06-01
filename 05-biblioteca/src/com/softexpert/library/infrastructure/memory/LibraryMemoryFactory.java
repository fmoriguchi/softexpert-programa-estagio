/**
 * 
 */
package com.softexpert.library.infrastructure.memory;

import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.Books;
import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.LibraryFactory;

/**
 * @author japa
 *
 */
public final class LibraryMemoryFactory implements LibraryFactory {

	@Override
	public Authors getAuthors() {
		return new AuthorsInMemory();
	}

	@Override
	public Books getBooks() {
		return new BooksInMemory();
	}

	@Override
	public Categories getCategories() {
		return new CategoriesInMemory();
	}

}
