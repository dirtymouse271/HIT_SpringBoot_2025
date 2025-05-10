package org.example.baikiemtragiuaky.service;

import org.example.baikiemtragiuaky.domain.dto.request.RequestAuthorDTO;
import org.example.baikiemtragiuaky.domain.dto.response.ResponseAuthorDTO;
import org.example.baikiemtragiuaky.domain.entity.Author;

import java.util.List;

public interface AuthorService {
    public ResponseAuthorDTO createAuthor(RequestAuthorDTO requestAuthorDTO);
    public Author updateAuthor(int id);
    public void deleteAuthor(int id);
    public Author findAuthorById(int id);
    public List<Author> findAllAuthors();
}
