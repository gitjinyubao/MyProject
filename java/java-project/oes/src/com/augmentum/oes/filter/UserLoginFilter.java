package com.augmentum.oes.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.augmentum.oes.model.User;
import com.augmentum.oes.util.StringUtil;

public class UserLoginFilter implements Filter{

    //create urL array which is no need check
    private String url [] = {"/user/login"};
    private String staticSources [] = {".js", ".css", ".png"};

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException,
            ServletException {
        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;

        //get request path
        String path = request.getServletPath();
        //check request path is the urL witch is no need check
        Boolean flag = false;
        for(int j = 0; j < url.length; ++j){
            if(path.equals(url[j])){
                flag = true;
            }
        }

        for (String staticSource : staticSources) {
            if (!StringUtil.isEmpty(path)) {
                if (path.endsWith(staticSource)) {
                    flag = true;
                }
            }
        }

        //if flag is true,filter does not handle
        if (flag) {
            arg2.doFilter(arg0, arg1);
        } else {
            //1:get the user object from session
            User user = (User) request.getSession().getAttribute("user");

            //2:check user object
            if(user != null) {
                //if it is not empty,filter does not handle
                arg2.doFilter(arg0, arg1);
            } else {
                //if it is empty,arrive login page
                response.sendRedirect(request.getContextPath() + "/" + "user/login");
            }
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
}
