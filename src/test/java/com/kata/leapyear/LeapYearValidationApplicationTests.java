package com.kata.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.leapyear.service.LeapYearValidator;


class LeapYearValidationApplicationTests {

	@Test
	public void testLeapYears() {
		 assertTrue(LeapYearValidator.isLeapYear(2000));
	}

}
