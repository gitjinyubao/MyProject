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
using System.Collections;
using DateSourceOne.com.dbutils;
using DateSourceOne.com.entitty;

namespace DateSourceOne.com.frontForm
{
    public partial class userHomePage : Form
    {
        public userHomePage()
        {
            InitializeComponent();
        }

        //全局成员变量
        Db db = new Db();
        SqlDataReader reader = null;
        ArrayList gradeList = new ArrayList();
        

        //清空内容（textBox）
        private void ClearAll()
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox4.Text = "";
            textBox6.Text = "";
            textBox7.Text = "";
        }

        //查询(number)有没有此人
        private SqlDataReader searchStuByNum(SqlConnection con, string number)
        {
            String sql = @"select * from stu_tbl as s where s.number='" + number + "'";
            if (!number.Equals(""))
            {
                reader = db.doExecuteReader(con, sql);
            }
            return reader; 
        }

        //查询(name)有没有此人
        private SqlDataReader searchStuByName(SqlConnection con, string name)
        {
            String sql = @"select * from stu_tbl as s where s.name='" + name + "'";
            if (!name.Equals(""))
            {
                reader = db.doExecuteReader(con, sql);
            }
            return reader;
        }

        //打印表格
        private void userHomePage_Load(object sender, EventArgs e)
        {/*
            //新建表
            DataTable dt = new DataTable();
            //定义表结构
            dt.Columns.Add("Id", typeof(System.Int32));//列名  列所在数据类型
            dt.Columns.Add("课程", typeof(System.String));
            dt.Columns.Add("分数", typeof(System.String));
            dt.Columns.Add("总分数", typeof(System.String));
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
          */
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        //级联操作
        private void listBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            if((this.listBox2.SelectedItem).Equals("软件工程")){
                listBox3.Items.Clear();
                listBox3.Items.Add("软件工程导论");
                listBox3.Items.Add("项目管理");
                listBox3.Items.Add("设计模式");
            }
            if ((this.listBox2.SelectedItem).Equals("数字媒体"))
            {
                listBox3.Items.Clear();
                listBox3.Items.Add("媒体运营");
                listBox3.Items.Add("数字图像");
                listBox3.Items.Add("音频设计");
            }
            if ((this.listBox2.SelectedItem).Equals("网络工程"))
            {
                listBox3.Items.Clear();
                listBox3.Items.Add("网络工程导论");
                listBox3.Items.Add("网络运营");
                listBox3.Items.Add("计算机网络");
            }
            if ((this.listBox2.SelectedItem).Equals("信息管理"))
            {
                listBox3.Items.Clear();
                listBox3.Items.Add("信息管理导论");
                listBox3.Items.Add("离散数学");
                listBox3.Items.Add("信息采集");
            }
            if ((this.listBox2.SelectedItem).Equals("计算机科学"))
            {
                listBox3.Items.Clear();
                listBox3.Items.Add("计算机导论");
                listBox3.Items.Add("计算机发展史");
                listBox3.Items.Add("计算机操作系统");
            }
        }

        //添加或修改学生
        private void button3_Click(object sender, EventArgs e)
        {
            //设置方法内全局变量
            string sex = null;
            string insertSqlCourse = null;

            //页面各种信息的获取
            string name = textBox7.Text;
            if(radioButton1.Checked){
                sex = radioButton1.Text;
            }else if(radioButton2.Checked){
                sex = radioButton2.Text;
            }
            string birthday = textBox4.Text;
            string major = listBox2.Text;
            string number=textBox6.Text;
            string [] course =new string [listBox3.SelectedItems.Count];
            for (int i = 0; i < course.Length;++i )
            {
                course[i] = listBox3.SelectedItems[i].ToString();
            }
           // string classes = listBox1.Text; 
 
            //连接数据库信息的添加
            SqlConnection con= db.getCon();
            db.openConnection(con);
           reader= searchStuByNum(con, number);
            if (reader.Read())
            {
                db.closeReader(reader);
                string updateSql = @"update stu_tbl set name= '"+name+"',number= '"+number+"',birthday= '"+birthday+"',major= '"+major+"',sex= '"+sex+"'";
                db.doExecuteNonQuery(con, updateSql);
                //insertSqlCourse = @"update course_tbl set course= '" + course + "',stu_number= '" +number + ";";
            }
            else
            {
                MessageBox.Show("jjjjjjjjjjjjjj");
                db.closeReader(reader);
                string insertSql = "insert into stu_tbl(name,number,birthday,major,sex) values( '" + name + "','" + number + "','" + birthday + "','" + major + "','" + sex + "')";
                //学生个人信息添加
                db.doExecuteNonQuery(con, insertSql);

                //学生课程信息添加
                string courseSelected = null;
                for (int i = 0; i < course.Length; ++i)
                {
                    courseSelected = course[i];
                    insertSqlCourse = @"insert into course_tbl(course,stu_number) values(" + "'" + courseSelected + "','" + number + "' )";
                    db.doExecuteNonQuery(con,insertSqlCourse);
                }

                //分数信息添加
                for (int i = 0; i < course.Length; ++i)
                {
                    courseSelected = course[i];
                    insertSqlCourse = @"insert into grade_tbl(course,stu_number) values(" + "'" + courseSelected + "','" + number + "' )";
                    db.doExecuteNonQuery(con, insertSqlCourse);
                }
            }
            //关闭数据库连接
            db.closeConnection(con);
        }

