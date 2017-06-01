/**
 * 
 */
package com.softexpert.library.infrastructure.memory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.softexpert.library.domain.Book;
import com.softexpert.library.domain.Books;
import com.softexpert.library.domain.CreateRecordException;

/**
 * @author japa
 *
 */
public final class BooksInMemory implements Books {
	
	private static final Map<String, Book> BOOKS = new HashMap<>();

	private final GenerateID generate = new GenerateID();
	
	@Override
	public void create(Book book) throws CreateRecordException {
	
		if (!book.isValidBook()) {
			throw new CreateRecordException("Não foi possível criar o livro. Verifique os dados informados.");
		} 
		
		book.setId(generate.create());
		
		BOOKS.put(book.getId(), book);
	}

	@Override
	public void update(Book book) {

	
	}

	@Override
	public void remove(Book book) {
	
		BOOKS.remove(book).getId();
	}

	@Override
	public Book findBy(String id) {
		
		return BOOKS.get(id);
	}

	@Override
	public Collection<Book> all() {
	
		return BOOKS.values();
	}

}
