namespace Oes.Entity.Custom
{
    partial class MyHome
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
            this.lblNotice = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.lblline = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.lblNoticeTitle = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblNotice
            // 
            this.lblNotice.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.lblNotice.Font = new System.Drawing.Font("Arial", 10.5F);
            this.lblNotice.ForeColor = System.Drawing.Color.White;
            this.lblNotice.Location = new System.Drawing.Point(13, 30);
            this.lblNotice.Name = "lblNotice";
            this.lblNotice.Size = new System.Drawing.Size(160, 30);
            this.lblNotice.TabIndex = 0;
            this.lblNotice.Text = "Notice";
            this.lblNotice.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label1
            // 
            this.label1.BackColor = System.Drawing.Color.White;
            this.label1.Font = new System.Drawing.Font("Arial", 10.5F);
            this.label1.Location = new System.Drawing.Point(13, 60);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(160, 30);
            this.label1.TabIndex = 1;
            this.label1.Text = "About";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblline
            // 
            this.lblline.BackColor = System.Drawing.Color.Black;
            this.lblline.Location = new System.Drawing.Point(200, 0);
            this.lblline.Name = "lblline";
            this.lblline.Size = new System.Drawing.Size(1, 650);
            this.lblline.TabIndex = 2;
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.White;
            this.panel1.Controls.Add(this.label2);
            this.panel1.Controls.Add(this.lblNoticeTitle);
            this.panel1.Location = new System.Drawing.Point(250, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(685, 500);
            this.panel1.TabIndex = 3;
            // 
            // lblNoticeTitle
            // 
            this.lblNoticeTitle.BackColor = System.Drawing.Color.White;
            this.lblNoticeTitle.Font = new System.Drawing.Font("Arial", 10.5F, System.Drawing.FontStyle.Bold);
            this.lblNoticeTitle.Location = new System.Drawing.Point(0, 0);
            this.lblNoticeTitle.Name = "lblNoticeTitle";
            this.lblNoticeTitle.Size = new System.Drawing.Size(100, 23);
            this.lblNoticeTitle.TabIndex = 0;
            this.lblNoticeTitle.Text = "Notice";
            this.lblNoticeTitle.TextAlign = System.Drawing.ContentAlignment.BottomLeft;
            // 
            // label2
            // 
            this.label2.Font = new System.Drawing.Font("Arial", 10.5F);
            this.label2.Location = new System.Drawing.Point(0, 53);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(588, 23);
            this.label2.TabIndex = 1;
            this.label2.Text = "1. xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx.";
            // 
            // MyHome
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.lblline);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblNotice);
            this.Name = "MyHome";
            this.Size = new System.Drawing.Size(984, 642);
            this.panel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lblNotice;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblline;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label lblNoticeTitle;
        private System.Windows.Forms.Label label2;

    }
}
