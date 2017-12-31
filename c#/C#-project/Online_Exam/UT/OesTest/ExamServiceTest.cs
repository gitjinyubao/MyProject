using System.Collections.ObjectModel;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using WCF.BAL;
using WCF.Constracts;
using WCF.DAL;

namespace OesTest
{
    [TestClass]
    public class ExamServiceTest
    {
        private ExamService examService;
        private Mock<IExamDao> examDaoMock;

        private ExamPagenation pagenation = new ExamPagenation();
        private ExamPagenation pagenationTest = new ExamPagenation();
        private Collection<MyExamListIterm> myExamListIterms = new Collection<MyExamListIterm>();
        private Collection<MyExamListIterm> myExamListItermsTest;
        private int totalCount;
        private int totalCountTest;
        private int pageSize = Constants.NumberOneInt;
        private string examKind = Constants.ExamKindAll;
        private string orderWay = Constants.OrderWay;
        private string orderName = Constants.OrderName;
        private int userId = Constants.NumberOneInt;

        [TestInitialize]
        public void Initialize()
        {
            examDaoMock = new Mock<IExamDao>();
            examService = new ExamService(examDaoMock.Object);
        }

        [TestCleanup]
        public void TestCleanUp()
        {
            examDaoMock.Verify();
        }

        [TestMethod]
        public void ShowExamListRightTest()
        {
            pagenation.ExamKind = examKind;
            pagenation.OrderName = orderName;
            pagenation.OrderWay = orderWay;
            pagenation.PageSize = pageSize;

            pagenationTest.ExamKind = examKind;
            pagenationTest.OrderName = orderName;
            pagenationTest.OrderWay = orderWay;
            pagenationTest.PageSize = Constants.NumberOneInt;

            MyExamListIterm myExamListItermOne = new MyExamListIterm();
            myExamListItermOne.Id = Constants.NumberOneInt;
            MyExamListIterm myExamListItermTwo = new MyExamListIterm();
            myExamListItermTwo.Id = Constants.NumberTwoInt;
            MyExamListIterm myExamListItermThree = new MyExamListIterm();
            myExamListItermThree.Id= 3;
            MyExamListIterm myExamListItermFour = new MyExamListIterm();
            myExamListItermThree.Id= 4;
            MyExamListIterm myExamListItermFive = new MyExamListIterm();
            myExamListItermThree.Id = 5;
            MyExamListIterm myExamListItermSix = new MyExamListIterm();
            myExamListItermThree.Id = 6;

            myExamListIterms.Add(myExamListItermOne);
            myExamListIterms.Add(myExamListItermTwo);
            myExamListIterms.Add(myExamListItermThree);
            myExamListIterms.Add(myExamListItermFour);
            myExamListIterms.Add(myExamListItermFive);
            myExamListIterms.Add(myExamListItermSix);

            examDaoMock.Setup(o => o.QueryUserExam(pagenation)).Returns(myExamListIterms);
            myExamListItermsTest = examService.ShowExamList(pagenation);

            Assert.AreEqual(myExamListIterms, myExamListItermsTest);
        }

        [TestMethod]
        public void ShowExamListWrongTest()
        {
            pagenation.ExamKind = examKind;
            pagenation.OrderName = orderName;
            pagenation.OrderWay = orderWay;
            pagenation.PageSize = pageSize;

            pagenationTest.ExamKind = examKind;
            pagenationTest.OrderName = orderName;
            pagenationTest.OrderWay = orderWay;
            pagenationTest.PageSize = Constants.NumberOneInt;

            MyExamListIterm myExamListItermOne = new MyExamListIterm();
            myExamListItermOne.Id = 1;
            MyExamListIterm myExamListItermTwo = new MyExamListIterm();
            myExamListItermTwo.Id = 2;
            MyExamListIterm myExamListItermThree = new MyExamListIterm();
            myExamListItermThree.Id = 3;
            MyExamListIterm myExamListItermFour = new MyExamListIterm();
            myExamListItermThree.Id = 4;
            MyExamListIterm myExamListItermFive = new MyExamListIterm();
            myExamListItermThree.Id = 5;
            MyExamListIterm myExamListItermSix = new MyExamListIterm();
            myExamListItermThree.Id = 6;

            myExamListIterms.Add(myExamListItermOne);
            myExamListIterms.Add(myExamListItermTwo);
            myExamListIterms.Add(myExamListItermThree);
            myExamListIterms.Add(myExamListItermFour);
            myExamListIterms.Add(myExamListItermFive);
            myExamListIterms.Add(myExamListItermSix);

            examDaoMock.Setup(o => o.QueryUserExam(pagenation)).Returns(myExamListIterms);
            myExamListItermsTest = examService.ShowExamList(pagenationTest);

            Assert.AreEqual(myExamListIterms, myExamListItermsTest);
        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void ShowExamListExceptionTest()
        {
            pagenation = null;
            myExamListIterms = null;

            examDaoMock.Setup(o => o.QueryUserExam(pagenation)).Returns(myExamListIterms);
            examService.ShowExamList(pagenation);
        }

        [TestMethod]
        public void GetExamTotalCountRightTest()
        {
            pagenation.UserId = userId;
            pagenation.ExamKind = examKind;
            totalCount = Constants.NumberTwoInt;

            pagenationTest.UserId = Constants.NumberTwoInt;
            pagenationTest.ExamKind = Constants.ExamKindAll;

            examDaoMock.Setup(o => o.GetExamTotal(pagenation)).Returns(totalCount);
            totalCountTest = examService.GetExamTotalCount(pagenation);
            Assert.AreEqual(totalCountTest, totalCount);
        }

        [TestMethod]
        public void GetExamTotalCountWrongTest()
        {
            pagenation.UserId = userId;
            pagenation.ExamKind = examKind;
            totalCount = Constants.NumberTwoInt;

            pagenationTest.UserId = Constants.NumberThreeInt;
            pagenationTest.ExamKind = Constants.ExamKindAll;

            examDaoMock.Setup(o => o.GetExamTotal(pagenation)).Returns(totalCount);
            totalCountTest = examService.GetExamTotalCount(pagenationTest);
            Assert.AreEqual(totalCountTest, totalCount);
        }

        [TestMethod]
        [ExpectedException(typeof(ParameterException))]
        public void GetExamTotalCountExceptionTest()
        {
            pagenation = null;
            totalCount = 0;

            pagenationTest = null;

            examDaoMock.Setup(o => o.GetExamTotal(pagenation)).Returns(totalCount);
            examService.GetExamTotalCount(pagenation);
        }
    }
}
