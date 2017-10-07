package com.leet.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongSubstringWithoutRepeatChars {

	public static String getUniqueCharSubString(String input) {
		char[] inputArray = input.toCharArray();
		
		List<String> result = new ArrayList<String>();
		List<String> temp = new ArrayList<String>();
		//pwwkew
		for( int i = 0 ; i <inputArray.length ;i++) {
			
			if(temp.contains(String.valueOf(inputArray[i]))) {
				result = result.size() > temp.size()? result : temp;
				temp = new ArrayList<String>();
				temp.add(String.valueOf(inputArray[i]));
				continue;
			}
			temp.add(String.valueOf(inputArray[i]));
		}
		
		result = result.size() > temp.size()? result : temp;
		
		StringBuffer convertedResult = new StringBuffer();
		
		for (String s : result) {
			convertedResult.append(s);
		}
		return convertedResult.toString();
	}

	
}
