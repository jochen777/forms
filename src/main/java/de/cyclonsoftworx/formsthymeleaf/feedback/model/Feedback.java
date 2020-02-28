package de.cyclonsoftworx.formsthymeleaf.feedback.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class Feedback {
    String firstname;

    @NotNull
    @Size(min=2, max=30)
    String lastname;

    LocalDate birthday;

    String email;

    String text;

    boolean optin;
}
