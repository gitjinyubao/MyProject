using System.Drawing;
namespace Oes.Entity
{
    partial class loginForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(loginForm));
            this.txtUserName = new System.Windows.Forms.TextBox();
            this.pnlUserName = new System.Windows.Forms.Panel();
            this.lblNamePicture = new System.Windows.Forms.Label();
            this.PnlPassword = new System.Windows.Forms.Panel();
            this.txtPassword = new System.Windows.Forms.TextBox();
            this.lblPasswordPicture = new System.Windows.Forms.Label();
            this.btnLogin = new System.Windows.Forms.Button();
            this.lblForgot = new System.Windows.Forms.Label();
            this.chxRember = new System.Windows.Forms.CheckBox();
            this.lblNavigation = new System.Windows.Forms.Label();
            this.lblErrorMessage = new System.Windows.Forms.Label();
            this.lblCloseLoginForm = new System.Windows.Forms.Label();
            this.lblLogo = new System.Windows.Forms.Label();
            this.lblPasswordWrong = new System.Windows.Forms.Label();
            this.lblUserNameWrong = new System.Windows.Forms.Label();
            this.lblLoginLogo = new System.Windows.Forms.Label();
            this.pnlUserName.SuspendLayout();
            this.PnlPassword.SuspendLayout();
            this.SuspendLayout();
            // 
            // txtUserName
            // 
            this.txtUserName.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.txtUserName.ForeColor = System.Drawing.Color.Gray;
            resources.ApplyResources(this.txtUserName, "txtUserName");
            this.txtUserName.Name = "txtUserName";
            this.txtUserName.ShortcutsEnabled = false;
            // 
            // pnlUserName
            // 
            this.pnlUserName.BackColor = System.Drawing.Color.White;
            resources.ApplyResources(this.pnlUserName, "pnlUserName");
            this.pnlUserName.Controls.Add(this.txtUserName);
            this.pnlUserName.Controls.Add(this.lblNamePicture);
            this.pnlUserName.Name = "pnlUserName";
            // 
            // lblNamePicture
            // 
            this.lblNamePicture.BackColor = System.Drawing.Color.White;
            resources.ApplyResources(this.lblNamePicture, "lblNamePicture");
            this.lblNamePicture.Name = "lblNamePicture";
            // 
            // PnlPassword
            // 
            this.PnlPassword.BackColor = System.Drawing.Color.White;
            resources.ApplyResources(this.PnlPassword, "PnlPassword");
            this.PnlPassword.Controls.Add(this.txtPassword);
            this.PnlPassword.Controls.Add(this.lblPasswordPicture);
            this.PnlPassword.Name = "PnlPassword";
            // 
            // txtPassword
            // 
            this.txtPassword.BorderStyle = System.Windows.Forms.BorderStyle.None;
            resources.ApplyResources(this.txtPassword, "txtPassword");
            this.txtPassword.ForeColor = System.Drawing.Color.Gray;
            this.txtPassword.Name = "txtPassword";
            // 
            // lblPasswordPicture
            // 
            this.lblPasswordPicture.BackColor = System.Drawing.Color.White;
            resources.ApplyResources(this.lblPasswordPicture, "lblPasswordPicture");
            this.lblPasswordPicture.Name = "lblPasswordPicture";
            // 
            // btnLogin
            // 
            this.btnLogin.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(153)))), ((int)(((byte)(1)))));
            resources.ApplyResources(this.btnLogin, "btnLogin");
            this.btnLogin.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.btnLogin.Name = "btnLogin";
            this.btnLogin.UseVisualStyleBackColor = false;
            // 
            // lblForgot
            // 
            resources.ApplyResources(this.lblForgot, "lblForgot");
            this.lblForgot.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.lblForgot.Name = "lblForgot";
            // 
            // chxRember
            // 
            resources.ApplyResources(this.chxRember, "chxRember");
            this.chxRember.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.chxRember.Name = "chxRember";
            this.chxRember.UseVisualStyleBackColor = true;
            // 
            // lblNavigation
            // 
            this.lblNavigation.BackColor = System.Drawing.Color.White;
            this.lblNavigation.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            resources.ApplyResources(this.lblNavigation, "lblNavigation");
            this.lblNavigation.Name = "lblNavigation";
            // 
            // lblErrorMessage
            // 
            this.lblErrorMessage.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(252)))), ((int)(((byte)(203)))), ((int)(((byte)(155)))));
            resources.ApplyResources(this.lblErrorMessage, "lblErrorMessage");
            this.lblErrorMessage.ForeColor = System.Drawing.Color.Red;
            this.lblErrorMessage.Name = "lblErrorMessage";
            // 
            // lblCloseLoginForm
            // 
            this.lblCloseLoginForm.BackColor = System.Drawing.Color.White;
            resources.ApplyResources(this.lblCloseLoginForm, "lblCloseLoginForm");
            this.lblCloseLoginForm.Name = "lblCloseLoginForm";
            // 
            // lblLogo
            // 
            this.lblLogo.BackColor = System.Drawing.Color.White;
            resources.ApplyResources(this.lblLogo, "lblLogo");
            this.lblLogo.Name = "lblLogo";
            // 
            // lblPasswordWrong
            // 
            resources.ApplyResources(this.lblPasswordWrong, "lblPasswordWrong");
            this.lblPasswordWrong.Name = "lblPasswordWrong";
            // 
            // lblUserNameWrong
            // 
            resources.ApplyResources(this.lblUserNameWrong, "lblUserNameWrong");
            this.lblUserNameWrong.Name = "lblUserNameWrong";
            // 
            // lblLoginLogo
            // 
            resources.ApplyResources(this.lblLoginLogo, "lblLoginLogo");
            this.lblLoginLogo.Name = "lblLoginLogo";
            // 
            // loginForm
            // 
            resources.ApplyResources(this, "$this");
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(46)))), ((int)(((byte)(67)))), ((int)(((byte)(88)))));
            this.Controls.Add(this.lblCloseLoginForm);
            this.Controls.Add(this.lblLogo);
            this.Controls.Add(this.lblPasswordWrong);
            this.Controls.Add(this.lblUserNameWrong);
            this.Controls.Add(this.lblErrorMessage);
            this.Controls.Add(this.lblNavigation);
            this.Controls.Add(this.chxRember);
            this.Controls.Add(this.lblForgot);
            this.Controls.Add(this.btnLogin);
            this.Controls.Add(this.PnlPassword);
            this.Controls.Add(this.pnlUserName);
            this.Controls.Add(this.lblLoginLogo);
            this.ForeColor = System.Drawing.Color.Black;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "loginForm";
            this.ShowIcon = false;
            this.pnlUserName.ResumeLayout(false);
            this.pnlUserName.PerformLayout();
            this.PnlPassword.ResumeLayout(false);
            this.PnlPassword.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblLoginLogo;
        private System.Windows.Forms.TextBox txtUserName;
        private System.Windows.Forms.Panel pnlUserName;
        private System.Windows.Forms.Label lblNamePicture;
        private System.Windows.Forms.Panel PnlPassword;
        private System.Windows.Forms.TextBox txtPassword;
        private System.Windows.Forms.Label lblPasswordPicture;
        private System.Windows.Forms.Button btnLogin;
        private System.Windows.Forms.Label lblForgot;
        private System.Windows.Forms.CheckBox chxRember;
        private System.Windows.Forms.Label lblNavigation;
        private System.Windows.Forms.Label lblErrorMessage;
        private System.Windows.Forms.Label lblUserNameWrong;
        private System.Windows.Forms.Label lblPasswordWrong;
        private System.Windows.Forms.Label lblLogo;
        private System.Windows.Forms.Label lblCloseLoginForm;
    }
}

