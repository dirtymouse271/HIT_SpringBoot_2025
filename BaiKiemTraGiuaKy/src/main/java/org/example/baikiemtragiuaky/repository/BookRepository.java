package org.example.baikiemtragiuaky.repository;

import org.example.baikiemtragiuaky.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
