package de.cyclonsoftworx.formsthymeleaf.feedback.web;

import de.cyclonsoftworx.formsthymeleaf.feedback.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeedbackController {

    @GetMapping("/feedback")
    public String form(Feedback feedback) {
        return "feedback/form";
    }
}
