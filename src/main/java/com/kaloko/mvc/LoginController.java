package com.kaloko.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam("username") String userName, @RequestParam("password") String password, ModelMap model,
                        HttpServletRequest request, HttpServletResponse response){


        return null;
    }
}