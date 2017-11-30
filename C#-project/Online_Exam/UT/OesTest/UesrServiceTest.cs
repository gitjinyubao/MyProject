using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using WCF.BAL;
using WCF.Constracts;
using WCF.DAL;
using System;
using System.Data;

namespace OesTest
{
    [TestClass]
    public class UesrServiceTest
    {
        private UserService userService;
        private Mock<IUserDao> userdaoMock;
        private User testUser;
        private User resultUser;
        private string testUserName = Constants.RightUserName;
        private string testWrongUserName = Constants.WrongUserName;
        private string testPassword = Constants.RightPassword;
        private string testWrongPassword = Constants.WrongPassword;
        private DateTime loginTime = DateTime.Now;
        private int userId = Constants.NumberOneInt;

        [TestInitialize]
        public void Initialize()
        {
            userdaoMock = new Mock<IUserDao>();
            userService = new UserService(userdaoMock.Object);
        }

        [TestCleanup]
        public void TestCleanUp()
        {
            userdaoMock.Verify();
        }

        [TestMethod]
        public void TestUserLoginRightUserNameAndPassword()
        {
            ExamPagenation pagi = new ExamPagenation();

            resultUser = new User();
            resultUser.Username = testUserName;
            resultUser.Password = testPassword;

            userdaoMock.Setup(o => o.FindUserByUsername(testUserName)).Returns(resultUser);
            userdaoMock.Setup(o => o.UpdateLastLoginTime(userId, loginTime));

            resultUser = userService.UserLogin(testUserName, testPassword);

            Assert.AreEqual(resultUser.Password, testPassword);
        }

        [TestMethod]
        public void TestUserLoginRightUserNameAndWrongPassword()
        {
            resultUser = new User();
            resultUser.Username = testUserName;
            resultUser.Password = testPassword;

            userdaoMock.Setup(o => o.FindUserByUsername(testWrongUserName)).Returns(resultUser);
            userdaoMock.Setup(o => o.UpdateLastLoginTime(userId, loginTime));

            resultUser = userService.UserLogin(testUserName, testWrongPassword);

            Assert.AreEqual(resultUser, testUser);
            Assert.AreEqual(resultUser.Password, testPassword);
        }

        [TestMethod]
        [ExpectedException(typeof(UserNameNotExistException))]
        public void TestUserLoginUserNull()
        {
            resultUser = new User();
            resultUser = null;

            userdaoMock.Setup(o => o.FindUserByUsername(testWrongUserName)).Returns(resultUser);

            userService.UserLogin(testWrongUserName, testPassword);
        }
    }
}
