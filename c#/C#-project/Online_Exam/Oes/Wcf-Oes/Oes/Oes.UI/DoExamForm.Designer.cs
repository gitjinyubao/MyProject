namespace Oes.Entity
{
    partial class DoExamForm
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
            this.components = new System.ComponentModel.Container();
            this.pnlBody = new System.Windows.Forms.Panel();
            this.lblNextQuestions = new System.Windows.Forms.Label();
            this.pnlMainBody = new System.Windows.Forms.Panel();
            this.rdoQuestionsD = new System.Windows.Forms.RadioButton();
            this.rdoQuestionsC = new System.Windows.Forms.RadioButton();
            this.rdoQuestionsB = new System.Windows.Forms.RadioButton();
            this.rdoQuestionsA = new System.Windows.Forms.RadioButton();
            this.lblQuestiosTitle = new System.Windows.Forms.Label();
            this.pnlMainHeader = new System.Windows.Forms.Panel();
            this.LblShowTime = new System.Windows.Forms.Label();
            this.lblTimin = new System.Windows.Forms.Label();
            this.LblQuestionNumber = new System.Windows.Forms.Label();
            this.lblChioceStander = new System.Windows.Forms.Label();
            this.lblChioce = new System.Windows.Forms.Label();
            this.tirExamTime = new System.Windows.Forms.Timer(this.components);
            this.examTabPageTitleHead = new Oes.Entity.Custom.ExamTabPageTitleHead();
            this.pnlBody.SuspendLayout();
            this.pnlMainBody.SuspendLayout();
            this.pnlMainHeader.SuspendLayout();
            this.SuspendLayout();
            // 
            // pnlBody
            // 
            this.pnlBody.Controls.Add(this.lblNextQuestions);
            this.pnlBody.Controls.Add(this.pnlMainBody);
            this.pnlBody.Controls.Add(this.pnlMainHeader);
            this.pnlBody.Location = new System.Drawing.Point(34, 70);
            this.pnlBody.Name = "pnlBody";
            this.pnlBody.Size = new System.Drawing.Size(956, 525);
            this.pnlBody.TabIndex = 1;
            // 
            // lblNextQuestions
            // 
            this.lblNextQuestions.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(153)))), ((int)(((byte)(1)))));
            this.lblNextQuestions.Font = new System.Drawing.Font("Arial", 10.5F);
            this.lblNextQuestions.ForeColor = System.Drawing.Color.White;
            this.lblNextQuestions.Location = new System.Drawing.Point(424, 495);
            this.lblNextQuestions.Name = "lblNextQuestions";
            this.lblNextQuestions.Size = new System.Drawing.Size(162, 30);
            this.lblNextQuestions.TabIndex = 8;
            this.lblNextQuestions.Text = "Next Questions";
            this.lblNextQuestions.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pnlMainBody
            // 
            this.pnlMainBody.Controls.Add(this.rdoQuestionsD);
            this.pnlMainBody.Controls.Add(this.rdoQuestionsC);
            this.pnlMainBody.Controls.Add(this.rdoQuestionsB);
            this.pnlMainBody.Controls.Add(this.rdoQuestionsA);
            this.pnlMainBody.Controls.Add(this.lblQuestiosTitle);
            this.pnlMainBody.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pnlMainBody.Location = new System.Drawing.Point(109, 92);
            this.pnlMainBody.Name = "pnlMainBody";
            this.pnlMainBody.Size = new System.Drawing.Size(650, 227);
            this.pnlMainBody.TabIndex = 1;
            // 
            // rdoQuestionsD
            // 
            this.rdoQuestionsD.AutoSize = true;
            this.rdoQuestionsD.Font = new System.Drawing.Font("Arial", 12.5F, System.Drawing.FontStyle.Bold);
            this.rdoQuestionsD.Location = new System.Drawing.Point(60, 200);
            this.rdoQuestionsD.Name = "rdoQuestionsD";
            this.rdoQuestionsD.Size = new System.Drawing.Size(130, 23);
            this.rdoQuestionsD.TabIndex = 7;
            this.rdoQuestionsD.TabStop = true;
            this.rdoQuestionsD.Text = "radioButton4";
            this.rdoQuestionsD.UseVisualStyleBackColor = true;
            // 
            // rdoQuestionsC
            // 
            this.rdoQuestionsC.AutoSize = true;
            this.rdoQuestionsC.Font = new System.Drawing.Font("Arial", 12.5F, System.Drawing.FontStyle.Bold);
            this.rdoQuestionsC.Location = new System.Drawing.Point(60, 170);
            this.rdoQuestionsC.Name = "rdoQuestionsC";
            this.rdoQuestionsC.Size = new System.Drawing.Size(130, 23);
            this.rdoQuestionsC.TabIndex = 6;
            this.rdoQuestionsC.TabStop = true;
            this.rdoQuestionsC.Text = "radioButton3";
            this.rdoQuestionsC.UseVisualStyleBackColor = true;
            // 
            // rdoQuestionsB
            // 
            this.rdoQuestionsB.AutoSize = true;
            this.rdoQuestionsB.Font = new System.Drawing.Font("Arial", 12.5F, System.Drawing.FontStyle.Bold);
            this.rdoQuestionsB.Location = new System.Drawing.Point(60, 140);
            this.rdoQuestionsB.Name = "rdoQuestionsB";
            this.rdoQuestionsB.Size = new System.Drawing.Size(130, 23);
            this.rdoQuestionsB.TabIndex = 5;
            this.rdoQuestionsB.TabStop = true;
            this.rdoQuestionsB.Text = "radioButton2";
            this.rdoQuestionsB.UseVisualStyleBackColor = true;
            // 
            // rdoQuestionsA
            // 
            this.rdoQuestionsA.AutoSize = true;
            this.rdoQuestionsA.Font = new System.Drawing.Font("Arial", 12.5F, System.Drawing.FontStyle.Bold);
            this.rdoQuestionsA.Location = new System.Drawing.Point(60, 110);
            this.rdoQuestionsA.Name = "rdoQuestionsA";
            this.rdoQuestionsA.Size = new System.Drawing.Size(130, 23);
            this.rdoQuestionsA.TabIndex = 4;
            this.rdoQuestionsA.TabStop = true;
            this.rdoQuestionsA.Text = "radioButton1";
            this.rdoQuestionsA.UseVisualStyleBackColor = true;
            // 
            // lblQuestiosTitle
            // 
            this.lblQuestiosTitle.BackColor = System.Drawing.Color.White;
            this.lblQuestiosTitle.Font = new System.Drawing.Font("Arial", 12.5F, System.Drawing.FontStyle.Bold);
            this.lblQuestiosTitle.Location = new System.Drawing.Point(57, 60);
            this.lblQuestiosTitle.Name = "lblQuestiosTitle";
            this.lblQuestiosTitle.Size = new System.Drawing.Size(573, 23);
            this.lblQuestiosTitle.TabIndex = 3;
            this.lblQuestiosTitle.Text = "QuestionsTitle";
            this.lblQuestiosTitle.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // pnlMainHeader
            // 
            this.pnlMainHeader.Controls.Add(this.LblShowTime);
            this.pnlMainHeader.Controls.Add(this.lblTimin);
            this.pnlMainHeader.Controls.Add(this.LblQuestionNumber);
            this.pnlMainHeader.Controls.Add(this.lblChioceStander);
            this.pnlMainHeader.Controls.Add(this.lblChioce);
            this.pnlMainHeader.Location = new System.Drawing.Point(0, 0);
            this.pnlMainHeader.Name = "pnlMainHeader";
            this.pnlMainHeader.Size = new System.Drawing.Size(960, 50);
            this.pnlMainHeader.TabIndex = 0;
            // 
            // LblShowTime
            // 
            this.LblShowTime.BackColor = System.Drawing.Color.White;
            this.LblShowTime.Font = new System.Drawing.Font("Arial", 23F);
            this.LblShowTime.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(153)))), ((int)(((byte)(1)))));
            this.LblShowTime.Location = new System.Drawing.Point(695, 5);
            this.LblShowTime.Name = "LblShowTime";
            this.LblShowTime.Size = new System.Drawing.Size(138, 40);
            this.LblShowTime.TabIndex = 4;
            this.LblShowTime.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblTimin
            // 
            this.lblTimin.BackColor = System.Drawing.Color.White;
            this.lblTimin.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.lblTimin.Location = new System.Drawing.Point(627, 20);
            this.lblTimin.Name = "lblTimin";
            this.lblTimin.Size = new System.Drawing.Size(46, 23);
            this.lblTimin.TabIndex = 3;
            this.lblTimin.Text = "Timing";
            this.lblTimin.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // LblQuestionNumber
            // 
            this.LblQuestionNumber.BackColor = System.Drawing.Color.White;
            this.LblQuestionNumber.Font = new System.Drawing.Font("Arial", 12.5F, System.Drawing.FontStyle.Bold);
            this.LblQuestionNumber.Location = new System.Drawing.Point(484, 16);
            this.LblQuestionNumber.Name = "LblQuestionNumber";
            this.LblQuestionNumber.Size = new System.Drawing.Size(64, 23);
            this.LblQuestionNumber.TabIndex = 2;
            this.LblQuestionNumber.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblChioceStander
            // 
            this.lblChioceStander.BackColor = System.Drawing.Color.White;
            this.lblChioceStander.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.lblChioceStander.Location = new System.Drawing.Point(106, 19);
            this.lblChioceStander.Name = "lblChioceStander";
            this.lblChioceStander.Size = new System.Drawing.Size(301, 23);
            this.lblChioceStander.TabIndex = 1;
            this.lblChioceStander.Text = "Only one correct answer, 5 points each .";
            this.lblChioceStander.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblChioce
            // 
            this.lblChioce.BackColor = System.Drawing.Color.White;
            this.lblChioce.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.lblChioce.Location = new System.Drawing.Point(30, 19);
            this.lblChioce.Name = "lblChioce";
            this.lblChioce.Size = new System.Drawing.Size(59, 23);
            this.lblChioce.TabIndex = 0;
            this.lblChioce.Text = "Chioce";
            this.lblChioce.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // tirExamTime
            // 
            this.tirExamTime.Enabled = true;
            this.tirExamTime.Interval = 1000;
            this.tirExamTime.Tick += new System.EventHandler(this.TirExamTimeTick);
            // 
            // examTabPageTitleHead
            // 
            this.examTabPageTitleHead.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.examTabPageTitleHead.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.examTabPageTitleHead.Location = new System.Drawing.Point(0, 0);
            this.examTabPageTitleHead.Margin = new System.Windows.Forms.Padding(0);
            this.examTabPageTitleHead.Name = "examTabPageTitleHead";
            this.examTabPageTitleHead.Size = new System.Drawing.Size(1024, 28);
            this.examTabPageTitleHead.TabIndex = 0;
            // 
            // DoExamForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(1020, 768);
            this.Controls.Add(this.pnlBody);
            this.Controls.Add(this.examTabPageTitleHead);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "DoExamForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "DoExam";
            this.pnlBody.ResumeLayout(false);
            this.pnlMainBody.ResumeLayout(false);
            this.pnlMainBody.PerformLayout();
            this.pnlMainHeader.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private Custom.ExamTabPageTitleHead examTabPageTitleHead;
        private System.Windows.Forms.Panel pnlBody;
        private System.Windows.Forms.Panel pnlMainBody;
        private System.Windows.Forms.Label lblQuestiosTitle;
        private System.Windows.Forms.RadioButton rdoQuestionsD;
        private System.Windows.Forms.RadioButton rdoQuestionsC;
        private System.Windows.Forms.RadioButton rdoQuestionsB;
        private System.Windows.Forms.RadioButton rdoQuestionsA;
        private System.Windows.Forms.Label lblNextQuestions;
        private System.Windows.Forms.Panel pnlMainHeader;
        private System.Windows.Forms.Label LblShowTime;
        private System.Windows.Forms.Label lblTimin;
        private System.Windows.Forms.Label LblQuestionNumber;
        private System.Windows.Forms.Label lblChioce;
        private System.Windows.Forms.Timer tirExamTime;
        private System.Windows.Forms.Label lblChioceStander;
    }
}