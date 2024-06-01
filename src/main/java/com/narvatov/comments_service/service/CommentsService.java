package com.narvatov.comments_service.service;

import com.narvatov.comments_service.dao.CommentsDao;
import com.narvatov.comments_service.dto.request.CreateComment;
import com.narvatov.comments_service.dto.request.UpdateComment;
import com.narvatov.comments_service.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

    @Autowired
    private CommentsDao dao;

    public Comment add(CreateComment createComment) {
        return dao.save(new Comment(createComment));
    }

    public Comment update(UpdateComment updateComment) {
//        if (!verifyEditorIsAuthor(editor, updateComment.getId())) return "Editor id " + editor.getId() + " doesn't correspond to original author id.";

        return dao.update(updateComment.getId(), updateComment.getText());
    }

    public int delete(int id) {
//        if (!(verifyEditorIsAuthor(editor, id) || editor.getRole() == Role.ROLE_ADMIN)) {
//            return "Editor is not admin. And as user it's id " + editor.getId() + " doesn't correspond to original author id.";
//        }

        dao.deleteById(id);

        return id;
    }

}
