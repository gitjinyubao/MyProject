using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WCF.Constracts
{
    public class Constants
    {
        #region UserDao
        public const string LastLoginUser = "lastLoginUser";
        public const string SqlServer = "sqlserver2008";
        public const string FindUserByName = "findUserByName";
        public const string UpdateLastLoginTime = "updateLastLoginTime";
        public const string UserNameParameter = "@userName";
        public const string UserIdParameter = "@userId";
        public const string LoginTimeParameter = "@loginTime";
        public const string FindRoleByUserId = "find_role_by_user_id";
        public const string IsLoginedParameter = "@isLogined";
        public const string ZeroString = "0";
        public const string OneString = "1";
        #endregion

        #region QuestionsDao
        public const string FindQuestionsByExamId = "find_questions_by_exam_id";
        public const string ExamIdParameter = "@examId";
        public const string FindQuestionsById = "find_questions_by_id";
        public const string QuestionsIdParameter = "@questionsId";
        public const string FindQuestionsAnswer = "find_questions_answer";
        public const string FindUserQuestionsRecord = "find_user_questions_record";
        #endregion

        #region ExamRecordDao
        public const string AddExamRecord = "add_exam_record";
        public const string QueIdParameter = "@queId";
        public const string UserAnswerParameter = "@userAnswer";
        public const string AddUserScore = "add_users_score";
        public const string FinishTimeParameter = "@finishTime";
        public const string ExamKindParameter = "@examKind";
        public const string ScoreParameter = "@score";
        public const string UpdateExamRecord = "update_exam_record";
        public const string QuestionStausParameter = "@questionStaus";
        public const string RightAnswerParameter = "@rightAnswer";
        public const string UpdateUserScoreExam = "update_user_score_exam";
        public const string OperationParameter = "@operations";
        public const string ScoreIndividureTotalParameter = "@scoreIndividureTotal";
        public const string FindUserScoreRecord = "find_user_score_record";
        public const string UpdateUserFinishTime = "update_user_finish_time";
        public const string UpdateExamInformation = "update_exam_information";
        public const string AverageScoreParameter = "@averageScore";
        public const string PassRateParameter = "@passRate";
        public const string NumberQualifiedParameter = "@numberQualified";
        public const string GetCountOfDoExam = "get_count_of_do_exam";
        public const string GetCountOfPassingExam = "get_count_of_passing_Exam";
        public const string GetExamineeCount = "get_examinee_count";
        public const string GetExamAverageScore = "get_exam_average_score";
        #endregion

        #region ExamDao
        public const string ExamListShow = "exam_list_show";
        public const string GetStudentUnfinishedExam = "get_student_unfinished_exam";
        public const string ExamTotalCount = "exam_total_count";
        public const string TeacherSearchExamTotalCount = "teacher_search_exam_total_count";
        public const string PageSizeParameter = "@pageSize";
        public const string OffSetParameter = "@offSet";
        public const string KindExamParameter = "@kindExam";
        public const string OrderNameParameter = "@orderName";
        public const string OrderWayParameter = "@orderWay";
        public const string KeyWordParameter = "@keyWord";
        public const string TeacherSearchExamResultListShow = "teacher_search_examResult_list_show";
        #endregion
    }
}
