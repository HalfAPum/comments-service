package com.narvatov.comments_service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UpdateComment {

    private int id;
    private String text;

}
