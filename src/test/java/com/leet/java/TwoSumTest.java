package com.leet.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.leet.easy.TwoSum;

public class TwoSumTest {
	
	@Test
	public void assertTheIndicesOfTargeValue() {
		assertThat(TwoSum.getIndices(new int[] {2,7,11,19} , 13)).containsOnly(0,2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void assertTheExceptionWhenInvalidTarget() {
		TwoSum.getIndices(new int[] {2,7,11,19} , 14);
	}
}
	