package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //웹어플리케이션에서 hello로 들오오면 해당 메서드 호출
    public String hello(Model model) {
        model.addAttribute("data","hello!!!");
        return "hello";

    }
}
