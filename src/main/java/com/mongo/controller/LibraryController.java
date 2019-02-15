package com.mongo.controller;

import java.math.BigInteger;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import com.mongo.org.Books;
import com.mongo.repositories.BooksRepository;
import com.mongo.service.BooksService;

@RestController
public class LibraryController extends CommonsRequestLoggingFilter {
	private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

	@Autowired
	BooksService bookService;
	@Autowired
	private BooksRepository bookRepo;

	@RequestMapping(value = "/add")
	public String creadeBook(@RequestParam("id") BigInteger id,@RequestParam("name") String name, @RequestParam("category") String category,
			@RequestParam("author_name") String author_name) {
		bookService.saveBook(id,name, category, author_name);
		return "Record added  Successful  ";
	}

	@RequestMapping(value = "/find")
	public Optional<Books> find(@RequestParam("id") BigInteger id) {
		Optional<Books> books = bookRepo.findById(id);
		return books;
	}

	@RequestMapping(value = "/update")
	public String Update() {
		return "Test Successful and pass is " + "Update";
	}
}
