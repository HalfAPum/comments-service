package com.narvatov.comments_service.model;

import com.narvatov.comments_service.dto.request.CreateComment;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String text;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;
    private int authorId;
    private int newsId;

    public Comment(CreateComment createComment) {
        text = createComment.getText();
        creationDate = LocalDateTime.now();
        updateDate = creationDate;
        authorId = createComment.getUserId();
        newsId = createComment.getNewsId();
    }

}
