package ru.turulin.SpringMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first") // дополнительный префикс в маппинге.
// То есть ссылка будет выглядеть ../first/hello
public class FirstController {

    @GetMapping("/hello")
    //HttpServletRequest request содержит все сведения об http запросе
//    public String helloPage(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//        System.out.println("Hello, " + name + " " + surname);
//        return "first/hello";
//    }

    //@RequestParam("name") требует нужный параметр в http запросе.
    //В случае если таких параметров нет, генерируется ошибка.
    //Для избежания такой используют required = false
    //Данный способ более предпочтителен, если кроме параметров ничего нет.

    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }
    @GetMapping("/goodBye")
    public String goodByePage() {

        return "first/goodBye";
    }
}
