package com.codecool.web.service;

import com.codecool.web.model.Email;

import java.util.ArrayList;
import java.util.List;

public final class EmailService {

    private List<Email> emails = new ArrayList<>();

    public void addEmail(Email email) {emails.add(email);}

    public List<Email> getEmails() {return emails;}
}
