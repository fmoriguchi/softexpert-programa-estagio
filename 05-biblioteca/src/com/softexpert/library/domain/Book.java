/**
 * 
 */
package com.softexpert.library.domain;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author japa
 *
 */
public final class Book {

	private String id;
	private String title;
	private String resume;
	private String barCode;
	private Integer pages;
	private String localization;
	private Category category;
	private Collection<Author> authors;

	public Book(String title) {
		this.authors = new ArrayList<>();
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public String getLocalization() {
		return localization;
	}

	public Collection<Author> getAuthors() {
		return authors;
	}

	public boolean add(Author author) {

		return this.authors.add(author);
	}
	
	public boolean isValidBook() {
		return this.title != null && !this.title.trim().isEmpty();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", resume=");
		builder.append(resume);
		builder.append(", barCode=");
		builder.append(barCode);
		builder.append(", pages=");
		builder.append(pages);
		builder.append(", localization=");
		builder.append(localization);
		builder.append(", category=");
		builder.append(category);
		builder.append(", authors=");
		builder.append(authors);
		builder.append("]");
		return builder.toString();
	}
}
