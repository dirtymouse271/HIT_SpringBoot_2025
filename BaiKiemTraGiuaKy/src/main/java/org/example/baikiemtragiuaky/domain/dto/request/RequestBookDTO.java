package org.example.baikiemtragiuaky.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestBookDTO {
    @NotNull
    private String name;

    private String description;

    private double price;
}
