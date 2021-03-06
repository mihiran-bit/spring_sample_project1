package com.example_spring.chathu.firstDay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class FirstDayController {

    @GetMapping("/first")
    public String first(Model model){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        model.addAttribute("day",localDate);
        return "firstDay/firstDay";
    }
}
