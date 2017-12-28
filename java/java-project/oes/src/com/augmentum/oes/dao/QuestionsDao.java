package com.augmentum.oes.dao;

import java.util.List;

import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;

public interface QuestionsDao {

    public List<Questions> fuzzyQuery(Pagination pagination);

    public void batchDelete(String idDelete);

    public void saveQuestions(final Questions que);

    public void updateQuestions(final Questions que);

    public Questions searchQuestionsById(int id);

    public int getQuestionsTotalCountFuzz(String keyWord);
}
