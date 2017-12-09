using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace boundary
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            timer1.Start();
        }

        private void 字体FToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 隶书ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textBox1.Font = new Font("隶书",9);
            B.Checked = defaultFont.Checked = false;
        }

        private void B_Click(object sender, EventArgs e)
        {
            textBox1.Font = new Font("楷体", 9);
            A.Checked = defaultFont.Checked = false;
        }

        private void 红色ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            textBox1.ForeColor = Color.Red;
            blue.Checked = defaultColor.Checked = false;
        }

        private void blue_Click(object sender, EventArgs e)
        {
            textBox1.ForeColor = Color.Blue;
            red.Checked = defaultColor.Checked = false;
        }

        private void defaultFont_Click(object sender, EventArgs e)
        {
            textBox1.Font = new Font("宋体", 9);
            A.Checked = B.Checked = false;
        }

        private void defaultColor_Click(object sender, EventArgs e)
        {
            textBox1.ForeColor = Color.Black;
            blue.Checked = red.Checked = false;
        }

        private void tSBA_Click(object sender, EventArgs e)
        {
            A.Checked = true;
            隶书ToolStripMenuItem_Click(sender,e);
        }

        private void tSBB_Click(object sender, EventArgs e)
        {
            B.Checked = true;
            B_Click(sender,e);
        }

        private void tSBR_Click(object sender, EventArgs e)
        {
            red.Checked = true;
            红色ToolStripMenuItem_Click(sender,e);
        }

        private void tSBBL_Click(object sender, EventArgs e)
        {
            blue.Checked = true;
            blue_Click(sender,e);
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            slFont.Text = textBox1.Font.Name.ToString();
            slColor.Text = textBox1.ForeColor.Name.ToString();
        }

        

       
    }
}
