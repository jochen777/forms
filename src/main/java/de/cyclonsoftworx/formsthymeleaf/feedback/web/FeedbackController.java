package de.cyclonsoftworx.formsthymeleaf.feedback.web;

import de.cyclonsoftworx.formsthymeleaf.feedback.model.Feedback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller()
@Slf4j
public class FeedbackController {


    @GetMapping("/feedback")
    public String form(Feedback feedback) {
        return "feedback/form";
    }

    @PostMapping("/feedback")
    public String checkPersonInfo(@Valid Feedback form, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "feedback/form";
        }

        log.debug("Sucessful entered form: " + form);

        return "redirect:/feedback/result";
    }

    @GetMapping("/feedback/result")
    public String result() {
        return "feedback/result";
    }

}
