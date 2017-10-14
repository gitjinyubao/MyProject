package com.augmentum.oes.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augmentum.oes.dao.QuestionsDao;
import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;
import com.augmentum.oes.service.QuestionsServices;
@Service("questionsServices")
public class QuestionsServicesImpl implements QuestionsServices {

    @Autowired
    private QuestionsDao questionsDao;

    public void setQuestionsDao(QuestionsDao questionsDao) {
        this.questionsDao = questionsDao;
    }

    @Override
    public List<Questions> listQuestionsPagination(Pagination pagination) {

        if (pagination.getCurrentPage() == 0) {
            pagination.setCurrentPage(1);
        }

        if (pagination.getPageSize() == 0) {
            pagination.setPageSize(10);
        }

        int currPag = pagination.getCurrentPage();

        if (currPag < 1) {
            currPag = 1;
        }

        List<Questions> questions = new ArrayList<Questions>();
        questions = questionsDao.fuzzyQuery(pagination);

        return questions;
    }

    @Override
    public void batchDelete(String idDelete) {
        questionsDao.batchDelete(idDelete);
    }

    @Override
    public void saveQuestions(Questions que) {
        questionsDao.saveQuestions(que);
    }

    @Override
    public void updateQuestions(Questions que) {
        questionsDao.updateQuestions(que);
   }

    @Override
    public Questions searchQuestionsById(int id) {
        return questionsDao.searchQuestionsById(id);
    }

    @Override
    public int getQuestionsTotalCountFuzz(String keyWord) {
        return questionsDao.getQuestionsTotalCountFuzz(keyWord);
    }
}
