package com.augmentum.oes.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.Constants;
import com.augmentum.oes.exception.ParameterException;
import com.augmentum.oes.exception.ServiceException;
import com.augmentum.oes.model.User;
import com.augmentum.oes.service.UserService;
import com.augmentum.oes.util.StringUtil;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(User user
                              ) {
        ModelAndView modelAndView = new ModelAndView();

        if (StringUtil.isEmpty(user.getUserName()) && StringUtil.isEmpty(user.getPassword())) {
            modelAndView.setViewName(Constants.LOGIN);
            return modelAndView;
        }

        //call method of login to get user object
        try {
            user = userService.login(user.getUserName(), user.getPassword());

            //arrive login success page
            this.addSession(Constants.USER, user);
            modelAndView.setView(new RedirectView(AppContext.getContextPath() + "/" + Constants.QUE_SHOW));
        } catch (ParameterException parameterException) {
            Map<String, String> errorMap = parameterException.getErrorMap();
            modelAndView.addObject(Constants.ERROR_MAP, errorMap);
            modelAndView.setView(new RedirectView(AppContext.getContextPath() + "/" + Constants.LOGIN));
        } catch (ServiceException serviceException) {
            modelAndView.addObject(Constants.USER_ERROR_MESSAGE, serviceException.getMessage() + "[" + serviceException.getCode() + "]");
            modelAndView.setViewName(Constants.LOGIN);
        }

        return modelAndView;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        //clear user object
        this.removeSession(Constants.USER);
        //return to login page
        modelAndView.setViewName(Constants.LOGIN);

        return modelAndView;
    }
}
