/**
 * 
 */
package com.softexpert.library.domain;

/**
 * @author japa
 *
 */
public final class CreateRecordException extends Exception {


	private static final long serialVersionUID = 1L;

	public CreateRecordException(String message, Throwable cause) {
		super(message, cause);
	}

	public CreateRecordException(String message) {
		super(message);
	}

	public CreateRecordException(Throwable cause) {
		super("Não foi possível criar o registro", cause);
	}
}
