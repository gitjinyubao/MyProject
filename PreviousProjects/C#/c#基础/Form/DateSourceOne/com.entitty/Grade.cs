using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DateSourceOne.com.entitty
{
    class Grade
    {
        private int id;
        private string course;
        private string stu_number;
        private string grade;

        public Grade()
        {
        }

        public Grade(int id, string course, string grade)
        {
            this.id = id;
            this.course = course;
            this.grade = grade;
        }

        public Grade(string course, string grade)
        {
            this.course = course;
            this.grade = grade;
        }

        public Grade(string course, string grade,string stu_number)
        {
            this.course = course;
            this.grade = grade;
            this.stu_number = stu_number;
        }

        public string Grade1
        {
            get { return grade; }
            set { grade = value; }
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
