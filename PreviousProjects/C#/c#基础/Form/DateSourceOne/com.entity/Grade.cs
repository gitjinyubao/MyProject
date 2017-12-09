using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DateSourceOne.com.entity
{
    /// <summary>
    /// 封装类
    /// </summary>
    class Grade
    {
        private int id;
        private string course;
        private string stu_number;

        public Grade()
        {
        }

        public Grade(int id,string course,string stu_number)
        {
            this.id = id;
            this.course = course;
            this.stu_number = stu_number;
        }

        public Grade( string course, string stu_number)
        {
            this.course = course;
            this.stu_number = stu_number;
        }

        public int Id
        {
            get { return id; }
            set { id = value; }
        }

        public string Course
        {
            get { return course; }
            set { course = value; }
        }

        public string Stu_number
        {
            get { return stu_number; }
            set { stu_number = value; }
        }

    }
}
