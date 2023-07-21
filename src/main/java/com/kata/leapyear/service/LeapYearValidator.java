package com.kata.leapyear.service;

import org.springframework.stereotype.Service;

@Service
public class LeapYearValidator {
	public static boolean isLeapYear(int year) {
		if(year % 4 ==0 )
		return true;
		else return false;
	}
	

}
