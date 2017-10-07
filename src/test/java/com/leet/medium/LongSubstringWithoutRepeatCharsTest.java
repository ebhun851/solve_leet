package com.leet.medium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LongSubstringWithoutRepeatCharsTest {

	@Test
	public void validateStringWithoutRepeatChars() {
		String input = "pwwkew";

		String result = LongSubstringWithoutRepeatChars.getUniqueCharSubString(input);

		assertThat(result, is("wke"));
	}
}
