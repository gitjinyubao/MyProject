package com.oes.questions.controller;

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
import com.augmentum.oes.controller.QuestionsController;
import com.augmentum.oes.controller.UserController;
import com.augmentum.oes.model.Questions;
import com.augmentum.oes.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:oes-mvc.xml"})
public class QuestionsControllerTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Before
    public void setUp() {
        AppContext.setContextPath("/oes/");
        AppContext appcontext = AppContext.getAppContent();
        appcontext.addObject(Constants.APP_CONTENT_SESSION, new MockHttpSession());
        UserController userController = (UserController) this.applicationContext.getBean("userController");
        User user = new User("david", "1");
        @SuppressWarnings("unused")
        ModelAndView modelAndView = userController.login(user);
    }

    @After
    public void tearDown() {
        AppContext appContext = AppContext.getAppContent();
        appContext.clear();
    }

    @Test
    public void testLgin() {
        QuestionsController qutstionsController = (QuestionsController) this.applicationContext.getBean("questionsController");
        Questions questions1 = new Questions("Q123456",
                "1", "2",
                "3", "4", "A",
                1,
                "aaaaaaa");
        ModelAndView modelAndView = qutstionsController.save("create", questions1);
        System.out.println(modelAndView.getViewName());
    }
}
