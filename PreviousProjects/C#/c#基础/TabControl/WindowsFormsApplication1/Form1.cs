using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void tabPage1_Click(object sender, EventArgs e)
        {
            label1.Text = "这是第一页";
        }

        private void tabPage2_Click(object sender, EventArgs e)
        {
            label2.Text = "这是第二页";
        }

        private void tabPage3_Click(object sender, EventArgs e)
        {
            label3.Text = "这是第三页";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int page = Int32.Parse(textBox1.Text);
            if (page > 0 && page <= 3)
            {
                tabControl1.SelectedIndex = page - 1;
            }
            else
            {
                MessageBox.Show("您输入的页码数目不对，请您在1到3中选择");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void tabControl1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int n = this.tabControl1.SelectedIndex + 1;
            MessageBox.Show("您选择的是第"+n+"页");
        }
    }
}
