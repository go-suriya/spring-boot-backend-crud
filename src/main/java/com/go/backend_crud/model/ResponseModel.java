package com.go.backend_crud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonPropertyOrder({"result", "statusCode", "statusMessage", "data"})
@AllArgsConstructor
public class ResponseModel {

    @JsonProperty("result")
    private final boolean result;

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("statusMessage")
    private final String statusMessage;

    private final Object data;
}
