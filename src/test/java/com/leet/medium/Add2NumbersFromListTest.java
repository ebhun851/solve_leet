package com.leet.medium;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.leet.java.domains.ListNode;
import com.leet.medium.Add2NumbersFromList;

public class Add2NumbersFromListTest {

	@Test	
	public void sumOf2Numbers() {
		int num1 = 345;
		int num2 = 456;
		
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(4);
		ListNode result = Add2NumbersFromList.addTwoNumbers(l1, l2);
		
		assertThat((double)(num1 + num2), is(closeTo((double)(result.next.next.val*100 + result.next.val*10 + result.val),0d)));
	}
}


