namespace Oes.Entity
{
    public class ExamRecord
    {
        public int Id { get; set; }
        public int UserId { get; set; }
        public int ExaId { get; set; }
        public int QueId { get; set; }
        public string UserAnswer { get; set; }
    }
}
