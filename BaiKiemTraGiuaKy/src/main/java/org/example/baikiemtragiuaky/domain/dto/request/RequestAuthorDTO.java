package org.example.baikiemtragiuaky.domain.dto.request;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestAuthorDTO {
    @NotNull
    private String name;

    @NotNull
    private String dob;

    private String bio;
}
