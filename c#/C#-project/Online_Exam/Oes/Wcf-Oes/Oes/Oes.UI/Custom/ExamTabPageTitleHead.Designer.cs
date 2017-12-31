namespace Oes.Entity.Custom
{
    partial class ExamTabPageTitleHead
    {
        /// <summary> 
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(ExamTabPageTitleHead));
            this.LblLogo = new System.Windows.Forms.Label();
            this.LblTitle = new System.Windows.Forms.Label();
            this.LblMakeFormSmal = new System.Windows.Forms.Label();
            this.LblMakeFormBig = new System.Windows.Forms.Label();
            this.LblCloseForm = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // LblLogo
            // 
            this.LblLogo.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.LblLogo.Image = ((System.Drawing.Image)(resources.GetObject("LblLogo.Image")));
            this.LblLogo.Location = new System.Drawing.Point(20, 4);
            this.LblLogo.Margin = new System.Windows.Forms.Padding(0);
            this.LblLogo.Name = "LblLogo";
            this.LblLogo.Size = new System.Drawing.Size(127, 20);
            this.LblLogo.TabIndex = 15;
            // 
            // LblTitle
            // 
            this.LblTitle.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblTitle.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.LblTitle.Location = new System.Drawing.Point(160, 8);
            this.LblTitle.Name = "LblTitle";
            this.LblTitle.Size = new System.Drawing.Size(177, 14);
            this.LblTitle.TabIndex = 16;
            this.LblTitle.Text = "Online Exam System Client";
            // 
            // LblMakeFormSmal
            // 
            this.LblMakeFormSmal.Image = ((System.Drawing.Image)(resources.GetObject("LblMakeFormSmal.Image")));
            this.LblMakeFormSmal.Location = new System.Drawing.Point(936, 12);
            this.LblMakeFormSmal.Margin = new System.Windows.Forms.Padding(0);
            this.LblMakeFormSmal.Name = "LblMakeFormSmal";
            this.LblMakeFormSmal.Size = new System.Drawing.Size(16, 16);
            this.LblMakeFormSmal.TabIndex = 17;
            // 
            // LblMakeFormBig
            // 
            this.LblMakeFormBig.Image = ((System.Drawing.Image)(resources.GetObject("LblMakeFormBig.Image")));
            this.LblMakeFormBig.Location = new System.Drawing.Point(962, 10);
            this.LblMakeFormBig.Margin = new System.Windows.Forms.Padding(0);
            this.LblMakeFormBig.Name = "LblMakeFormBig";
            this.LblMakeFormBig.Size = new System.Drawing.Size(16, 16);
            this.LblMakeFormBig.TabIndex = 18;
            // 
            // LblCloseForm
            // 
            this.LblCloseForm.Image = ((System.Drawing.Image)(resources.GetObject("LblCloseForm.Image")));
            this.LblCloseForm.Location = new System.Drawing.Point(988, 6);
            this.LblCloseForm.Margin = new System.Windows.Forms.Padding(0);
            this.LblCloseForm.Name = "LblCloseForm";
            this.LblCloseForm.Size = new System.Drawing.Size(16, 16);
            this.LblCloseForm.TabIndex = 19;
            // 
            // ExamTabPageTitle
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.Controls.Add(this.LblCloseForm);
            this.Controls.Add(this.LblMakeFormBig);
            this.Controls.Add(this.LblMakeFormSmal);
            this.Controls.Add(this.LblTitle);
            this.Controls.Add(this.LblLogo);
            this.Margin = new System.Windows.Forms.Padding(0);
            this.Name = "ExamTabPageTitle";
            this.Size = new System.Drawing.Size(1024, 28);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label LblLogo;
        private System.Windows.Forms.Label LblTitle;
        private System.Windows.Forms.Label LblMakeFormSmal;
        private System.Windows.Forms.Label LblMakeFormBig;
        private System.Windows.Forms.Label LblCloseForm;

    }
}
