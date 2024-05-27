package com.go.backend_crud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonPropertyOrder({"result", "status_code", "status_message", "data"})
@AllArgsConstructor
public class ResponseModel {

    @JsonProperty("result")
    private final boolean result;

    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("status_message")
    private final String statusMessage;

    private final Object data;
}
