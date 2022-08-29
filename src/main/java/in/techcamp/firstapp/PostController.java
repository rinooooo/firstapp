package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(){
        return "hello";
    }
    @GetMapping
    public String showList(){
        return "index";
    }
}