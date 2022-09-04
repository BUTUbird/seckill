package org.butu.controller;


import lombok.extern.slf4j.Slf4j;
import org.butu.service.UserService;
import org.butu.vo.LoginVo;
import org.butu.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author BUTUbird
 */
@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


    /**
     * 登录
     * @param loginVo
     * @return
     */

   @PostMapping("/doLogin")
   @ResponseBody
    public RespBean doLogin(@Valid LoginVo loginVo){
        log.info(loginVo.toString());
        return userService.login(loginVo);
   }
}
