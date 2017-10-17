using System;
using System.Configuration;

namespace Oes.Entity
{
    public class ExamPagenation
    {
        private int pageSize;
        private int pageCount;
        private int offset;
        private int currentPage;
        private int totalCount;
        private string examKind;

        public int UserId { get; set; }
        public string FindWay { get; set; }
        public string OrderWay { get; set;}
        public string OrderName { get; set; }

        public string ExamKind
        {
            get
            {

                if(string.IsNullOrEmpty(this.examKind))
                {
                    examKind = "All";
                }

                return this.examKind;
            }
            set
            {
                this.examKind = value;
            }
        }

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

        public int PageSize {
            get
            {
                if (this.pageSize == 0)
                {
                    this.pageSize = Convert.ToInt32(ConfigurationManager.AppSettings["pageSize"].ToString());
                }

                return this.pageSize;
            }
            set
            {
                this.pageSize = value;
            }
        }
        
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
