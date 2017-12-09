using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsF
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //新建表
            DataTable dt = new DataTable();
            //定义表结构
            dt.Columns.Add("Id", typeof(System.Int32));//列名  列所在数据类型
            dt.Columns.Add("Name", typeof(System.String));
            dt.Columns.Add("age", typeof(System.String));
            //添加新行
            for (int i = 0; i <= 3; i++)
            {
                DataRow dr = dt.NewRow();   //行
                dr[0] = i;
                dr[1] = "wang" + i;
                dr[2] = "5" + i;
                dt.Rows.Add(dr);    //将行添加到DataTabl 格中```
            }
            dataGridView1.DataSource = dt;  //控件.DataSource = ……（该控件可以直接绑定一个DataTable这样的表）
        }
    }
}
