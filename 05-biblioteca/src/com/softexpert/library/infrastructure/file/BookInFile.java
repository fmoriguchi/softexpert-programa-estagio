package com.softexpert.library.infrastructure.file;

import java.util.Collection;

import com.softexpert.library.domain.Book;
import com.softexpert.library.domain.Books;
import com.softexpert.library.domain.CreateRecordException;

public class BookInFile implements Books {

	@Override
	public void create(Book book) throws CreateRecordException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book findBy(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Book> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
