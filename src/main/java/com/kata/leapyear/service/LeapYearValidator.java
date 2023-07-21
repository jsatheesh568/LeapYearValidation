package com.kata.leapyear.service;

import org.springframework.stereotype.Service;

import com.kata.leapyear.exception.LeapYearValidationException;

@Service
public class LeapYearValidator {
	public static boolean isLeapYear(int year) {
		 if (year <= 0) {
	            throw new LeapYearValidationException("Invalid year: " + year + ". Year must be a positive integer.");
	        }
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}