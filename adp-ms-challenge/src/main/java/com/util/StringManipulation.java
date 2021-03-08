package com.util;

public class StringManipulation {
	public static String camelCase(String originalString) {
		final StringBuilder ret = new StringBuilder(originalString.length());

	    for (final String word : originalString.split(" ")) {
	        if (!word.isEmpty()) {
	            ret.append(Character.toUpperCase(word.charAt(0)));
	            ret.append(word.substring(1).toLowerCase());
	        }
	        if (!(ret.length() == originalString.length()))
	            ret.append(" ");
	    }

	    return ret.toString();
	}
}
