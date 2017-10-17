using System;
using System.Windows.Forms;
using WCF.Constracts;

namespace Oes.Entity.Custom
{
    public partial class ExamPassInformation : UserControl
    {
        public StudentExamListIterm Exam { get; set; }

        public ExamPassInformation()
        {
            InitializeComponent();
        }

        public string Index
        {
            get
            {
                return this.LblIndex.Text;
            }
            set
            {
                this.LblIndex.Text = value;
            }
        }

        public string ExamName
        {
            get
            {
                return Lb1ExamName.Text;
            }
            set
            {
                this.Lb1ExamName.Text = value;
            }
        }

        public string ExamIdNumber
        {
            get
            {
                return this.LblExamIdNumber.Text;
            }
            set
            {
                this.LblExamIdNumber.Text = value;
            }
        }

        public string ExamEffictiveTime
        {
            get
            {
                return this.LblExamEffectiveTime.Text;
            }
            set
            {
                this.LblExamEffectiveTime.Text = value;
            }
        }

        public string TotalQuantity
        {
            get
            {
                return this.lblTotalQuantity.Text;
            }
            set
            {
                this.lblTotalQuantity.Text = value;
            }
        }

        public string AverageScore
        {
            get
            {
                return this.LblAverageScore.Text;
            }
            set
            {
                this.LblAverageScore.Text = value;
            }
        }

        public string ExamineeCount
        {
            get
            {
                return this.LblExamineeCount.Text;
            }
            set
            {
                this.LblExamineeCount.Text = value;
            }
        }

        public string NumberOfQualified
        {
            get
            {
                return this.lblNumberOfQualified.Text;
            }
            set
            {
                this.lblNumberOfQualified.Text = value;
            }
        }

        public string PassRate
        {
            get
            {
               return this.lblPassRate.Text;
            }
            set
            {
                this.lblPassRate.Text = value;
            }
        }
    }
}
