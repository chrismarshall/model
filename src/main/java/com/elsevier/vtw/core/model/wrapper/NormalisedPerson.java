package com.elsevier.vtw.core.model.wrapper;

import com.elsevier.vtw.core.model.wrapper.internal.Field;
import com.elsevier.vtw.core.model.wrapper.internal.Normalised;
import com.elsevier.vtw.core.model.wrapper.internal.Wrapper;

/**
 * Example of how to treat a tuple of properties as though a sub object
 * e.g.
 * make
 *     person.gender
 *     person.first
 *     person.last
 *     
 * look like
 * 
 *     person.gender
 *     person.firstandlast.first
 *     person.firstandlast.last
 *
 */
public interface NormalisedPerson extends Wrapper {
	@Field("gender")
	String getGender();
	void setGender(String gender);
	
	@Normalised
	FirstAndLastName getFirstAndLastName();
}