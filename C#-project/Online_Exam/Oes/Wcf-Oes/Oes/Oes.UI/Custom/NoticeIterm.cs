using System;
using System.Windows.Forms;
using WCF.Constracts;

namespace Oes.Entity.Custom
{
    public partial class NoticeIterm : UserControl
    {
        private string index;

        public event EventHandler lb1ExamNameClick;

        public NoticeIterm()
        {
            InitializeComponent();

            this.lblTitle.Click += new EventHandler(TakeExam);
        }

        public StudentExamListIterm Exam { get; set; }

        public void TakeExam(object sender, EventArgs e)
        {
            if (lb1ExamNameClick != null)
            {
                this.lb1ExamNameClick(this, e);
            }
        }

        public string Index
        {
            get
            {
                return index;
            }
            set
            {
                this.lblNumberNotice.Text = value;
                index = value;
            }
        }

        public string NoticeContentTitle
        {
            get
            {
                return lblTitle.Text;
            }
            set
            {
                this.lblTitle.Text =  value;
            }
        }

        public string NoticeContentTime
        {
            get
            {
                return lblTime.Text;
            }
            set
            {
                this.lblTime.Text = value;
            }
        }
    }
}
