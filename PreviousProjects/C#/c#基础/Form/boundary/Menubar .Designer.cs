namespace boundary
{
    partial class Form1
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.defaultFont = new System.Windows.Forms.ToolStripMenuItem();
            this.defaultColor = new System.Windows.Forms.ToolStripMenuItem();
            this.字体FToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.A = new System.Windows.Forms.ToolStripMenuItem();
            this.B = new System.Windows.Forms.ToolStripMenuItem();
            this.颜色ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.red = new System.Windows.Forms.ToolStripMenuItem();
            this.blue = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStrip1 = new System.Windows.Forms.ToolStrip();
            this.tSBA = new System.Windows.Forms.ToolStripButton();
            this.tSBB = new System.Windows.Forms.ToolStripButton();
            this.tSBR = new System.Windows.Forms.ToolStripButton();
            this.tSBBL = new System.Windows.Forms.ToolStripButton();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.slFont = new System.Windows.Forms.ToolStripStatusLabel();
            this.slColor = new System.Windows.Forms.ToolStripStatusLabel();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.menuStrip1.SuspendLayout();
            this.contextMenuStrip1.SuspendLayout();
            this.toolStrip1.SuspendLayout();
            this.statusStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.ContextMenuStrip = this.contextMenuStrip1;
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.字体FToolStripMenuItem,
            this.颜色ToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(881, 25);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.defaultFont,
            this.defaultColor});
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(125, 48);
            // 
            // defaultFont
            // 
            this.defaultFont.Checked = true;
            this.defaultFont.CheckOnClick = true;
            this.defaultFont.CheckState = System.Windows.Forms.CheckState.Checked;
            this.defaultFont.Name = "defaultFont";
            this.defaultFont.Size = new System.Drawing.Size(124, 22);
            this.defaultFont.Text = "默认字体";
            this.defaultFont.Click += new System.EventHandler(this.defaultFont_Click);
            // 
            // defaultColor
            // 
            this.defaultColor.Checked = true;
            this.defaultColor.CheckState = System.Windows.Forms.CheckState.Checked;
            this.defaultColor.Name = "defaultColor";
            this.defaultColor.Size = new System.Drawing.Size(124, 22);
            this.defaultColor.Text = "默认颜色";
            this.defaultColor.Click += new System.EventHandler(this.defaultColor_Click);
            // 
            // 字体FToolStripMenuItem
            // 
            this.字体FToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.A,
            this.B});
            this.字体FToolStripMenuItem.Name = "字体FToolStripMenuItem";
            this.字体FToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.F)));
            this.字体FToolStripMenuItem.Size = new System.Drawing.Size(58, 21);
            this.字体FToolStripMenuItem.Text = "字体(F)";
            this.字体FToolStripMenuItem.Click += new System.EventHandler(this.字体FToolStripMenuItem_Click);
            // 
            // A
            // 
            this.A.CheckOnClick = true;
            this.A.Name = "A";
            this.A.Size = new System.Drawing.Size(100, 22);
            this.A.Text = "隶书";
            this.A.Click += new System.EventHandler(this.隶书ToolStripMenuItem_Click);
            // 
            // B
            // 
            this.B.CheckOnClick = true;
            this.B.Name = "B";
            this.B.Size = new System.Drawing.Size(100, 22);
            this.B.Text = "楷体";
            this.B.Click += new System.EventHandler(this.B_Click);
            // 
            // 颜色ToolStripMenuItem
            // 
            this.颜色ToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.red,
            this.blue});
            this.颜色ToolStripMenuItem.Name = "颜色ToolStripMenuItem";
            this.颜色ToolStripMenuItem.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.C)));
            this.颜色ToolStripMenuItem.Size = new System.Drawing.Size(60, 21);
            this.颜色ToolStripMenuItem.Text = "颜色(C)";
            // 
            // red
            // 
            this.red.CheckOnClick = true;
            this.red.Name = "red";
            this.red.Size = new System.Drawing.Size(100, 22);
            this.red.Text = "红色";
            this.red.Click += new System.EventHandler(this.红色ToolStripMenuItem_Click);
            // 
            // blue
            // 
            this.blue.CheckOnClick = true;
            this.blue.Name = "blue";
            this.blue.Size = new System.Drawing.Size(100, 22);
            this.blue.Text = "蓝色";
            this.blue.Click += new System.EventHandler(this.blue_Click);
            // 
            // toolStrip1
            // 
            this.toolStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.tSBA,
            this.tSBB,
            this.tSBR,
            this.tSBBL});
            this.toolStrip1.LayoutStyle = System.Windows.Forms.ToolStripLayoutStyle.Flow;
            this.toolStrip1.Location = new System.Drawing.Point(0, 25);
            this.toolStrip1.Name = "toolStrip1";
            this.toolStrip1.Size = new System.Drawing.Size(881, 23);
            this.toolStrip1.TabIndex = 2;
            this.toolStrip1.Text = "toolStrip1";
            // 
            // tSBA
            // 
            this.tSBA.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.tSBA.Image = ((System.Drawing.Image)(resources.GetObject("tSBA.Image")));
            this.tSBA.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tSBA.Name = "tSBA";
            this.tSBA.Size = new System.Drawing.Size(23, 20);
            this.tSBA.Text = "隶书";
            this.tSBA.Click += new System.EventHandler(this.tSBA_Click);
            // 
            // tSBB
            // 
            this.tSBB.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.tSBB.Image = ((System.Drawing.Image)(resources.GetObject("tSBB.Image")));
            this.tSBB.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tSBB.Name = "tSBB";
            this.tSBB.Size = new System.Drawing.Size(23, 20);
            this.tSBB.Text = "楷体";
            this.tSBB.Click += new System.EventHandler(this.tSBB_Click);
            // 
            // tSBR
            // 
            this.tSBR.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.tSBR.Image = ((System.Drawing.Image)(resources.GetObject("tSBR.Image")));
            this.tSBR.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tSBR.Name = "tSBR";
            this.tSBR.Size = new System.Drawing.Size(23, 20);
            this.tSBR.Text = "红色";
            this.tSBR.Click += new System.EventHandler(this.tSBR_Click);
            // 
            // tSBBL
            // 
            this.tSBBL.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.tSBBL.Image = ((System.Drawing.Image)(resources.GetObject("tSBBL.Image")));
            this.tSBBL.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.tSBBL.Name = "tSBBL";
            this.tSBBL.Size = new System.Drawing.Size(23, 20);
            this.tSBBL.Text = "蓝色";
            this.tSBBL.Click += new System.EventHandler(this.tSBBL_Click);
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(69, 116);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(335, 21);
            this.textBox1.TabIndex = 3;
            // 
            // statusStrip1
            // 
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.slFont,
            this.slColor});
            this.statusStrip1.Location = new System.Drawing.Point(0, 235);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(881, 26);
            this.statusStrip1.TabIndex = 4;
            this.statusStrip1.Text = "statusStrip1";
            // 
            // slFont
            // 
            this.slFont.BorderSides = ((System.Windows.Forms.ToolStripStatusLabelBorderSides)((((System.Windows.Forms.ToolStripStatusLabelBorderSides.Left | System.Windows.Forms.ToolStripStatusLabelBorderSides.Top)
                        | System.Windows.Forms.ToolStripStatusLabelBorderSides.Right)
                        | System.Windows.Forms.ToolStripStatusLabelBorderSides.Bottom)));
            this.slFont.BorderStyle = System.Windows.Forms.Border3DStyle.Sunken;
            this.slFont.Name = "slFont";
            this.slFont.Size = new System.Drawing.Size(36, 21);
            this.slFont.Text = "字体";
            // 
            // slColor
            // 
            this.slColor.BorderSides = ((System.Windows.Forms.ToolStripStatusLabelBorderSides)((((System.Windows.Forms.ToolStripStatusLabelBorderSides.Left | System.Windows.Forms.ToolStripStatusLabelBorderSides.Top)
                        | System.Windows.Forms.ToolStripStatusLabelBorderSides.Right)
                        | System.Windows.Forms.ToolStripStatusLabelBorderSides.Bottom)));
            this.slColor.BorderStyle = System.Windows.Forms.Border3DStyle.SunkenOuter;
            this.slColor.Name = "slColor";
            this.slColor.Size = new System.Drawing.Size(36, 21);
            this.slColor.Text = "颜色";
            // 
            // timer1
            // 
            this.timer1.Interval = 10;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(881, 261);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.toolStrip1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.contextMenuStrip1.ResumeLayout(false);
            this.toolStrip1.ResumeLayout(false);
            this.toolStrip1.PerformLayout();
            this.statusStrip1.ResumeLayout(false);
            this.statusStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem 字体FToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 颜色ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem red;
        private System.Windows.Forms.ToolStripMenuItem blue;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.ToolStripMenuItem defaultFont;
        private System.Windows.Forms.ToolStripMenuItem defaultColor;
        private System.Windows.Forms.ToolStrip toolStrip1;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.ToolStripMenuItem A;
        private System.Windows.Forms.ToolStripMenuItem B;
        private System.Windows.Forms.ToolStripButton tSBA;
        private System.Windows.Forms.ToolStripButton tSBB;
        private System.Windows.Forms.ToolStripButton tSBR;
        private System.Windows.Forms.ToolStripButton tSBBL;
        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.ToolStripStatusLabel slFont;
        private System.Windows.Forms.ToolStripStatusLabel slColor;
        private System.Windows.Forms.Timer timer1;
    }
}