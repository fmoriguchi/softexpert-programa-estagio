/**
 * 
 */
package com.softexpert.library.interfaces.console.author.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author japa
 *
 */
public final class DateFormat {

	private static final SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	public Date parser(String date) {
		try {
			return FORMAT.parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