        //查询功能：C#中的文本不要用null进行判断
        private void button4_Click(object sender, EventArgs e)
        {
            string name=null;
            string number=null;
            string sqlSearch =null;
            name = textBox3.Text.ToString();
            number = textBox5.Text.ToString();
            SqlConnection con= db.getCon();
            db.openConnection(con);
                if (!(name.Equals("")))
                {
                    sqlSearch = @"select * from stu_tbl as s inner join course_tbl as c on s.number=c.stu_number where s.name='" + name + "'";
                }
                else if (!(number.Equals("")))
                {
                    sqlSearch = "select * from stu_tbl as s inner join course_tbl as c on s.number=c.stu_number where s.number='" + number + "' ";
                }
                else
                {
                    return;
                }
                name = textBox3.Text.Trim();
                string course = null;
                int courseNum = 0;
                reader=db.doExecuteReader(con,sqlSearch);
                //遍历
                while(reader.Read()){
                    if (courseNum == 0)
                    {
                        //显示名字
                        textBox7.Text=reader["name"].ToString();

                        //显示性别
                        string sex = reader["sex"].ToString();
                        if (sex.Equals("男"))
                        {
                            radioButton1.Select();
                        }
                        else
                        {
                            radioButton2.Select();
                        }
                        textBox4.Text = reader["birthday"].ToString();

                        //专业选中显示
                        string major = reader["major"].ToString();
                        for (int i = 0; i < listBox2.Items.Count;++i)
                        {
                            if(major.Equals(listBox2.Items[i]))
                            {
                                listBox2.SetSelected(i,true);
                            }
                        }//#if

                        //学号显示
                        textBox6.Text = reader["number"].ToString();

                        //课程选中显示
                            listBox2_SelectedIndexChanged(sender, e);
                    }
                    course = reader["course"].ToString();

                    #region 有用
                    /*  for(int j=0;j<listBox3.Items.Count;++j){
                        if (course.Equals((listBox3.Items[j]).ToString()))
                        {
                            listBox3.SelectedIndex = j;
                         } 
                    }
                   */

                    /*  string classes = reader["classes"].ToString();
                        for (int i = 0; i < listBox1.Items.Count; ++i)
                        {
                            if (classes.Equals(listBox1.Items[i]))
                            {
                                listBox1.SetSelected(i, true);
                            }
                        }
                    */
                    #endregion

                    courseNum++;
                }
                if(courseNum<=0){
                    ClearAll();
                }
                db.closeReader(reader);
                db.closeConnection(con);
        }

        private void button5_Click(object sender, EventArgs e)
        {

        }

        //删除学生
        private void button6_Click(object sender, EventArgs e)
        {
            string name = textBox3.Text.Trim();
            string number = textBox5.Text.Trim();

            string sqlDelete = null;
            if (!textBox5.Text.Trim().Equals("") || !textBox3.Text.Trim().Equals(""))
            {
                    SqlConnection con = db.getCon();
                    db.openConnection(con);
                        if (!textBox5.Text.Trim().Equals(""))
                        {
                            number = textBox5.Text.Trim();
                            sqlDelete = "select * from stu_tbl where number=" + number;
                        }
                        if (!textBox3.Text.Trim().Equals(""))
                        {
                            name = textBox3.Text.Trim();
                            sqlDelete = @"delete  from stu_tbl where name=" + name;
                            SqlCommand com = new SqlCommand(sqlDelete, con);
                            com.ExecuteNonQuery();
                        }
                        db.doExecuteNonQuery(con,sqlDelete);
                        db.closeConnection(con);
                        MessageBox.Show("已删除");
            }
        }

