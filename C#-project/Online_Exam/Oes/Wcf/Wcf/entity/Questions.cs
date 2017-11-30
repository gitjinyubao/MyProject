using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class Questions
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string que_score { get; set; }

        [DataMember]
        public string que_title { get; set; }

        [DataMember]
        public string que_a_content { get; set; }

        [DataMember]
        public string que_b_content { get; set; }

        [DataMember]
        public string que_c_content { get; set; }

        [DataMember]
        public string que_d_content { get; set; }

        [DataMember]
        public string que_answer { get; set; }
    }
}
