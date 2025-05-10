package org.example.baikiemtragiuaky.service;

import org.example.baikiemtragiuaky.domain.entity.Author;
import org.example.baikiemtragiuaky.domain.entity.Book;
import org.example.baikiemtragiuaky.domain.entity.Category;

import java.util.List;

public interface BookService {
    public Book crateBook(Book book);
    public Book updateBook(int id);
    public void deleteBook(int id);
    public List<Book> getAllBooksByName(String name);
    public List<Book> getAllBooksByPrice(double price);
    public List<Book> getAllBooksByAuthor(String author);
    public List<Book> getAllBooksByCategory(String category);
    public Book getBookById(int id);


}
