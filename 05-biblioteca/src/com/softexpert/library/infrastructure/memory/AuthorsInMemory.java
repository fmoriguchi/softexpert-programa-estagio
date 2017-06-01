package com.softexpert.library.infrastructure.memory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;

/**
 * 
 * @author japa
 *
 */
public final class AuthorsInMemory implements Authors {

	private static final Map<String, Author> AUTHORS = new HashMap<>();
	private static final GenerateID GENERATEID = new GenerateID();

	@Override
	public void create(Author author) {

		author.setId(GENERATEID.create());

		AUTHORS.put(author.getId(), author);
	}

	@Override
	public void update(Author author) {

		if (AUTHORS.containsValue(author)) {
			AUTHORS.put(author.getId(), author);
		}
	}

	@Override
	public void remove(Author author) {

		AUTHORS.remove(author.getId());
	}

	@Override
	public Author findBy(String id) {
		
		return AUTHORS.get(id);
	}

	@Override
	public Collection<Author> all() {
		
		return AUTHORS.values();
	}

}
