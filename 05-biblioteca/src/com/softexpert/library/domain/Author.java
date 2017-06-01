/**
 * 
 */
package com.softexpert.library.domain;

import java.util.Date;

/**
 * @author japa
 *
 */
public final class Author {

	private String id;
	private String name;
	private Date born;
	private String nationality;

	public Author(String name) {
		this.name = name;
	}

	public Author(String name, Date born, String nationality) {
		this.name = name;
		this.born = born;
		this.nationality = nationality;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
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
		Author other = (Author) obj;
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
		builder.append("Author [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", born=");
		builder.append(born);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append("]");
		return builder.toString();
	}
}
