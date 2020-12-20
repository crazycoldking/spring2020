package org.codeboy.controller;

import org.codeboy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controllerA")
public class BookController {
    @Autowired
    private BookService bookService;

    @Override
    public String toString() {
        return "BookController{" +
                "bookService=" + bookService +
                '}';
    }
}
