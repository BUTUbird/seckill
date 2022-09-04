package org.butu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BUTUbird
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    /**
     * 测试页面跳转
     */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","butu");
        return "hello";
    }
}
