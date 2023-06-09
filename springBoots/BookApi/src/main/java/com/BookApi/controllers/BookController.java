package com.BookApi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BookApi.models.Book;
import com.BookApi.services.BookService;
@Controller
public class BookController {
	private final BookService bookService;
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	@RequestMapping("/books/{id}")
	public String index(@PathVariable("id")long id,Model model) {
		Book bk1=this.bookService.findBook(id);
		model.addAttribute("book",bk1);
		
		return "index.jsp";
	}
	@RequestMapping("/books")
	public String allbook(Model model) {
		 List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
		
		return "showall.jsp";
	}

}

    
