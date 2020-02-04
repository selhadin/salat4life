package com.tito.messageservice.dto;

public class MessageDTO {
    private int id;
    private String message;

    public MessageDTO(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
