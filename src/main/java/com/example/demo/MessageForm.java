package com.example.demo;

public class MessageForm {
    private String animalName;
    private String adjective;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }


    public MessageForm(String animalName, String adjective) {
        this.animalName = animalName;
        this.adjective = adjective;
    }

    public MessageForm() {
    }

    @Override
    public String toString() {
        return "Animal Name: " + this.animalName + " Adjective: " + this.adjective;
    }
}
