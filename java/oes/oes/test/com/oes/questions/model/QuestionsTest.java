package com.oes.questions.model;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.augmentum.oes.AppContext;
import com.augmentum.oes.Constants;
import com.augmentum.oes.model.Questions;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:oes-mvc.xml"})
public class QuestionsTest extends AbstractTransactionalJUnit4SpringContextTests {

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
        Questions questions = (Questions)   this.applicationContext.getBean("questions");
        questions.setId(2);
        Assert.assertEquals(questions.getId(), 2);
    }
}
