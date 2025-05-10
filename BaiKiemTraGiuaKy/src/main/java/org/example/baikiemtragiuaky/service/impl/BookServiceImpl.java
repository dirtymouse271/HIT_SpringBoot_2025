package org.example.baikiemtragiuaky.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.baikiemtragiuaky.domain.entity.Author;
import org.example.baikiemtragiuaky.domain.entity.Book;
import org.example.baikiemtragiuaky.domain.entity.Category;
import org.example.baikiemtragiuaky.repository.BookRepository;
import org.example.baikiemtragiuaky.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book crateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(int id) {
        Book book = new Book();
        if (bookRepository.existsById(id)) {
            book = bookRepository.getById(id);
            book.setName(book.getName());
            book.setDescription(book.getDescription());
            book.setPrice(book.getPrice());
        }
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBooksByName(String name) {
        return bookRepository.findAll().stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksByPrice(double price) {
        return bookRepository.findAll().stream().filter(book -> book.getPrice() == price).collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return bookRepository.findAll().stream().filter(book -> book.getAuthor().getName() == author).collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksByCategory(String category) {
        return bookRepository.findAll().stream().filter(book -> book.getCategory().getName() == category).collect(Collectors.toList());
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }
}
