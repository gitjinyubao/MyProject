using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class ParameterExceptionIsNull
    {
        [DataMember]
        public string Message { get; set; }
    }
}
