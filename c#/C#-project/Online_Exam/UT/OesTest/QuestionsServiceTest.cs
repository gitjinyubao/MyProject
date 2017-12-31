using System.Collections.ObjectModel;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using WCF.BAL;
using WCF.Constracts;
using WCF.DAL;

namespace OesTest
{
    [TestClass]
    public class QuestionsServiceTest
    {
        private QuestionsService questionsService;
        private Mock<IQuestionsDao> questionsdaoMock;
        private Questions questions;
        private Questions questionsTest;
        private string questionsTitle = Constants.QuestionsTitle;
        private int questionsId = Constants.NumberOneInt;

        private Collection<int> questionsIds = new Collection<int>();
        private Collection<int> questionsIdsTest = new Collection<int>();
        private int examId = Constants.NumberOneInt;

        private int userId = Constants.NumberOneInt;
        private ExamQuextions examQuestions = new ExamQuextions();
        private ExamQuextions examQuestionsTest = new ExamQuextions();
        private string questionsScore = Constants.QuestionsScore;

        private Collection<ExamRecord> examRecords = new Collection<ExamRecord>();
        private Collection<ExamRecord> examRecordsTest = new Collection<ExamRecord>();
        private string userAnswer = Constants.UserAnswerB;


        [TestInitialize]
        public void Initialize()
        {
            questionsdaoMock = new Mock<IQuestionsDao>();
            questionsService = new QuestionsService(questionsdaoMock.Object);
        }

        [TestCleanup]
        public void TestCleanUp()
        {
            questionsdaoMock.Verify();
        }

        [TestMethod]
        public void GetQuestionRightTest()
        {
            questions = new Questions();
            questions.que_title = questionsTitle;
            questions.Id = questionsId;

            questionsdaoMock.Setup(o => o.GetQuestions(questionsId)).Returns(questions);
            questionsTest = questionsService.GetQuestion(Constants.NumberOneInt);

            Assert.AreEqual(questions, questionsTest);
        }

        [TestMethod]
        public void GetQuestionWrongTest()
        {
            questions = new Questions();
            questions.que_title = questionsTitle;
            questions.Id = questionsId;

            questionsdaoMock.Setup(o => o.GetQuestions(questionsId)).Returns(questions);
            questionsTest = questionsService.GetQuestion(Constants.NumberThreeInt);

            Assert.AreEqual(questions, questionsTest);
        }

        [TestMethod]
        public void GetQuestionsIdRightTest()
        {
            questionsIds.Add(1);
            questionsIds.Add(2);
            questionsIds.Add(3);

            questionsdaoMock.Setup(o => o.GetQuestionsId(examId)).Returns(questionsIds);
            questionsIdsTest = questionsService.GetQuestionsId(1);
            Assert.AreEqual(questionsIds, questionsIdsTest);
        }

        [TestMethod]
        public void GetQuestionsIdWrongTest()
        {
            questionsIds.Add(1);
            questionsIds.Add(2);
            questionsIds.Add(3);

            questionsdaoMock.Setup(o => o.GetQuestionsId(examId)).Returns(questionsIds);
            questionsIdsTest = questionsService.GetQuestionsId(Constants.NumberThreeInt);
            Assert.AreEqual(questionsIds, questionsIdsTest);
        }

        [TestMethod]
        public void GetExamQuestionsRightTest()
        {
            examQuestionsTest.QuestionsScore = questionsScore;

            questionsdaoMock.Setup(o => o.GetExamQuestions(examId, userId)).Returns(examQuestions);
            examQuestionsTest = questionsService.GetExamQuestions(Constants.NumberOneInt, Constants.NumberOneInt);

            Assert.AreEqual(examQuestions, examQuestionsTest);
        }

        [TestMethod]
        public void GetExamQuestionsWrongTest()
        {
            examQuestionsTest.QuestionsScore = questionsScore;

            questionsdaoMock.Setup(o => o.GetExamQuestions(examId, userId)).Returns(examQuestions);
            examQuestionsTest = questionsService.GetExamQuestions(Constants.NumberTwoInt, Constants.NumberTwoInt);

            Assert.AreEqual(examQuestions, examQuestionsTest);
        }

        [TestMethod]
        public void GetUserQuestionsRecordRightTest()
        {
            ExamRecord examRecordOne = new ExamRecord();
            examRecordOne.UserAnswer = userAnswer;
            ExamRecord examRecordTwo = new ExamRecord();
            examRecordTwo.UserAnswer = userAnswer;
            ExamRecord examRecordThree = new ExamRecord();
            examRecordThree.UserAnswer = userAnswer;

            examRecords.Add(examRecordOne);
            examRecords.Add(examRecordTwo);
            examRecords.Add(examRecordThree);

            questionsdaoMock.Setup(o => o.GetUserQuestionsRecord(examId, questionsId)).Returns(examRecords);
            examRecordsTest = questionsService.GetUserQuestionsRecord(Constants.NumberOneInt,Constants.NumberOneInt);

            Assert.AreEqual(examRecords, examRecordsTest);

        }

        [TestMethod]
        public void GetUserQuestionsRecordWrongTest()
        {
            ExamRecord examRecordOne = new ExamRecord();
            examRecordOne.UserAnswer = userAnswer;
            ExamRecord examRecordTwo = new ExamRecord();
            examRecordTwo.UserAnswer = userAnswer;
            ExamRecord examRecordThree = new ExamRecord();
            examRecordThree.UserAnswer = userAnswer;

            examRecords.Add(examRecordOne);
            examRecords.Add(examRecordTwo);
            examRecords.Add(examRecordThree);

            questionsdaoMock.Setup(o => o.GetUserQuestionsRecord(examId, questionsId)).Returns(examRecords);
            examRecordsTest = questionsService.GetUserQuestionsRecord(Constants.NumberTwoInt, Constants.NumberTwoInt);

            Assert.AreEqual(examRecords, examRecordsTest);
        }
    }
}
