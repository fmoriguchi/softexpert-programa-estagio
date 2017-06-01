/**
 * 
 */
package com.softexpert.library.interfaces.console.author;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.softexpert.library.domain.Author;
import com.softexpert.library.domain.Authors;
import com.softexpert.library.domain.CreateRecordException;
import com.softexpert.library.interfaces.console.ComponentView;

/**
 * @author japa
 *
 */
public final class CreateAuthorView implements ComponentView {

	private final Scanner scanner;
	private final Authors authors;

	public CreateAuthorView(Scanner scanner, Authors authors) {
		this.scanner = scanner;
		this.authors = authors;
	}

	@Override
	public void run() {

		System.out.println("Digite o nome do author: ");

		String name = scanner.nextLine();

		System.out.println("Digite a data de nascimento do author (dd/MM/yyyy): ");

		String born = scanner.nextLine();

		System.out.println("Digite a nacionalidade do author ");

		String nationality = scanner.nextLine();

		Author author = new Author(name, format(born), nationality);
		
		try {
			authors.create(author);
		} catch (CreateRecordException e) {
			System.err.println(e.getMessage());
		}

	}

	private Date format(String date) {

		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return fmt.parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
