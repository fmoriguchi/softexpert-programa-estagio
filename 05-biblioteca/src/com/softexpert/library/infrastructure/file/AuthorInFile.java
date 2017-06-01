package com.softexpert.library.infrastructure.file;

import java.util.Collection;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.CreateRecordException;

public class AuthorInFile implements Authors {

	@Override
	public void create(Author author) throws CreateRecordException {
		// TODO Auto-generated method stub	    
	}

	@Override
	public void update(Author author) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Author author) {
		// TODO Auto-generated method stub

	}

	@Override
	public Author findBy(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Author> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
