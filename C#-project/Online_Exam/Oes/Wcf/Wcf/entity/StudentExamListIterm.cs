using System;
using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class StudentExamListIterm
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string ExamScore { get; set; }

        [DataMember]
        public string Name { get; set; }

        [DataMember]
        public string Number { get; set; }

        [DataMember]
        public DateTime EffictiveTime { get; set; }

        [DataMember]
        public string Duration { get; set; }

        [DataMember]
        public string PassCriteria { get; set; }

        [DataMember]
        public string TotalScore { get; set; }

        [DataMember]
        public string ExamDivisTotalScore { get; set; }

        [DataMember]
        public string QuestionQuantity { get; set; }

        [DataMember]
        public string Options { get; set; }

        [DataMember]
        public string RightAnswerQuentity { get; set; }
    }
}
