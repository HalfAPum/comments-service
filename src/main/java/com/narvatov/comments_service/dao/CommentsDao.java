package com.narvatov.comments_service.dao;

import com.narvatov.comments_service.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsDao extends JpaRepository<Comment, Integer> {

    @Query(value = "UPDATE Comment SET text = ?2 WHERE id = ?1", nativeQuery = true)
    Comment update(int id, String text);

    List<Comment> findAllByNewsId(int newsId);

}
