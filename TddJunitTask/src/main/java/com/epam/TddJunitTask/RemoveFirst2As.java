package com.epam.TddJunitTask;

public class RemoveFirst2As {

	public static String removeAs(String string) {
		int stringlength = string.length();
		String result = "";
		if(stringlength == 1) {
			if(string == "A")
				result = "";
			else
				result = string;
				
		} else if(stringlength >= 2) {
			char firstChar = string.charAt(0);
			char secondChar = string.charAt(1);
			String remainingChars = string.substring(2,stringlength);
			if(firstChar == 'A' && secondChar == 'A') 
				result = remainingChars;
			else if(firstChar == 'A' && secondChar != 'A')
				result = secondChar + remainingChars;
			else if(firstChar != 'A' && secondChar == 'A')
				result = firstChar + remainingChars;
			else
				result = string;
		}
		return result;
		
	}

}
