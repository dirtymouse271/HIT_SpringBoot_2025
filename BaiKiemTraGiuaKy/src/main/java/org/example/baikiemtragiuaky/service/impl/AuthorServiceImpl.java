package org.example.baikiemtragiuaky.service.impl;

import jakarta.persistence.OneToMany;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.baikiemtragiuaky.domain.dto.request.RequestAuthorDTO;
import org.example.baikiemtragiuaky.domain.dto.response.ResponseAuthorDTO;
import org.example.baikiemtragiuaky.domain.entity.Author;
import org.example.baikiemtragiuaky.domain.entity.Book;
import org.example.baikiemtragiuaky.domain.mapper.AuthorMapper;
import org.example.baikiemtragiuaky.repository.AuthorRepository;
import org.example.baikiemtragiuaky.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public ResponseAuthorDTO createAuthor(RequestAuthorDTO requestAuthorDTO) {
        Author author = authorMapper.toUser(requestAuthorDTO);
        Author saveAuthor = authorRepository.save(author);
        return authorMapper.toResponseAuthorDTO(saveAuthor);
    }

    @Override
    public Author updateAuthor(int id) {
        Author author = new Author();
        if (authorRepository.existsById(id)) {
            author = authorRepository.getById(id);
            author.setName(author.getName());
            author.setDob(author.getDob());
            author.setBio(author.getBio());
        }
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author findAuthorById(int id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
