using System;
using System.Drawing;
using System.Windows.Forms;

namespace Oes.Entity.Custom
{
    public partial class SelectKindExam : UserControl
    {
        private readonly Color SelectedBackColor = Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
        private readonly Color NormalBackColor = Color.White;
        private readonly Color SelectedForeColor = Color.White;
        private readonly Color NormalForeColor = Color.Black;
        private Boolean selected;
        public event EventHandler ControlClick;

        public SelectKindExam()
        {
            InitializeComponent();

            this.Click += new EventHandler(KindExamClick);
            this.LblSelectExamKind.Click += new EventHandler(KindExamClick);
        }

        public Boolean Selected
        {
            get
            {
                return this.selected;
            }
            set
            {
                if (value)
                {
                    this.LblSelectExamKind.BackColor = SelectedBackColor;
                    this.LblSelectExamKind.ForeColor = SelectedForeColor;
                }
                else
                {
                    this.LblSelectExamKind.BackColor = NormalBackColor;
                    this.LblSelectExamKind.ForeColor = NormalForeColor;
                }

                this.selected = value;
            }
        }

        public string ExamKindSelect
        {
            get
            {
                return this.LblSelectExamKind.Text;
            }

            set
            {
                this.LblSelectExamKind.Text = value;
            }
        }

        public int LblSelectExamKindWidth
        {
            get
            {
                return this.LblSelectExamKind.Width;
            }

            set
            {
                this.LblSelectExamKind.Width = value;
            }
        }

        private void KindExamClick(object sender, EventArgs e)
        {
            if (!selected)
            {
                this.Selected = true;

                if (ControlClick != null)
                {
                    ControlClick(this, e);
                }
            }
            else
            {
                this.selected = this.selected == true ? true : false;
            }
        }
    }
}
