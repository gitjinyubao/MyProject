namespace Oes.Entity.Custom
{
    partial class NoticeIterm
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
            this.lblNumberNotice = new System.Windows.Forms.Label();
            this.lblNoticeIterm = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.lblTitle = new System.Windows.Forms.Label();
            this.lblTime = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblNumberNotice
            // 
            this.lblNumberNotice.BackColor = System.Drawing.Color.White;
            this.lblNumberNotice.Location = new System.Drawing.Point(0, 0);
            this.lblNumberNotice.Name = "lblNumberNotice";
            this.lblNumberNotice.Size = new System.Drawing.Size(20, 20);
            this.lblNumberNotice.TabIndex = 0;
            this.lblNumberNotice.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            // 
            // lblNoticeIterm
            // 
            this.lblNoticeIterm.Font = new System.Drawing.Font("Arial", 9F);
            this.lblNoticeIterm.Location = new System.Drawing.Point(21, 1);
            this.lblNoticeIterm.Name = "lblNoticeIterm";
            this.lblNoticeIterm.Size = new System.Drawing.Size(107, 18);
            this.lblNoticeIterm.TabIndex = 1;
            this.lblNoticeIterm.Text = "Please attend the ";
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Arial", 9F);
            this.label1.Location = new System.Drawing.Point(231, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(56, 18);
            this.label1.TabIndex = 2;
            this.label1.Text = "exam on";
            // 
            // lblTitle
            // 
            this.lblTitle.BackColor = System.Drawing.Color.White;
            this.lblTitle.Font = new System.Drawing.Font("Arial", 9F);
            this.lblTitle.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(103)))), ((int)(((byte)(147)))));
            this.lblTitle.Location = new System.Drawing.Point(121, 0);
            this.lblTitle.Name = "lblTitle";
            this.lblTitle.Size = new System.Drawing.Size(113, 18);
            this.lblTitle.TabIndex = 3;
            this.lblTitle.Text = "\"Test performance\" ";
            // 
            // lblTime
            // 
            this.lblTime.Font = new System.Drawing.Font("Arial", 9F);
            this.lblTime.Location = new System.Drawing.Point(283, 0);
            this.lblTime.Name = "lblTime";
            this.lblTime.Size = new System.Drawing.Size(152, 18);
            this.lblTime.TabIndex = 4;
            this.lblTime.Text = "2014-09-01 at 11:00:00";
            // 
            // NoticeIterm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.lblTime);
            this.Controls.Add(this.lblTitle);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblNoticeIterm);
            this.Controls.Add(this.lblNumberNotice);
            this.Font = new System.Drawing.Font("Arial", 10.5F);
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "NoticeIterm";
            this.Size = new System.Drawing.Size(680, 20);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lblNumberNotice;
        private System.Windows.Forms.Label lblNoticeIterm;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblTitle;
        private System.Windows.Forms.Label lblTime;
    }
}
