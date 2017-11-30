using System;
using System.Drawing;
using System.Windows.Forms;
using WCF.Constracts;

namespace Oes.Entity.Custom
{
    public partial class ExamDetail : UserControl
    {
        public event EventHandler Lb1ExamNameClick;
        public event EventHandler ExamOpertionClick;

        public ExamDetail()
        {
            InitializeComponent();
            this.Lb1ExamName.Click += ViewExam;
        }

        public StudentExamListIterm Exam { get; set; }

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

        public string ExamDuration
        {
            get
            {
                return this.LblExamDuration.Text;
            }
            set
            {
                this.LblExamDuration.Text = value;
            }
        }

        public string ExamPassCriteria
        {
            get
            {
                return this.LblExamPassCriteria.Text;
            }
            set
            {
                this.LblExamPassCriteria.Text = value;
            }
        }

        public string ExamDivisTotalScore
        {
            get
            {
                return this.LblExamDivisTotalScore.Text;
            }
            set
            {
                this.LblExamDivisTotalScore.Text = value;
            }
        }

        public string ExamOperation
        {
            get
            {
                return this.LblExamOpertion.Text;
            }
            set
            {
                if (Constans.Pass.Equals(value) || Constans.NoPass.Equals(value))
                {
                    this.LblExamOpertion.LinkColor = Color.Black;
                    this.LblExamOpertion.LinkBehavior = LinkBehavior.NeverUnderline;
                }
                else
                {
                    this.LblExamOpertion.Click += new EventHandler(LblExamOpertionClick);
                }

                this.LblExamOpertion.Text = value;
            }
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

        private void LblExamOpertionClick(object sender, EventArgs e)
        {
            ExamOpertionClick(this, e);
        }

        private void ViewExam(object sender, EventArgs e)
        {
            if (Lb1ExamNameClick != null)
            {
                Lb1ExamNameClick(this, e);
            }
        }
    }
}
