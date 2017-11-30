package com.augmentum.oes.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.augmentum.oes.dao.QuestionsDao;
import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;

public class QuestionsDaoImpl extends SqlSessionDaoSupport implements QuestionsDao {
    private static final String CLASS_NAME = Questions.class.getName();
    private static final String SQL_ID_QUE__FUZZY_QUERY = ".fuzzyQuery";
    private static final String SQL_ID_QUE__BATCH_DELETE = ".batchDelete";
    private static final String SQL_ID_QUE__SAVE_QUESTIONS = ".saveQuestions";
    private static final String SQL_ID_QUE__UPDATE_QUESTIONS = ".updateQuestions";
    private static final String SQL_ID_QUE__SEARCH_QUESTIONS_BY_ID = ".searchQuestionsById";
    private static final String SQL_ID_QUE__GET_QUE_TOTAL_COUNT = ".getQuestionsTotalCountFuzz";

    @Override
    public List<Questions> fuzzyQuery(Pagination pagination) {
        return getSqlSession().selectList(CLASS_NAME + SQL_ID_QUE__FUZZY_QUERY, pagination);
    }

    @Override
    public void batchDelete(String idDelete) {
        getSqlSession().delete(CLASS_NAME + SQL_ID_QUE__BATCH_DELETE, idDelete);
    }

    @Override
    public void saveQuestions(Questions que) {
        getSqlSession().insert(CLASS_NAME + SQL_ID_QUE__SAVE_QUESTIONS, que);
    }

    @Override
    public void updateQuestions(Questions que) {
        getSqlSession().update(CLASS_NAME + SQL_ID_QUE__UPDATE_QUESTIONS, que);
    }

    @Override
    public Questions searchQuestionsById(int id) {
        return getSqlSession().selectOne(CLASS_NAME + SQL_ID_QUE__SEARCH_QUESTIONS_BY_ID, id);
    }

    @Override
    public int getQuestionsTotalCountFuzz(String keyWord) {
        return getSqlSession().selectOne(CLASS_NAME + SQL_ID_QUE__GET_QUE_TOTAL_COUNT, keyWord);
    }

}
