namespace Oes.Entity.Custom
{
    partial class ExamTabPageTitleBottom
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(ExamTabPageTitleBottom));
            this.LblExamList = new System.Windows.Forms.Label();
            this.LblLogout = new System.Windows.Forms.Label();
            this.LblChineseLanguage = new System.Windows.Forms.Label();
            this.LblUserName = new System.Windows.Forms.Label();
            this.LblUserPicture = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // LblExamList
            // 
            this.LblExamList.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(210)))), ((int)(((byte)(218)))), ((int)(((byte)(227)))));
            this.LblExamList.Font = new System.Drawing.Font("Arial", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LblExamList.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.LblExamList.Location = new System.Drawing.Point(23, 0);
            this.LblExamList.Margin = new System.Windows.Forms.Padding(0);
            this.LblExamList.Name = "LblExamList";
            this.LblExamList.Size = new System.Drawing.Size(127, 40);
            this.LblExamList.TabIndex = 0;
            this.LblExamList.Text = "Exam List";
            this.LblExamList.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // LblLogout
            // 
            this.LblLogout.Font = new System.Drawing.Font("Arial", 10.5F);
            this.LblLogout.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.LblLogout.Location = new System.Drawing.Point(950, 8);
            this.LblLogout.Margin = new System.Windows.Forms.Padding(0);
            this.LblLogout.Name = "LblLogout";
            this.LblLogout.Size = new System.Drawing.Size(55, 22);
            this.LblLogout.TabIndex = 1;
            this.LblLogout.Text = "Logout";
            this.LblLogout.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // LblChineseLanguage
            // 
            this.LblChineseLanguage.Font = new System.Drawing.Font("Arial", 10.5F);
            this.LblChineseLanguage.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.LblChineseLanguage.Location = new System.Drawing.Point(908, 14);
            this.LblChineseLanguage.Margin = new System.Windows.Forms.Padding(0);
            this.LblChineseLanguage.Name = "LblChineseLanguage";
            this.LblChineseLanguage.Size = new System.Drawing.Size(42, 19);
            this.LblChineseLanguage.TabIndex = 2;
            this.LblChineseLanguage.Text = "中文";
            // 
            // LblUserName
            // 
            this.LblUserName.Font = new System.Drawing.Font("Arial", 10.5F);
            this.LblUserName.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(103)))), ((int)(((byte)(147)))));
            this.LblUserName.Location = new System.Drawing.Point(824, 0);
            this.LblUserName.Name = "LblUserName";
            this.LblUserName.Size = new System.Drawing.Size(81, 40);
            this.LblUserName.TabIndex = 3;
            this.LblUserName.Text = "name";
            this.LblUserName.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // LblUserPicture
            // 
            this.LblUserPicture.Image = ((System.Drawing.Image)(resources.GetObject("LblUserPicture.Image")));
            this.LblUserPicture.Location = new System.Drawing.Point(795, 8);
            this.LblUserPicture.Name = "LblUserPicture";
            this.LblUserPicture.Size = new System.Drawing.Size(23, 25);
            this.LblUserPicture.TabIndex = 4;
            // 
            // ExamTabPageTitleBottom
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.LblUserPicture);
            this.Controls.Add(this.LblUserName);
            this.Controls.Add(this.LblChineseLanguage);
            this.Controls.Add(this.LblLogout);
            this.Controls.Add(this.LblExamList);
            this.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(0);
            this.Name = "ExamTabPageTitleBottom";
            this.Size = new System.Drawing.Size(1024, 40);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label LblExamList;
        private System.Windows.Forms.Label LblLogout;
        private System.Windows.Forms.Label LblChineseLanguage;
        private System.Windows.Forms.Label LblUserName;
        private System.Windows.Forms.Label LblUserPicture;
    }
}
