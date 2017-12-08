using System;
using System.Drawing;
using System.Windows.Forms;

namespace Oes.Entity.Custom
{
    public partial class QuestionsDetail : UserControl
    {
        private Color SelectedColor = Color.FromArgb(((int)(((byte)(210)))), ((int)(((byte)(218)))), ((int)(((byte)(227)))));
        private Color nomalColor = Color.White;

        private Image rightImage = global::Oes.Entity.Properties.Resources.ICN_Right_15x15;
        private Image wrongImage = global::Oes.Entity.Properties.Resources.ICN_Wrong_15x15;

        private string rightAnswer;
        private string userAnswer;
        private string status;

        public QuestionsDetail()
        {
            InitializeComponent();
        }

        public string QuestionsNumber
        {
            get
            {
                return this.LblQuestionsNumber.Text;
            }
            set
            {
                this.LblQuestionsNumber.Text = value;
            }
        }

        public string UserAnswer
        {
            get
            {
                return this.userAnswer; 
            }
            set
            {
                ReadiOEnabled(value);

                this.RdoQuestionsA.Checked = Constans.A.Equals(value) ? true : false;

                this.RdoQuestionsB.Checked = Constans.B.Equals(value) ? true : false;

                this.RdoQuestionsC.Checked = Constans.C.Equals(value) ? true : false;

                this.RdoQuestionsD.Checked = Constans.D.Equals(value) ? true : false;

                this.userAnswer = value;
            }
        }

        public string QuestionsStatus
        {
            get { return this.status; }
            set
            {
                this.LblQuestionsStatus.Image = Constans.Wrong.Equals(value) ? wrongImage : rightImage;
                this.status = value;
            }
        }

        public string RightAnswer
        {
            get { return this.rightAnswer; }

            set
            {
                ReadiOEnabled(value);

                this.RdoQuestionsA.BackColor = Constans.A.Equals(value) ? SelectedColor : nomalColor;

                this.RdoQuestionsB.BackColor = Constans.B.Equals(value) ? SelectedColor : nomalColor;

                this.RdoQuestionsC.BackColor = Constans.C.Equals(value) ? SelectedColor : nomalColor;

                this.RdoQuestionsD.BackColor = Constans.D.Equals(value) ? SelectedColor : nomalColor;

                this.rightAnswer = value;
            }
        }

        public string QuestionsTitle
        {
            get { return this.LblQuestionsTitle.Text; }
            set { this.LblQuestionsTitle.Text = value; }
        }

        public string QuestionsAContent
        {
            get { return this.RdoQuestionsA.Text; }
            set { this.RdoQuestionsA.Text = value; }
        }

        public string QuestionsBContent
        {
            get { return this.RdoQuestionsB.Text; }
            set { this.RdoQuestionsB.Text = value; }
        }

        public string QuestionsCContent
        {
            get { return this.RdoQuestionsB.Text; }
            set { this.RdoQuestionsC.Text = value; }
        }

        public string QuestionsDContent
        {
            get { return this.RdoQuestionsB.Text; }
            set { this.RdoQuestionsD.Text = value; }
        }

        /// <summary>
        /// Change backColor.
        /// </summary>
        /// <param name="isRihgtSelected">isRihgtSelected</param>
        /// <param name="radio">RadioButton</param>
        private void changeBackColor(Boolean isRihgtSelected, RadioButton radio)
        {
            radio.BackColor = isRihgtSelected ? SelectedColor : nomalColor;
        }

        private void ReadiOEnabled(string value)
        {
            this.RdoQuestionsA.Enabled = Constans.A.Equals(value) ? true : false;

            this.RdoQuestionsB.Enabled = Constans.B.Equals(value) ? true : false;

            this.RdoQuestionsC.Enabled = Constans.C.Equals(value) ? true : false;

            this.RdoQuestionsD.Enabled = Constans.D.Equals(value) ? true : false;
        }
    }
}
