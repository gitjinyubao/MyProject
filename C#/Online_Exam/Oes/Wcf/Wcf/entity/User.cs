using System;
using System.Runtime.Serialization;

namespace WCF.Constracts
{
    [DataContract]
    public class User
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Username { get; set; }

        [DataMember]
        public string ChineseName { get; set; }

        [DataMember]
        public string Password { get; set; }

        [DataMember]
        public string UserNumber { get; set; }

        [DataMember]
        public string UserGender { get; set; }

        [DataMember]
        public string UserPhone { get; set; }

        [DataMember]
        public string UserEmail { get; set; }

        [DataMember]
        public Boolean IsLogined { get; set; }
    }
}
