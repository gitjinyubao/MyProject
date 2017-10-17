using System;
using System.Drawing;
using System.Windows.Forms;

namespace Oes.Entity.Custom
{
    public partial class KindAbout : UserControl
    {
        private readonly Color SelectedBackColor = Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
        private readonly Color NormalBackColor = Color.White;
        private readonly Color SelectedForeColor = Color.White;
        private readonly Color NormalForeColor = Color.Black;
        private Boolean selected;
        public event EventHandler KindAboutControlClick;

        public KindAbout()
        {
            InitializeComponent();

            this.Click += new EventHandler(KindExamClick);
            this.lblSelectKindAbout.Click += new EventHandler(KindExamClick);
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
                    this.lblSelectKindAbout.BackColor = SelectedBackColor;
                    this.lblSelectKindAbout.ForeColor = SelectedForeColor;
                }
                else
                {
                    this.lblSelectKindAbout.BackColor = NormalBackColor;
                    this.lblSelectKindAbout.ForeColor = NormalForeColor;
                }

                this.selected = value;
            }
        }

        public string ExamKindSelect
        {
            get
            {
                return this.lblSelectKindAbout.Text;
            }

            set
            {
                this.lblSelectKindAbout.Text = value;
            }
        }

        public int LblSelectExamKindWidth
        {
            get
            {
                return this.lblSelectKindAbout.Width;
            }

            set
            {
                this.lblSelectKindAbout.Width = value;
            }
        }

        private void KindExamClick(object sender, EventArgs e)
        {
            if (!selected)
            {
                this.Selected = true;

                if (KindAboutControlClick != null)
                {
                    KindAboutControlClick(this, e);
                }
            }
            else
            {
                this.selected = this.selected == true ? true : false;
            }
        }
    }
}
