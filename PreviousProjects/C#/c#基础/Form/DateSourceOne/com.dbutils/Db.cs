using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.SqlClient;

namespace DateSourceOne.com.dbutils
{
    public class Db
    {
        #region 数据库操作
        //定义连接数据库的字段常量
        private static  string sqlConnectionString="Data Source=(local);Initial Catalog=Student;User ID=sa;Password=1";
        //定义一个SqlConnection引用类型的变量
        private static  SqlConnection con=null;


        /// <summary>
        /// 获得sqlConnection
        /// </summary>
        /// <returns>SqlConnection对象</returns>
        public SqlConnection getCon()
        {
            con = new SqlConnection();
            con.ConnectionString = sqlConnectionString;
            return con;
        }

        /// <summary>
        /// 打开数据库连接
        /// </summary>
        /// <param name="con">SqlConnection对象</param>
        public void openConnection(SqlConnection con)
        {
            con.Open();
        }

        /// <summary>
        /// 执行增删改操作
        /// </summary>
        /// <param name="Con">sqlConnection对象</param>
        /// <param name="Sql">sql执行语句</param>
        public void doExecuteNonQuery(SqlConnection  Con,string Sql)
        {
            SqlCommand command = new SqlCommand(Sql,Con);
            command.ExecuteNonQuery();
        }

        /// <summary>
        /// 执行查询操作
        /// </summary>
        /// <param name="Con">sqlConnection对象</param>
        /// <param name="Sql">sql执行语句</param>
        /// <returns>SqlDataReader对象</returns>
        public SqlDataReader doExecuteReader(SqlConnection Con, string Sql)
        {
            SqlCommand command = new SqlCommand(Sql, Con);
            SqlDataReader reader1 = command.ExecuteReader();
    
            return reader1;
        }

        /// <summary>
        /// 关闭reader
        /// </summary>
        /// <param name="reader"></param>
        public void closeReader(SqlDataReader reader)
        {
            reader.Close();
        }

        /// <summary>
        /// 定义关闭数据库连接的方法
        /// </summary>
        public void closeConnection(SqlConnection con)
        {
            con.Close();
        }
        #endregion
    }
}
