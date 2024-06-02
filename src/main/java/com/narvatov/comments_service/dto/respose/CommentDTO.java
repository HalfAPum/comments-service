package com.narvatov.comments_service.dto.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.narvatov.comments_service.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentDTO {

    private int id;
    private String text;
    @JsonProperty("creation_date")
    private LocalDateTime creationDate;
    private SimpleUserDTO author;

    public CommentDTO(Comment comment, SimpleUserDTO author) {
        id = comment.getId();
        text = comment.getText();
        creationDate = comment.getCreationDate();
        this.author = author;
    }

}
