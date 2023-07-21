package com.kata.leapyear.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kata.leapyear.exception.LeapYearValidationException;
import com.kata.leapyear.service.LeapYearValidator;

@RestController
public class LeapYearController {

	@GetMapping("/leapyear/{year}")
	public String isLeapYear(@PathVariable int year) {
		if (LeapYearValidator.isLeapYear(year)) {
			return year + " is a leap year.";
		} else {
			return year + " is not a leap year.";
		}
	}

	@ExceptionHandler(LeapYearValidationException.class)
    public String handleLeapYearValidationException(LeapYearValidationException ex) {
        return ex.getMessage();
    }
}
