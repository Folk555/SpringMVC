package ru.turulin.SpringMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first") // дополнительный префикс в маппинге.
// То есть ссылка будет выглядеть ../first/hello
public class FirstController {

    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }
    @GetMapping("/goodBye")
    public String goodByePage() {
        return "first/goodBye";
    }
}
