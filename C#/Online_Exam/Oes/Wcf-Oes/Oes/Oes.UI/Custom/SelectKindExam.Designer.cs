﻿namespace Oes.Entity.Custom
{
    partial class SelectKindExam
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(SelectKindExam));
            this.LblSelectExamKind = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // LblSelectExamKind
            // 
            resources.ApplyResources(this.LblSelectExamKind, "LblSelectExamKind");
            this.LblSelectExamKind.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.LblSelectExamKind.ForeColor = System.Drawing.Color.White;
            this.LblSelectExamKind.Name = "LblSelectExamKind";
            // 
            // SelectKindExam
            // 
            resources.ApplyResources(this, "$this");
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.LblSelectExamKind);
            this.Name = "SelectKindExam";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label LblSelectExamKind;

    }
}
