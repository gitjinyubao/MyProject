package com.augmentum.oes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.augmentum.oes.Constants;
import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;
import com.augmentum.oes.model.User;
import com.augmentum.oes.service.QuestionsServices;
import com.augmentum.oes.util.StringUtil;
@Controller
@RequestMapping(value = "/questions")
public class QuestionsController extends BaseController {
    @Autowired
    private QuestionsServices questionsServices;

    public void setQuestionsServices(QuestionsServices questionsServices) {
        this.questionsServices = questionsServices;
    }

    @RequestMapping(value = "/save")
    public ModelAndView save(@RequestParam(value = "way", defaultValue = "") String way,
                             Questions questions
                             ) {
        ModelAndView modelAndView = new ModelAndView();

        if (Constants.CREATE_PAGE.equals(way)) {
            modelAndView.addObject("idNumber", getQueIdNumber());
            modelAndView.setViewName(Constants.CREATE_QUE);
        }

        if (Constants.CREATE.equals(way)) {
            String content = questions.getQueA() + questions.getQueB() + questions.getQueC() +
                             questions.getQueD() + questions.getQueTitle();
            if (StringUtil.isContainChinese(content)) {
                modelAndView.addObject(Constants.MESSAGE, Constants.FAILUE_MESSAGE);
            } else {
                questions.setIdNumber(getQueIdNumber());
                User user = (User) this.getSession(Constants.USER);
                questions.setContSysId(user.getId());
                questionsServices.saveQuestions(questions);
                modelAndView.addObject(Constants.MESSAGE, Constants.SUCCESS_MESSAGE);
            }
            modelAndView.addObject("questions", questions);
            modelAndView.setViewName(Constants.CREATE_QUE);
        }

        if (Constants.CANCEL.equals(way)) {
            modelAndView.setView(new RedirectView(Constants.QUE_SHOW_RESPONSE));
        }

        return modelAndView;
    }

    @RequestMapping(value = "/delete")
    public ModelAndView delete(@RequestParam(value = "way", defaultValue = "") String way,
                                             Pagination pagination,
                                             @RequestParam(value = "deleteId", defaultValue = "") String deleteIdString
                                             ) {
        ModelAndView modelAndView = new ModelAndView();

        if (!StringUtil.isEmpty(deleteIdString)) {
            questionsServices.batchDelete(deleteIdString);
        }

        if ("delete".equals(way)) {
            modelAndView.setView(new RedirectView(Constants.QUE_SHOW_RESPONSE));
            return modelAndView;
        }

        if (!StringUtil.isEmpty(pagination.getKeyWord())) {
            pagination.setTotalCount(questionsServices.getQuestionsTotalCountFuzz(pagination.getKeyWord()));
        } else {
            pagination.setTotalCount(questionsServices.getQuestionsTotalCountFuzz(""));
        }

        if (pagination.getCurrentPage() > pagination.getPageCount()) {
            pagination.setCurrentPage(pagination.getCurrentPage() - 1);
        }

        //return exit page
        List<Questions> questions = new ArrayList<Questions>();
        questions = questionsServices.listQuestionsPagination(pagination);

        if (questions.isEmpty()) {
            pagination.setCurrentPage(0);
        }

        modelAndView.addObject(Constants.QUESTIONS, questions);
        modelAndView.addObject(Constants.PAGINATION, pagination);
        modelAndView.addObject(Constants.KEYWORDS, pagination.getKeyWord());
        modelAndView.setViewName(Constants.EDIT_QUE);

        return modelAndView;
    }

    @RequestMapping(value = "/update")
    public ModelAndView update(@RequestParam(value = "way", defaultValue = "") String way,
                               Questions questions
                               ) {
        ModelAndView modelAndView = new ModelAndView();

        if (Constants.UPDATE.equals(way)) {

            String content = questions.getQueA() + questions.getQueB() + questions.getQueC() +
                    questions.getQueD() + questions.getQueTitle();
            if (StringUtil.isContainChinese(content)) {
                modelAndView.addObject(Constants.MESSAGE, Constants.FAILUE_MESSAGE);
            } else {
                User user = (User) this.getSession(Constants.USER);
                questions.setContSysId(user.getId());
                questionsServices.updateQuestions(questions);
                modelAndView.addObject("questions", questions);
                modelAndView.addObject(Constants.MESSAGE, Constants.SUCCESS_MESSAGE);
            }
            modelAndView.setViewName(Constants.UPDATE_QUE);
        }

        if (Constants.CANCEL.equals(way)) {
            modelAndView.setView(new RedirectView(Constants.QUE_SHOW_RESPONSE));
        }

        return modelAndView;
    }

    @RequestMapping(value = "/show")
    public ModelAndView show(Pagination pagination) {
        ModelAndView modelAndView = new ModelAndView();

        if (pagination.getPageSize() == 0) {
            pagination.setPageSize(10);
        }

        if(StringUtil.isEmpty(pagination.getKeyWord())) {
            pagination.setKeyWord("");
        } else {
            if (StringUtil.isContainChinese(pagination.getKeyWord())) {
                pagination.setKeyWord("");
                modelAndView.addObject(Constants.MESSAGE, Constants.FAILUE_MESSAGE);
            }
        }

        pagination.setTotalCount(questionsServices.getQuestionsTotalCountFuzz(pagination.getKeyWord()));

        if (pagination.getCurrentPage() == 0) {
            pagination.setCurrentPage(1);
        }

        if (pagination.getCurrentPage() > pagination.getPageCount()) {
            pagination.setCurrentPage(pagination.getPageCount());
        }

        List<Questions> questions = new ArrayList<Questions>();
        questions = questionsServices.listQuestionsPagination(pagination);

        if (questions.isEmpty()) {
            pagination.setCurrentPage(0);
        }

        modelAndView.addObject(Constants.KEYWORDS, pagination.getKeyWord());
        modelAndView.addObject(Constants.QUESTIONS, questions);
        modelAndView.addObject(Constants.PAGINATION, pagination);

        modelAndView.setViewName(Constants.EDIT_QUE);

        return modelAndView;
    }

    @RequestMapping(value = "/details")
    public ModelAndView details(@RequestParam(value = "way", defaultValue = "") String way,
                                @RequestParam(value = "updateId", defaultValue = "") String updateIdFront
                                ) {
        ModelAndView modelAndView = new ModelAndView();

        Questions questions = questionsServices.searchQuestionsById(Integer.parseInt(updateIdFront));
        modelAndView.addObject(Constants.QUESTIONS, questions);

        if (Constants.DETAILS.equals(way)) {
                modelAndView.setViewName(Constants.DETAILS_QUE);
        }

        if (Constants.EDIT.equals(way)) {
            if (!StringUtil.isEmpty(updateIdFront)) {
                modelAndView.setViewName(Constants.QUESTIONS_QUE);
            }
        }

        if (Constants.UPDATE.equals(way)) {
            modelAndView.setViewName(Constants.UPDATE_QUE);
        }

        return modelAndView;
    }

    private String getQueIdNumber() {
        Questions questionsOne = questionsServices.searchQuestionsById(0);
        int suffix = Integer.parseInt(questionsOne.getIdNumber().substring(1)) + 1;
        String idNumber = "Q" + String.valueOf(suffix);
        return idNumber;
    }
}
