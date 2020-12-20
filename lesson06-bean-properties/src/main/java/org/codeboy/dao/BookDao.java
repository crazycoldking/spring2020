package org.codeboy.dao;

import org.codeboy.bean.Book;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository("daoA")
public class BookDao {

    private String label = "bookDB";

    private List<Book> bookList;

    public BookDao(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BookDao() {
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("> BookDao PostConstruct");
        bookList = new ArrayList<>();
        bookList.add(new Book("Java Core", "Tech", 123.0F));
        bookList.add(new Book("Spring Framework", "Tech", 45.7F));
        bookList.add(new Book("Fairy Tales", "Story", 23.0F));
        bookList.add(new Book("The Little Prince", "Story", 12.0F));

    }
}
