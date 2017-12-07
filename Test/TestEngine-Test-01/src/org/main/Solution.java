package org.main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.test.PalindromeTest;

public class Solution {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(PalindromeTest.class);
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
