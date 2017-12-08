using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using WCF.BAL;
using WCF.Constracts;
using WCF.DAL;
using System;
using OesTest;

namespace OesTest
{
    [TestClass]
    public class ExamRecordServiceTest
    {
        private ExamRecordService examRecordService;
        private Mock<IExamRecordDao> examRecordDaoMock;

        ExamRecord examRecord = new ExamRecord();
        private int affectedRows = Constants.NumberOneInt;
        private int affectedRowsTest;

        private int userId = Constants.NumberOneInt;
        private int examId = Constants.NumberOneInt;
        private int questionsId = Constants.NumberOneInt;
        private string userAnswer = Constants.UserAnswerB;

        private string questionsStatus = Constants.QuestionsStatusRight;
        private string rightAnswer = Constants.QuestionsAnswer;

        private UserExamScore userExamScore = new UserExamScore();
        private string finishTime = Constants.ExamFinishTime;
        private string score = Constants.ExamScore;

        private string examKind = Constants.ExamKindAll;
        private string options = Constants.ExamOptions;
        private string scoreIndividureTotalParameter = Constants.ScoreIndividureTotalParameter;

        private UserExamScore userExamScoreTest = new UserExamScore();

        [TestInitialize]
        public void Initialize()
        {
            examRecordDaoMock = new Mock<IExamRecordDao>();
            examRecordService = new ExamRecordService(examRecordDaoMock.Object);
        }

        [TestCleanup]
        public void TestCleanUp()
        {
            examRecordDaoMock.Verify();
        }

        [TestMethod]
        public void AddExamRecordTest()
        {
            examRecord.QueId = questionsId;
            examRecord.UserAnswer = userAnswer;
            examRecord.UserId = userId;
            examRecord.ExaId = examId;

            affectedRows = 1;

            examRecordDaoMock.Setup(o => o.InsertExamRecord(examRecord)).Returns(affectedRows);
            affectedRowsTest = examRecordService.AddExamRecord(examRecord);

            Assert.AreEqual(affectedRowsTest, affectedRows);
        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void AddExamRecordExceptionTest()
        {
            examRecord = null;
            affectedRows = 0;

            examRecordDaoMock.Setup(o => o.InsertExamRecord(examRecord)).Returns(affectedRows);
            examRecordService.AddExamRecord(examRecord);
        }

        [TestMethod]
        public void UpdateExamRecordTest()
        {
            examRecord.ExaId = examId;
            examRecord.QueId = questionsId;
            examRecord.QuestionStatus = questionsStatus;
            examRecord.RightAnswer = rightAnswer;
            examRecord.ExaId = examId;

            examRecordDaoMock.Setup(o => o.UpdateExamRecord(examRecord)).Returns(affectedRows);
            affectedRowsTest = examRecordService.UpdateExamRecord(examRecord);

            Assert.AreEqual(affectedRowsTest, affectedRows);
        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void UpdateExamRecordExceptionTest()
        {
            examRecord = null;
            examRecordDaoMock.Setup(o => o.UpdateExamRecord(examRecord));
            examRecordService.UpdateExamRecord(examRecord);
        }

        [TestMethod]
        public void AddUserExamResultTest()
        {
            userExamScore.FinishTime = finishTime;
            userExamScore.Score = score;
            userExamScore.UserId = userId;
            userExamScore.ExamId = examId;

            examRecordDaoMock.Setup(o => o.AddUserExamResult(userExamScore)).Returns(affectedRows);
            affectedRowsTest = examRecordService.AddUserExamResult(userExamScore);
            Assert.AreEqual(affectedRowsTest, affectedRows);
        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void AddUserExamResultExceptionTest()
        {
            userExamScore = null;

            examRecordDaoMock.Setup(o => o.AddUserExamResult(userExamScore));
            examRecordService.AddUserExamResult(userExamScore);
        }

        [TestMethod]
        public void UpdateUserScoreExamTest()
        {
            userExamScore.FinishTime = finishTime;
            userExamScore.Score = score;
            userExamScore.UserId = userId;
            userExamScore.ExamId = examId;
            userExamScore.Operations = options;
            userExamScore.ExamKind = examKind;
            userExamScore.ScoreIndividureTotal = scoreIndividureTotalParameter;

            examRecordDaoMock.Setup(o => o.UpdateUserScoreExam(userExamScore)).Returns(affectedRows);
            affectedRowsTest = examRecordService.UpdateUserScoreExam(userExamScore);

            Assert.AreEqual(affectedRowsTest, affectedRows);
        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void UpdateUserScoreExamExceptionTest()
        {
            userExamScore = null;

            examRecordDaoMock.Setup(o => o.UpdateUserScoreExam(userExamScore));
            examRecordService.UpdateUserScoreExam(userExamScore);
        }

        [TestMethod]
        public void UpdateUserFinishTimeTest()
        {
            userExamScore.FinishTime = finishTime;
            userExamScore.UserId = userId;
            userExamScore.ExamId = examId;

            examRecordDaoMock.Setup(o => o.UpdateUserFinishTime(userExamScore)).Returns(affectedRows);
            affectedRowsTest = examRecordService.UpdateUserFinishTime(userExamScore);
            Assert.AreEqual(affectedRowsTest, affectedRows);

        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void UpdateUserFinishTimeExceptionTest()
        {
            userExamScore = null;

            examRecordDaoMock.Setup(o => o.UpdateUserFinishTime(userExamScore));
            examRecordService.UpdateUserFinishTime(userExamScore);
        }

        [TestMethod]
        public void GetUserExamScoreRightTest()
        {
            userExamScore.Score = score;
            userExamScore.UserId = userId;
            userExamScore.ExamId = examId;

            examRecordDaoMock.Setup(o => o.GetUserExamScore(examId, userId)).Returns(userExamScore);
            userExamScoreTest = examRecordService.GetUserExamScore(examId, userId);

            Assert.AreEqual(userExamScoreTest.Score, userExamScore.Score);
        }

        [TestMethod]
        public void GetUserExamScoreWrongTest()
        {
            userExamScore.Score = score;
            userExamScore.UserId = userId;
            userExamScore.ExamId = examId;

            examRecordDaoMock.Setup(o => o.GetUserExamScore(examId, userId)).Returns(userExamScore);
            userExamScoreTest = examRecordService.GetUserExamScore(Constants.NumberTwoInt, Constants.NumberTwoInt);

            Assert.AreEqual(userExamScoreTest.Score, userExamScore.Score);
        }
    }
}
