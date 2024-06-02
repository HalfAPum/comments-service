package com.narvatov.comments_service.mapper

import com.narvatov.comments_service.dto.respose.CommentDTO
import com.narvatov.comments_service.dto.respose.SimpleUserDTO
import com.narvatov.comments_service.model.Comment

fun List<Comment>.mapToSimpleNewsDTO(authors: List<SimpleUserDTO>) = mapIndexed { index, news ->
    CommentDTO(news, authors.getOrNull(index))
}