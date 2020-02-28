package de.cyclonsoftworx.formsthymeleaf.feedback.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Feedback {
    String firstname;
    String lastname;
    LocalDate birthday;
    String email;
    String text;
    boolean optin;
}
