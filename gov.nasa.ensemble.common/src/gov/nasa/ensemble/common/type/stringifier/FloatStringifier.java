/*******************************************************************************
 * Copyright 2014 United States Government as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package gov.nasa.ensemble.common.type.stringifier;

import gov.nasa.ensemble.common.type.AbstractTrimmingStringifier;

import java.text.ParseException;

public class FloatStringifier extends AbstractTrimmingStringifier<Float> {

	@Override
	public String getDisplayString(Float javaObject) {
		if (javaObject == null) {
			return "";
		}
		return Float.toString(javaObject);
	}

	@Override
	public Float getJavaObjectFromTrimmed(String string, Float defaultObject) throws ParseException {
		try {
			return Float.valueOf(string);
		} catch (NumberFormatException e) {
			throw new ParseException("Invalid Float: '"+string+"'", 0);
		}
	}

}
