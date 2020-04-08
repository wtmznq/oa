package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FirstController {

    @GetMapping("req/{path}")
    public String req(@PathVariable String path){
        return path;
    }
}
