using System;
using System.ServiceModel;
using WCF.BAL;

namespace Host
{
    public class Program
    {
        static void Main(string[] args)
        {
            using (ServiceHost hostUserService = new ServiceHost(typeof(UserService)))
            using (ServiceHost hostQuestionsService = new ServiceHost(typeof(QuestionsService)))
            using (ServiceHost hostExamService = new ServiceHost(typeof(ExamService)))
            using (ServiceHost hostExamRecordService = new ServiceHost(typeof(ExamRecordService)))
            {
                hostUserService.Opened += delegate
                {
                    Console.WriteLine(Constants.StartTime);
                };

                hostUserService.Open();
                hostQuestionsService.Open();
                hostExamService.Open();
                hostExamRecordService.Open();

                Console.Read();
            }
        }
    }
}
