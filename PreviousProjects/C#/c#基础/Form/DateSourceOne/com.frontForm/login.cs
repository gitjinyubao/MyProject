using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using DateSourceOne.com.dbutils;
using System.Data;
using System.Data.SqlClient;

namespace DateSourceOne.com.frontForm
{
    public partial class login : Form
    {
        public login()
        {
            InitializeComponent();
        }

        private void login_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Db db = new Db();
            //获得SqlConnection对象
            SqlConnection con= db.getCon();
            //打开数据库连接
            db.openConnection(con);
            //登录查询操作
            string username = textBox1.Text.Trim();
            string password = textBox2.Text.Trim();
            string userSearch = "select * from user_tbl where stuNo= " + username + " and stuPassword= " + password;
            SqlCommand command = new SqlCommand(userSearch,con);
            SqlDataReader reader= command.ExecuteReader();
            if (reader.Read())
            {
                com.frontForm.userHomePage user = new com.frontForm.userHomePage();
                user.Show();
                this.Hide();
            }
            else
            {
                MessageBox.Show("用户名或密码错误，请重新输入");
                textBox1.Text = textBox1.Text;
                textBox2.Text = textBox2.Text;
            }
            db.closeReader(reader);
            db.closeConnection(con);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_KeyDown(object sender, KeyEventArgs e)
        {
            if(e.KeyCode.Equals("Enter"))
            {
                 this.button1_Click(sender, e);
            }
        }
    }
}
