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
    public partial class QQ1 : Form
    {
        public QQ1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
        }

        private void QQ1_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox1_LoadCompleted(object sender, AsyncCompletedEventArgs e)
        {
            pictureBox1.Image = new Bitmap(@"E:\c#\c#基础\WindowsForms程序\WindowsFormsApplication1\bin\Debug\pic\4.jpg");
        }
        int i = 0;
        private void button1_Click_1(object sender, EventArgs e)
        {
            i = i > imageList1.Images.Count - 1? 0 : i;
            pictureBox1.Image=imageList1.Images[i];
            label1.Text = imageList1.Images.Keys[i];
            ++i;
         }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
