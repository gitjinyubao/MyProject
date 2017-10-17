using System;
using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class TeacherSearchExamListIterm
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Name { get; set; }

        [DataMember]
        public string Number { get; set; }

        [DataMember]
        public DateTime EffictiveTime { get; set; }

        [DataMember]
        public string QuestionQuantity { get; set; }

        [DataMember]
        public string AverageScore { get; set; }

        [DataMember]
        public string ExamineeCount{ get; set; }

        [DataMember]
        public string NumberOfQualified { get; set; }

        [DataMember]
        public string PassRate { get; set; }
    }
}
