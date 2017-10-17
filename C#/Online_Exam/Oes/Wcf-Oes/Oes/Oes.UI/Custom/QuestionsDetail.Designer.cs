namespace Oes.Entity.Custom
{
    partial class QuestionsDetail
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
            this.LblQuestionsNumber = new System.Windows.Forms.Label();
            this.LblQuestionsTitle = new System.Windows.Forms.Label();
            this.RdoQuestionsA = new System.Windows.Forms.RadioButton();
            this.RdoQuestionsB = new System.Windows.Forms.RadioButton();
            this.RdoQuestionsC = new System.Windows.Forms.RadioButton();
            this.RdoQuestionsD = new System.Windows.Forms.RadioButton();
            this.LblQuestionsStatus = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // LblQuestionsNumber
            // 
            this.LblQuestionsNumber.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.LblQuestionsNumber.Location = new System.Drawing.Point(70, 5);
            this.LblQuestionsNumber.Name = "LblQuestionsNumber";
            this.LblQuestionsNumber.Size = new System.Drawing.Size(30, 23);
            this.LblQuestionsNumber.TabIndex = 1;
            this.LblQuestionsNumber.Text = "1";
            this.LblQuestionsNumber.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // LblQuestionsTitle
            // 
            this.LblQuestionsTitle.BackColor = System.Drawing.Color.White;
            this.LblQuestionsTitle.Font = new System.Drawing.Font("Arial", 10.5F);
            this.LblQuestionsTitle.Location = new System.Drawing.Point(110, 5);
            this.LblQuestionsTitle.Name = "LblQuestionsTitle";
            this.LblQuestionsTitle.Size = new System.Drawing.Size(703, 23);
            this.LblQuestionsTitle.TabIndex = 18;
            this.LblQuestionsTitle.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // RdoQuestionsA
            // 
            this.RdoQuestionsA.Enabled = false;
            this.RdoQuestionsA.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.RdoQuestionsA.Location = new System.Drawing.Point(113, 53);
            this.RdoQuestionsA.Name = "RdoQuestionsA";
            this.RdoQuestionsA.Size = new System.Drawing.Size(700, 20);
            this.RdoQuestionsA.TabIndex = 19;
            this.RdoQuestionsA.TabStop = true;
            this.RdoQuestionsA.Text = "radioButton1";
            this.RdoQuestionsA.UseVisualStyleBackColor = true;
            // 
            // RdoQuestionsB
            // 
            this.RdoQuestionsB.Enabled = false;
            this.RdoQuestionsB.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.RdoQuestionsB.Location = new System.Drawing.Point(113, 93);
            this.RdoQuestionsB.Name = "RdoQuestionsB";
            this.RdoQuestionsB.Size = new System.Drawing.Size(700, 20);
            this.RdoQuestionsB.TabIndex = 20;
            this.RdoQuestionsB.TabStop = true;
            this.RdoQuestionsB.Text = "radioButton2";
            this.RdoQuestionsB.UseVisualStyleBackColor = true;
            // 
            // RdoQuestionsC
            // 
            this.RdoQuestionsC.Enabled = false;
            this.RdoQuestionsC.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.RdoQuestionsC.Location = new System.Drawing.Point(113, 133);
            this.RdoQuestionsC.Name = "RdoQuestionsC";
            this.RdoQuestionsC.Size = new System.Drawing.Size(700, 20);
            this.RdoQuestionsC.TabIndex = 21;
            this.RdoQuestionsC.TabStop = true;
            this.RdoQuestionsC.Text = "radioButton3";
            this.RdoQuestionsC.UseVisualStyleBackColor = true;
            // 
            // RdoQuestionsD
            // 
            this.RdoQuestionsD.Enabled = false;
            this.RdoQuestionsD.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.RdoQuestionsD.Location = new System.Drawing.Point(113, 173);
            this.RdoQuestionsD.Name = "RdoQuestionsD";
            this.RdoQuestionsD.Size = new System.Drawing.Size(700, 20);
            this.RdoQuestionsD.TabIndex = 22;
            this.RdoQuestionsD.TabStop = true;
            this.RdoQuestionsD.Text = "radioButton4";
            this.RdoQuestionsD.UseVisualStyleBackColor = true;
            // 
            // LblQuestionsStatus
            // 
            this.LblQuestionsStatus.Image = global::Oes.Entity.Properties.Resources.ICN_Wrong_15x15;
            this.LblQuestionsStatus.Location = new System.Drawing.Point(0, 0);
            this.LblQuestionsStatus.Name = "LblQuestionsStatus";
            this.LblQuestionsStatus.Size = new System.Drawing.Size(30, 30);
            this.LblQuestionsStatus.TabIndex = 0;
            // 
            // QuestionsDetail
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.RdoQuestionsD);
            this.Controls.Add(this.RdoQuestionsC);
            this.Controls.Add(this.RdoQuestionsB);
            this.Controls.Add(this.RdoQuestionsA);
            this.Controls.Add(this.LblQuestionsTitle);
            this.Controls.Add(this.LblQuestionsNumber);
            this.Controls.Add(this.LblQuestionsStatus);
            this.Font = new System.Drawing.Font("Arial", 10.5F);
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "QuestionsDetail";
            this.Size = new System.Drawing.Size(814, 198);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label LblQuestionsStatus;
        private System.Windows.Forms.Label LblQuestionsNumber;
        private System.Windows.Forms.Label LblQuestionsTitle;
        private System.Windows.Forms.RadioButton RdoQuestionsA;
        private System.Windows.Forms.RadioButton RdoQuestionsB;
        private System.Windows.Forms.RadioButton RdoQuestionsC;
        private System.Windows.Forms.RadioButton RdoQuestionsD;
    }
}
