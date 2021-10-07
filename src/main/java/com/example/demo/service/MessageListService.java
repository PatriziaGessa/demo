package com.example.demo.service;


import com.example.demo.MessageForm;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {

    private List<MessageForm> messageForms;

    public List<MessageForm> getMessageForms() {
        return new ArrayList<>(messageForms);
    }

    public void addMessage(MessageForm messageForm) {
        messageForms.add(messageForm);
    }

    @PostConstruct
    public void init() {
        this.messageForms = new ArrayList<MessageForm>();
    }



}
