using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class UserExamScore
    {
        [DataMember]
        public int UserId { get; set; }

        [DataMember]
        public int ExamId { get; set; }

        [DataMember]
        public string Score { get; set; }

        [DataMember]
        public string FinishTime { get; set; }

        [DataMember]
        public string ExamKind { get; set; }

        [DataMember]
        public string Operations { get; set; }

        [DataMember]
        public string ScoreIndividureTotal { get; set; }
    }
}
