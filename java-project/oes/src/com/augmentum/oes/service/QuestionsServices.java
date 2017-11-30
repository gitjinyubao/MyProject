package com.augmentum.oes.service;

import java.util.List;

import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;

public interface QuestionsServices {
    public List<Questions> listQuestionsPagination(Pagination pagination);

    public void batchDelete(String idDelete);

    public void saveQuestions(Questions que);

    public void updateQuestions(Questions que);

    public Questions searchQuestionsById(int id);

    public int getQuestionsTotalCountFuzz(String keyWord);
}
