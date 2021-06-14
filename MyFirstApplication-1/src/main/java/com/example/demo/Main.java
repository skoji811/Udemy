package com.example.demo;

import com.example.demo.app.inquiry.Email;
import com.example.demo.app.inquiry.NotNull;

public class Main {
	
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Email(message = "Invalid E-mail format")
	private String email;
}
