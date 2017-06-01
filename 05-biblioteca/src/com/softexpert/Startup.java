/**
 * 
 */
package com.softexpert;

import java.util.Scanner;

import com.softexpert.library.interfaces.console.LibrayApp;

/**
 * @author japa
 *
 */
public class Startup {

	public static void main(String[] args) {

		LibrayApp app = new LibrayApp(new Scanner(System.in));
		app.upManyRecords();
		app.run();
	}

}
