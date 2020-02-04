package com.tito.messageservice.services;

import com.tito.messageservice.dto.MessageDTO;

import java.util.List;

public interface MessageService {
    List<MessageDTO> getMessages();
    MessageDTO getMessage(int id);
    MessageDTO getRandomMessage();
}
