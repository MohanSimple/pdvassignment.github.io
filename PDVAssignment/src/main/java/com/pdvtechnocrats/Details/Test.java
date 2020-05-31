package com.pdvtechnocrats.Details;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("")
	public String greet() {
		return "please redirect to /api/patients";
	}
}
