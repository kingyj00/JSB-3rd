package com.mysite.sbb;
//check
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/start")
    @ResponseBody
    public String index() {
        return "스프링부트 게시판 만들기 프로젝트 시작.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}