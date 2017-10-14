package com.augmentum.oes.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.model.User;
import com.augmentum.oes.util.SessionUtil;

public class BaseController {
    private Logger loger = Logger.getLogger(BaseController.class);

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception e) {
        loger.error(e.getMessage(), e);
        ModelAndView modelAndView = new ModelAndView(this.getRedirectView("500.html"));
        return modelAndView;
    }

    protected User getUser() {
        return AppContext.getAppContent().getUser();
    }

    public int getUserId() {
        User user = getUser();
        if (user != null) {
            return user.getId();
        }
        return 0;
    }

    public String getUserName() {
        User user = getUser();
        if (user != null) {
            return user.getUserName();
        }

        return null;
    }

    protected RedirectView getRedirectView(String path) {
        return new RedirectView(AppContext.getContextPath() + "/" +path);
    }

    protected void addSession(String key, Object object) {
        SessionUtil.addsession(key, object);
    }

    protected Object getSession(String key) {
        return SessionUtil.getSession(key);
    }

    protected void removeSession(String key) {
        SessionUtil.removeSession(key);
    }

    public void invilidateSession(){
        SessionUtil.invilidateSession();
    }
}
