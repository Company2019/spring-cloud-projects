package com.book.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/book")
public class BookController {
//	@Autowired
//	BookService bookService;

	@GetMapping
	String getBook(){
		if(true) {
//			throw new RuntimeException();
		}
		return "from book";
	}
}
