using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class ExamRecord
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public int UserId { get; set; }

        [DataMember]
        public int ExaId { get; set; }

        [DataMember]
        public int QueId { get; set; }

        [DataMember]
        public string UserAnswer { get; set; }

        [DataMember]
        public string RightAnswer { get; set; }

        [DataMember]
        public string QuestionStatus { get; set; }
    }
}
