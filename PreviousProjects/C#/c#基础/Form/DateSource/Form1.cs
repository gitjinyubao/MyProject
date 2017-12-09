using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data;
using System.Data.SqlClient;

namespace DateSource
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //创建数据库连接对象
            SqlConnection sql = new SqlConnection();
            //设置连接对象的ConnectionString属性
            sql.ConnectionString="Data Source=(local);Initial Catalog=Student; Integrated Security=SSPI";
            //打开与数据库的连接
            sql.Open();
            //定义SQL语句

            //删除
            string sql1 = "delete  from BaseInform where stuNo>1 ";
            //增加
            string sql2 = "insert into BaseInform(stuNo,stuName,Sex) values('22','62','33')";
            //查询
            string sql3 = "select * from BaseInform";
            //创建sqlCommand对象
            //SqlCommand com = new SqlCommand(sql2,sql);
            //调用方法执行sql语句
            //com.ExecuteNonQuery();
            SqlCommand com2 = new SqlCommand(sql1, sql);
            com2.ExecuteNonQuery();
            SqlCommand com1 = new SqlCommand(sql3, sql);
            //创建sqlDataReader对象，把com对象在数据库中执行的检索数据进行读取
            SqlDataReader reader = com1.ExecuteReader();
            //使reader对象进行到下一条进行读取
            while(reader.Read()){
                string name = (reader["stuName"]).ToString();
                MessageBox.Show(name);
            }
            reader.Close();
            sql.Close();
            MessageBox.Show("执行成功");
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
