using System;
using System.Windows.Forms;

namespace Oes.Entity.Custom
{
    public partial class ExamTabPageTitleHead : UserControl
    {
        public event EventHandler ClosFormClick;

        public event EventHandler MinimizeClick;

        public ExamTabPageTitleHead()
        {
            InitializeComponent();

            this.LblCloseForm.Click += new EventHandler(LblCloseFormClick);

            this.LblMakeFormSmal.Click += new EventHandler(LblMakeFormSmalClick);
        }

        private void LblMakeFormSmalClick(object sender, EventArgs e)
        {
            if (this.MinimizeClick != null)
            {
                MinimizeClick(this, e);
            }
        }

        private void LblCloseFormClick(object sender, EventArgs e)
        {
            if (ClosFormClick != null)
            {
                ClosFormClick(this, e);
            }
        }
    }
}
