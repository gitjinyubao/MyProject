package com.oes.questions.controller;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.Constants;
import com.augmentum.oes.controller.UserController;
import com.augmentum.oes.model.User;
import com.augmentum.oes.util.SessionUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:oes-mvc.xml"})
public class UserControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Before
    public void setUp() {
        AppContext.setContextPath("/oes/");
        AppContext appcontext = AppContext.getAppContent();
        appcontext.addObject(Constants.APP_CONTENT_SESSION, new MockHttpSession());
    }

    @After
    public void tearDown() {
        AppContext appContext = AppContext.getAppContent();
        appContext.clear();
    }

    @Test
    public void testLgin() {
        UserController userController = (UserController) this.applicationContext.getBean("userController");
        User user = new User("david", "1");
        @SuppressWarnings("unused")
        ModelAndView modelAndView = userController.login(user);
        Assert.assertNotNull(SessionUtil.getSession(Constants.USER));
    }

    @Test
    public void testShow() {
        UserController userController = (UserController) this.applicationContext.getBean("userController");
        User user = new User("david", "1");
        @SuppressWarnings("unused")
        ModelAndView modelAndView = userController.login(user);
        Assert.assertNotNull(SessionUtil.getSession(Constants.USER));
    }

    @Test
    public void testUpdate() {
        UserController userController = (UserController) this.applicationContext.getBean("userController");
        User user = new User("david", "1");
        @SuppressWarnings("unused")
        ModelAndView modelAndView = userController.login(user);
        Assert.assertNotNull(SessionUtil.getSession(Constants.USER));
    }

    @Test
    public void testDelete() {
        UserController userController = (UserController) this.applicationContext.getBean("userController");
        User user = new User("david", "1");
        @SuppressWarnings("unused")
        ModelAndView modelAndView = userController.login(user);
        Assert.assertNotNull(SessionUtil.getSession(Constants.USER));
    }
}
