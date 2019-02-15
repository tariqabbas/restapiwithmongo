package com.mongo.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.org.Books;
import com.mongo.repositories.BooksRepository;
import com.mongo.utils.LibraryUtils;

@Service
public class BooksService {

	@Autowired
	LibraryUtils utils;

	@Autowired
	BooksRepository booksRepository;
//	@Autowired
//	BookContentStore bookContentStore;

	public void saveBook(BigInteger id,String name, String category, String author_name) {
		Books content = new Books();
		content.setId(id);
		content.setName(name);
		content.setAuthor_name(author_name);
		content.setCategory(category);
		
		booksRepository.save(content);
	}

}
