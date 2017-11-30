namespace Oes.Entity.Custom
{
    partial class KindAbout
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
            this.lblSelectKindAbout = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblSelectKindAbout
            // 
            this.lblSelectKindAbout.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.lblSelectKindAbout.Font = new System.Drawing.Font("Arial", 10.5F);
            this.lblSelectKindAbout.ForeColor = System.Drawing.Color.White;
            this.lblSelectKindAbout.Location = new System.Drawing.Point(0, 0);
            this.lblSelectKindAbout.Name = "lblSelectKindAbout";
            this.lblSelectKindAbout.Size = new System.Drawing.Size(163, 38);
            this.lblSelectKindAbout.TabIndex = 2;
            this.lblSelectKindAbout.Text = "All";
            this.lblSelectKindAbout.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // KindAbout
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.lblSelectKindAbout);
            this.Font = new System.Drawing.Font("Arial", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "KindAbout";
            this.Size = new System.Drawing.Size(163, 36);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lblSelectKindAbout;
    }
}
