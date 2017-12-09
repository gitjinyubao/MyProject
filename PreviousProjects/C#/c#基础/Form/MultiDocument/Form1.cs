using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace MultiDocument
{
    public partial class Form1 : Form
    {
        int i = 0;//打开窗体的个数
        public Form1()
        {
            InitializeComponent();
        }
        private void menuStrip1_Click(object sender, EventArgs e)
        {
        }
        private void 打开ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            i++;
            Form2 f2 = new Form2();//创建子窗体对象
            f2.Text += i;
            f2.MdiParent = this;//指定当前窗体为父窗体
            f2.Show();//打开子窗体
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void 水平平铺ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.TileHorizontal);
        }

        private void 垂直平铺ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.TileVertical);
        }

        private void 层叠ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.Cascade);
        }

        private void 排列图标ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.LayoutMdi(MdiLayout.ArrangeIcons);
        }
    }
}
