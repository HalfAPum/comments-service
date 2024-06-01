package com.narvatov.comments_service.dto.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.narvatov.comments_service.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentAuthorDTO {

    private int id;
    private String text;
    @JsonProperty("creation_date")
    private LocalDateTime creationDate;
    @JsonProperty("update_date")
    private LocalDateTime updateDate;
    private SimpleUserDTO author;

    public CommentAuthorDTO(Comment comment, SimpleUserDTO author) {
        id = comment.getId();
        text = comment.getText();
        creationDate = comment.getCreationDate();
        updateDate = comment.getUpdateDate();

        this.author = author;
    }

}
