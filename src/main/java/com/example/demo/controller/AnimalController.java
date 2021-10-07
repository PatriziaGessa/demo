package com.example.demo.controller;

import com.example.demo.MessageForm;
import com.example.demo.service.MessageListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {


    private MessageListService messageListService;

    public AnimalController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }


    @GetMapping
    public String getAnimal(MessageForm messageForm, Model model) {
        model.addAttribute("greetings", this.messageListService.getMessageForms());
        return "animal";
    }

    @PostMapping
    public String addAnimal(MessageForm messageForm, Model model) {
        System.out.println("---------------------------------------");
        System.out.println(messageForm.getAdjective());
        System.out.println(messageForm.getAnimalName());
        System.out.println("---------------------------------------");
        messageListService.addMessage(messageForm);
        model.addAttribute("greetings", messageListService.getMessageForms());
        messageForm.setAdjective("");
        messageForm.setAnimalName("");
        return "animal";
    }
}
