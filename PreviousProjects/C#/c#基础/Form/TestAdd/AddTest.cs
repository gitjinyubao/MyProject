using Test;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace TestAdd
{
    
    
    /// <summary>
    ///这是 AddTest 的测试类，旨在
    ///包含所有 AddTest 单元测试
    ///</summary>
    [TestClass()]
    public class AddTest
    {


        private TestContext testContextInstance;

        /// <summary>
        ///获取或设置测试上下文，上下文提供
        ///有关当前测试运行及其功能的信息。
        ///</summary>
        public TestContext TestContext
        {
            get
            {
                return testContextInstance;
            }
            set
            {
                testContextInstance = value;
            }
        }

        #region 附加测试特性
        // 
        //编写测试时，还可使用以下特性:
        //
        //使用 ClassInitialize 在运行类中的第一个测试前先运行代码
        //[ClassInitialize()]
        //public static void MyClassInitialize(TestContext testContext)
        //{
        //}
        //
        //使用 ClassCleanup 在运行完类中的所有测试后再运行代码
        //[ClassCleanup()]
        //public static void MyClassCleanup()
        //{
        //}
        //
        //使用 TestInitialize 在运行每个测试前先运行代码
        //[TestInitialize()]
        //public void MyTestInitialize()
        //{
        //}
        //
        //使用 TestCleanup 在运行完每个测试后运行代码
        //[TestCleanup()]
        //public void MyTestCleanup()
        //{
        //}
        //
        #endregion

        
        /// <summary>
        ///AddNum 的测试
        ///</summary>
        [DeploymentItem("TestAdd\\test.csv"), DataSource("Microsoft.VisualStudio.TestTools.DataSource.CSV", "|DataDirectory|\\test.csv", "test#csv", DataAccessMethod.Sequential), TestMethod()]
        public void AddNumTest()
        {
            Add target = new Add(); // TODO: 初始化为适当的值
            //int a = 0; // TODO: 初始化为适当的值
            int a = Convert.ToInt32(this.testContextInstance.DataRow["a"]);
            //int b = 0; // TODO: 初始化为适当的值
            int b = Convert.ToInt32(this.testContextInstance.DataRow["b"]);
            //int expected = 0; // TODO: 初始化为适当的值
            int expected = Convert.ToInt32(this.testContextInstance.DataRow["c"]);
            int actual;
            actual = target.AddNum(a, b);
            Assert.AreEqual(expected, actual);
            //Assert.Inconclusive("验证此测试方法的正确性。");
        }
    }
}
