using System;
using System.Drawing;
using System.Windows.Forms;

namespace Oes.Entity.Custom
{
    public partial class PageNumber : UserControl
    {
        public event EventHandler PageNumberClick;
        private Boolean isCurrentPageNumber = false;

        // The currentForeColor represents current page number color
        private readonly Color CurrentForeColor = Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(153)))), ((int)(((byte)(1)))));
        private readonly Color NormalForeColor = Color.Black;

        public PageNumber()
        {
            InitializeComponent();

            this.LblPageNumber.Click += new EventHandler(LblPageNumberClick);
        }

        public string OnePagenumber
        {
            get
            {
                return this.LblPageNumber.Text;
            }
            set
            {
                this.LblPageNumber.Text = value;
            }
        }

        public Boolean IsCurrentPageNumber
        {
            get
            {
                return this.isCurrentPageNumber;
            }
            set
            {
                if (value)
                {
                    this.isCurrentPageNumber = true;
                    this.LblPageNumber.ForeColor = CurrentForeColor;
                }
                else
                {
                    this.isCurrentPageNumber = false;
                    this.LblPageNumber.ForeColor = Color.Black;
                }
            }
        }

        private void LblPageNumberClick(object sender, EventArgs e)
        {
            if (PageNumberClick != null)
            {
                PageNumberClick(this, e);
            }
        }
    }
}
