/**
 * 
 */
package com.softexpert.library.interfaces.console.author;

import java.util.Collection;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public class ListAuthorView implements ComponentView {
	
	private final Authors authors;

	public ListAuthorView(Authors authors) {
		this.authors = authors;
	}

	@Override
	public void run() {
	
		Collection<Author> all = authors.all();
		
		for (Author author : all) {
			
			System.out.println(author);
		}
	}

}
