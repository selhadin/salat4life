package com.tito.messageservice.services;

import com.tito.messageservice.dto.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StaticMessageService implements MessageService {
    private static final List<MessageDTO> messages = Arrays.asList(
            new MessageDTO(1, "hej på dig"),
            new MessageDTO(2, "hej på dig igen"),
            new MessageDTO(3, "Hej då"));

    @Override
    public List<MessageDTO> getMessages() {
        return messages;
    }

    @Override
    public MessageDTO getMessage(int id) {
        Optional<MessageDTO> messageOptional = messages.stream().filter(message -> id == message.getId()).findFirst();
        if(messageOptional.isPresent()) {
            return messageOptional.get();
        }
        return null;
    }

    @Override
    public MessageDTO getRandomMessage() {
        return getMessage(2);
    }
}
