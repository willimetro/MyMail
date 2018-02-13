package com.wugaldeq.udemy.mymail.model;

/**
 * Clase "model" que representa un correo en la aplicación
 * Created by wugaldeq on 13-02-2018.
 */

public class Mail {
    private String subject;
    private String message;
    private String emailAdress;
    private String color;
    
    public Mail(String subject, String message, String emailAdress, String color) {
        this.subject = subject;
        this.message = message;
        this.emailAdress = emailAdress;
        this.color = color;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
