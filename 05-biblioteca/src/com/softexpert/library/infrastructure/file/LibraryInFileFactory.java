package com.softexpert.library.infrastructure.file;

import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.Books;
import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.LibraryFactory;

public class LibraryInFileFactory implements LibraryFactory {

	@Override
	public Authors getAuthors() {
		return new AuthorInFile();
	}

	@Override
	public Books getBooks() {
		return new BookInFile();
	}

	@Override
	public Categories getCategories() {
		return new CategoryInFile();
	}

}
