/**
 * 
 */
package com.softexpert.library.infrastructure.memory;

import java.util.UUID;

/**
 * @author japa
 *
 */
public class GenerateID {

	public String create() {

		UUID idOne = UUID.randomUUID();
		return idOne.toString().replaceAll("-", "");
	}
}
