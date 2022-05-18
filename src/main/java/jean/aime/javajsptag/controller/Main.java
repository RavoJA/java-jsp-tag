package jean.aime.javajsptag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class Main {

    @GetMapping("/hello")
    public ModelAndView welcome(Map<String, Object> model) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Baseball");
        list.add("Basketball");
        list.add("Cricket");
        model.put("list", list);
        return new ModelAndView("person");
    }
}
