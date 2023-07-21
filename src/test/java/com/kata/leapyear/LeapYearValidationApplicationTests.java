package com.kata.leapyear;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.kata.leapyear.service.LeapYearValidator;

class LeapYearValidationApplicationTests {

	@Test
	public void testLeapYears() {
		assertTrue(LeapYearValidator.isLeapYear(2000));
		assertTrue(LeapYearValidator.isLeapYear(2008));
	}

	@Test
	public void testNonLeapYears() {
		assertFalse(LeapYearValidator.isLeapYear(1700));
		assertFalse(LeapYearValidator.isLeapYear(1800));
	}

}
