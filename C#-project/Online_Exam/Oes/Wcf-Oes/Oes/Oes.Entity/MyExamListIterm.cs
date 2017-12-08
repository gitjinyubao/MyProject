using System;

namespace Oes.Entity
{
    public class MyExamListIterm
    {
        public int Id { get; set; }
        public string ExamScore { get; set; }
        public string Name { get; set; }
        public string Number { get; set; }
        public DateTime EffictiveTime { get; set; }
        public string Duration { get; set; }
        public string PassCriteria { get; set; }
        public string TotalScore { get; set; }
        public string ExamDivisTotalScore { get; set; }
        public string QuestionQuantity { get; set; }
        public string Options { get; set; }
    }
}