        //查询学生成绩
        private void button2_Click(object sender, EventArgs e)
        {
            //新建表
            DataTable dt = new DataTable();
            //定义表结构
            dt.Columns.Add("Id", typeof(System.Int32));//列名  列所在数据类型
            dt.Columns.Add("课程", typeof(System.String));
            dt.Columns.Add("分数", typeof(System.String));
            dt.Columns.Add("总分数", typeof(System.Int32));
            
                   

            string name = null;
            string number = null;
            string sqlSearch = null;
            Grade grade = null;
            int sum=0;
            int rows = 0;
            name = textBox1.Text.ToString();
            number = textBox2.Text.ToString();
            SqlConnection con = db.getCon();
            db.openConnection(con);
            if (!name.Equals("") && number.Equals(""))
            {
                sqlSearch = "select stu_number,course,grade from stu_tbl as s inner join grade_tbl as g on g.stu_number=s.number  where name=" + name;
                reader= db.doExecuteReader(con,sqlSearch);
                
                while(reader.Read())
                {
                    rows++;
                    DataRow dr = dt.NewRow();
                    string stu_number = reader["stu_number"].ToString();
                    dr[0] = rows;
                    dr[1] = reader["course"];
                    dr[2]=reader["grade"];
                    sum += Int32.Parse(reader["grade"].ToString());
                    dr[3] = sum;
                    dt.Rows.Add(dr); //将行添加到DataTabl 格中```
                    //grade数据封装添加到集合中去
                    grade = new Grade(dr[1].ToString(), dr[2].ToString(), stu_number);
                    gradeList.Add(grade);
                }
                db.closeReader(reader);
                dataGridView1.DataSource = dt;  //控件.DataSource = ……（该控件可以直接绑定一个DataTable这样的表）
            }

            #region 没想到删除之后还是可以用的
            //db.closeConnection(con);
            //SqlConnection con1 = db.getCon();
            //db.openConnection(con1);
            #endregion

            if (!number.Equals("") && name.Equals(""))
            {
                sqlSearch = "select stu_number,g.course,grade from (stu_tbl as s inner join grade_tbl as g on g.stu_number=s.number)  where number= '"+number+"'";

                #region 没想到删除之后还是可以用的
                //SqlCommand command1 = new SqlCommand(sqlSearch,con);
                //SqlDataReader reader2 = command1.ExecuteReader();
                #endregion

                SqlDataReader reader2 = db.doExecuteReader(con, sqlSearch);

                while (reader2.Read())
                {
                    rows++;
                    DataRow dr = dt.NewRow();
                    string stu_number = reader2["stu_number"].ToString();
                    dr[0] = rows;
                    dr[1] = reader2["course"];
                    dr[2] = reader2["grade"];
                    sum += Int32.Parse(reader2["grade"].ToString());
                    dr[3] = sum;
                    dt.Rows.Add(dr); //将行添加到DataTabl 格中```
                    //grade数据封装添加到集合中去
                    grade = new Grade(dr[1].ToString(), dr[2].ToString(),stu_number);
                    gradeList.Add(grade);
                }
                db.closeReader(reader2);
                dataGridView1.DataSource = dt;  //控件.DataSource = ……（该控件可以直接绑定一个DataTable这样的表）
            }
            db.closeConnection(con);
            //得到单元格内容
            string s=dataGridView1.Rows[0].Cells[2].Value.ToString();
            //统计行数
            int row=dataGridView1.Rows.GetRowCount(DataGridViewElementStates.Visible);
            //统计列数
            int columns = dataGridView1.ColumnCount;
        }

        private void button5_Click_1(object sender, EventArgs e)
        {
            Grade grade=null;
            int i ;
            int j ;
            SqlConnection con= db.getCon();
            db.openConnection(con);
            //统计行数
            int row = dataGridView1.Rows.GetRowCount(DataGridViewElementStates.Visible);
            //统计列数
            int columns = dataGridView1.ColumnCount;
            //循环修改/添加
            for ( i=0 ; i < gradeList.Count;++i )
            {
                grade=(Grade)gradeList[i];
                string gradeData=dataGridView1.Rows[i].Cells[2].Value.ToString();
                if(!(grade.Grade1).Equals(gradeData))
                {
                    string sqlUpdate="update grade_tbl set grade= '"+gradeData+"' where stu_number ="+grade.Stu_number+"and course= '"+grade.Course+"'";
                    db.doExecuteNonQuery(con,sqlUpdate);
                }
            }
            db.closeConnection(con);
        }
    }
}
