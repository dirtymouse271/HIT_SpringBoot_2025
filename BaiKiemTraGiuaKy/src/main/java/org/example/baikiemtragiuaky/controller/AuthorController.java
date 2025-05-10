package org.example.baikiemtragiuaky.controller;

import lombok.RequiredArgsConstructor;
import org.example.baikiemtragiuaky.base.RestApiV1;
import org.example.baikiemtragiuaky.constant.UrlConstantAuthor;
import org.example.baikiemtragiuaky.domain.dto.request.RequestAuthorDTO;
import org.example.baikiemtragiuaky.domain.entity.Author;
import org.example.baikiemtragiuaky.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestApiV1
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping(UrlConstantAuthor.CREATE_AUTHOR)
    public ResponseEntity<?> createAuthor(@RequestBody RequestAuthorDTO requestAuthorDTO) {
        return HttpStatus.OK(authorService.createAuthor());
    }
}
