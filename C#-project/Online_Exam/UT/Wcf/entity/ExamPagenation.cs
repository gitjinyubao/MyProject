using System;
using System.Configuration;
using System.Runtime.Serialization;
using WCF.Constracts;

namespace WCF.Constracts
{
    [DataContract]
    public class ExamPagenation
    {
        [DataMember]
        private int pageSize;

        [DataMember]
        private int pageCount;

        [DataMember]
        private int offset;

        [DataMember]
        private int currentPage;

        [DataMember]
        private int totalCount;

        [DataMember]
        private string examKind;

        [DataMember]
        public int UserId { get; set; }

        [DataMember]
        public string FindWay { get; set; }

        [DataMember]
        public string OrderWay { get; set;}

        [DataMember]
        public string OrderName { get; set; }

        [DataMember]
        public string ExamKind
        {
            get
            {
                if(string.IsNullOrEmpty(this.examKind))
                {
                    examKind = ConstantsConstract.All;
                }

                return this.examKind;
            }
            set
            {
                this.examKind = value;
            }
        }

        [DataMember]
        public int TotalCount
        {
            get
            {
                return this.totalCount;
            }
            set
            {
                this.totalCount = value;
            }
        }

        [DataMember]
        public int PageSize {
            get
            {
                if (this.pageSize == 0)
                {
                    this.pageSize = Convert.ToInt32(ConfigurationManager.AppSettings[ConstantsConstract.PageSize].ToString());
                }

                return this.pageSize;
            }
            set
            {
                this.pageSize = value;
            }
        }

        [DataMember]
        public int PageCount
        {
            get
            {
                if (this.pageCount < 1)
                {
                    this.pageCount = 0;
                }

                this.pageCount = (this.totalCount - 1) / this.pageSize + 1;

                return this.pageCount;
            }
            set
            {
                this.pageCount = value;
            }
        }

        [DataMember]
        public int Offset
        {
            get
            {
                this.offset = this.currentPage == 0 ? 0 : (this.currentPage - 1) * this.pageSize;

                return this.offset;
            }
            set
            {
                this.offset = value;
            }
        }

        [DataMember]
        public int CurrentPage
        {
            get
            {

                if (this.currentPage == 0)
                {
                    if (this.totalCount == 0)
                    {
                        this.currentPage = 0;
                    }
                    else
                    {
                        this.currentPage = 1;
                    }
                }

                return this.currentPage;
            }
            set
            {
                this.currentPage = value;
            }
        }
    }
}
