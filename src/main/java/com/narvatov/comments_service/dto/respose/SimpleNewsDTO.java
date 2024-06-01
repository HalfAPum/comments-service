package com.narvatov.comments_service.dto.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class SimpleNewsDTO {

    private int id;
    private String headline;
    private String content;
    private SimpleUserDTO author;
    @JsonProperty("creation_date")
    private LocalDateTime creationDate;
    private String category;

}
