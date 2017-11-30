namespace Oes.Entity
{
    partial class examScoreForm
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

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.ExamTabPageTitleHead = new Oes.Entity.Custom.ExamTabPageTitleHead();
            this.lblQuestiosTitle = new System.Windows.Forms.Label();
            this.btnGoToExamDetail = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // ExamTabPageTitleHead
            // 
            this.ExamTabPageTitleHead.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.ExamTabPageTitleHead.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.ExamTabPageTitleHead.Location = new System.Drawing.Point(0, 0);
            this.ExamTabPageTitleHead.Margin = new System.Windows.Forms.Padding(0);
            this.ExamTabPageTitleHead.Name = "ExamTabPageTitleHead";
            this.ExamTabPageTitleHead.Size = new System.Drawing.Size(1020, 28);
            this.ExamTabPageTitleHead.TabIndex = 0;
            // 
            // lblQuestiosTitle
            // 
            this.lblQuestiosTitle.BackColor = System.Drawing.Color.White;
            this.lblQuestiosTitle.Font = new System.Drawing.Font("Arial", 13.5F);
            this.lblQuestiosTitle.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(10)))), ((int)(((byte)(10)))), ((int)(((byte)(10)))));
            this.lblQuestiosTitle.Location = new System.Drawing.Point(228, 252);
            this.lblQuestiosTitle.Name = "lblQuestiosTitle";
            this.lblQuestiosTitle.Size = new System.Drawing.Size(573, 23);
            this.lblQuestiosTitle.TabIndex = 4;
            this.lblQuestiosTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btnGoToExamDetail
            // 
            this.btnGoToExamDetail.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(153)))), ((int)(((byte)(1)))));
            this.btnGoToExamDetail.FlatAppearance.BorderSize = 2;
            this.btnGoToExamDetail.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnGoToExamDetail.Font = new System.Drawing.Font("Arial", 10.5F);
            this.btnGoToExamDetail.Location = new System.Drawing.Point(390, 359);
            this.btnGoToExamDetail.Name = "btnGoToExamDetail";
            this.btnGoToExamDetail.Size = new System.Drawing.Size(220, 30);
            this.btnGoToExamDetail.TabIndex = 6;
            this.btnGoToExamDetail.Text = "View the exam results detail";
            this.btnGoToExamDetail.UseVisualStyleBackColor = true;
            // 
            // examScoreForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(1020, 734);
            this.Controls.Add(this.btnGoToExamDetail);
            this.Controls.Add(this.lblQuestiosTitle);
            this.Controls.Add(this.ExamTabPageTitleHead);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "examScoreForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "ExamScoreForm";
            this.ResumeLayout(false);

        }

        #endregion

        private Custom.ExamTabPageTitleHead ExamTabPageTitleHead;
        private System.Windows.Forms.Label lblQuestiosTitle;
        private System.Windows.Forms.Button btnGoToExamDetail;
    }
}