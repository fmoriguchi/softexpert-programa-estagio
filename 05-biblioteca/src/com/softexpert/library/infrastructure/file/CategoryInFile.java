package com.softexpert.library.infrastructure.file;

import java.util.Collection;

import com.softexpert.library.domain.Categories;
import com.softexpert.library.domain.Category;
import com.softexpert.library.domain.CreateRecordException;

public class CategoryInFile implements Categories {

	@Override
	public void create(Category category) throws CreateRecordException {
			// TODO Auto-generated method stub
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category findBy(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Category> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
