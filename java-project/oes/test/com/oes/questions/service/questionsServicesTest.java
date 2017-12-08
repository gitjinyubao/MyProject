package com.oes.questions.service;

import java.util.List;

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
import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;
import com.augmentum.oes.service.QuestionsServices;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:oes-mvc.xml"})
public class questionsServicesTest extends AbstractTransactionalJUnit4SpringContextTests {

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
    public void testListQuestionsPagination() {
        QuestionsServices questionsServices = (QuestionsServices) this.applicationContext.getBean("questionsServices");
        Pagination pagination = new Pagination();
        List<Questions> list = questionsServices.listQuestionsPagination(pagination);
        Assert.assertNotNull(list);
    }

    @Test
    public void testSearchQuestionsById() {
        QuestionsServices questionsServices = (QuestionsServices) this.applicationContext.getBean("questionsServices");
        /*Pagination pagination = new Pagination();*/
        Questions questions = questionsServices.searchQuestionsById(2);
        Assert.assertNull(questions);
    }

    @Test
    public void testBatchDelete() {
        QuestionsServices questionsServices = (QuestionsServices) this.applicationContext.getBean("questionsServices");
        Pagination pagination = new Pagination();
        List<Questions> list = questionsServices.listQuestionsPagination(pagination);
        Assert.assertNotNull(list);
    }
}
