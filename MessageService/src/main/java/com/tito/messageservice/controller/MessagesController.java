package com.tito.messageservice.controller;

import com.tito.messageservice.dto.MessageDTO;
import com.tito.messageservice.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/messages")
public class MessagesController {
    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<MessageDTO> getMessages() {
        return messageService.getMessages();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public MessageDTO getMessage(@PathVariable(name = "id", required = true) int id) {
        return messageService.getMessage(id);
    }

    @RequestMapping(path = "/random", method = RequestMethod.GET)
    @ResponseBody
    public MessageDTO getRandomMessage() {
        return messageService.getRandomMessage();
    }
}
