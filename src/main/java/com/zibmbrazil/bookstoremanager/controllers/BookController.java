package com.zibmbrazil.bookstoremanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@GetMapping
	public String hello() {
		return "Hello Bookstore Manager, I am running an example with PR!!";
	}
}
