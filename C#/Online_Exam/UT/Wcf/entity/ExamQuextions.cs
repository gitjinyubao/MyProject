using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class ExamQuextions
    {
        [DataMember]
        public int QuestionsId { get; set; }

        [DataMember]
        public int ExamId { get; set; }

        [DataMember]
        public string QuestionsScore { get; set; }

        [DataMember]
        public string QuestionsAnswer { get; set; }
    }
}
