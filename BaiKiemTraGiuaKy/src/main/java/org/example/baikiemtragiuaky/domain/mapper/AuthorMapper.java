package org.example.baikiemtragiuaky.domain.mapper;

import org.example.baikiemtragiuaky.domain.dto.request.RequestAuthorDTO;
import org.example.baikiemtragiuaky.domain.dto.response.ResponseAuthorDTO;
import org.example.baikiemtragiuaky.domain.entity.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
        Author toUser(RequestAuthorDTO requestAuthorDTO);
        ResponseAuthorDTO toResponseAuthorDTO(Author author);
        List<ResponseAuthorDTO> responseAuthorDTO(List<Author> authorList);
}
