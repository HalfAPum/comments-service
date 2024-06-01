package com.narvatov.comments_service.dto.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.narvatov.comments_service.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentNewsDTO {

    private int id;
    private String text;
    @JsonProperty("creation_date")
    private LocalDateTime creationDate;
    @JsonProperty("update_date")
    private LocalDateTime updateDate;
    private SimpleNewsDTO news;

    public CommentNewsDTO(Comment comment, SimpleNewsDTO news) {
        id = comment.getId();
        text = comment.getText();
        creationDate = comment.getCreationDate();
        updateDate = comment.getUpdateDate();

        this.news = news;
    }

}

