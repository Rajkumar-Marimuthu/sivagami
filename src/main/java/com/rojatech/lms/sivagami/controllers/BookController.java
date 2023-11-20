package com.rojatech.lms.sivagami.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rojatech.lms.sivagami.models.Book;

@RestController
public class BookController {
	List<Book> books = new ArrayList<>();
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return books;
	}
	
	@PostMapping("/books")
	public Book addBooks(Book book) {
		books.add(book);
		return book;
	}

}
