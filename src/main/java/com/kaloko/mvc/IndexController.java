package com.kaloko.mvc;

import com.kaloko.model.View;
import com.kaloko.service.UserService;
import com.kaloko.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by enpfeff on 3/16/14.
 */
@Controller
public class IndexController {

    private static final String INDEX = "index";

    @Autowired
    UserService userService;

    @Autowired
    ViewService viewService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexView(ModelMap model, HttpServletRequest request, HttpServletResponse response){

        //add view
        View view = viewService.getViewByPageName(INDEX);
        model.addAttribute("view", view);

        //add menu titles
        model.addAttribute("titles", viewService.getMenuTitles(view));

        return view.getPageName();
    }
}
