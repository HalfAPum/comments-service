package com.narvatov.comments_service.controller;

import com.narvatov.comments_service.dto.request.CreateComment;
import com.narvatov.comments_service.dto.request.UpdateComment;
import com.narvatov.comments_service.model.Comment;
import com.narvatov.comments_service.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/comments")
public class Controller {

    @Autowired
    private CommentsService service;

    @PostMapping("add")
    public Comment add(@RequestBody CreateComment createComment) {
        return service.add(createComment);
    }

    @PutMapping("update")
    public Comment update(@RequestBody UpdateComment updateComment) {
        return service.update(updateComment);
    }

    @DeleteMapping("delete/{id}")
    public int delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

}
