package com.kata.leapyear;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.kata.leapyear.exception.LeapYearValidationException;
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

	@Test
	public void testRegularLeapYears() {
		assertTrue(LeapYearValidator.isLeapYear(2012));
		assertTrue(LeapYearValidator.isLeapYear(2016));
		assertTrue(LeapYearValidator.isLeapYear(2020));
	}

	@Test
	public void testNonLeapYearsAfterLeapYears() {
		assertFalse(LeapYearValidator.isLeapYear(2017));
		assertFalse(LeapYearValidator.isLeapYear(2021));
		assertFalse(LeapYearValidator.isLeapYear(2022));
	}

	@Test
	public void testInvalidYears() {
		assertThrows(LeapYearValidationException.class, () -> LeapYearValidator.isLeapYear(0));
		assertThrows(LeapYearValidationException.class, () -> LeapYearValidator.isLeapYear(-200));
	}

}
