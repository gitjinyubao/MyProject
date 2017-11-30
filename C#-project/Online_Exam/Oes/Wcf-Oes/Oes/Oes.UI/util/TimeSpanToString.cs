using System;

namespace Oes.Entity.util
{
    public class TimeSpanToString
    {
        public string GetStringFromTimeSpan(TimeSpan ts)
        {
            string hours = ts.Hours.ToString().Length < Constans.NumberTwo ? Constans.Zero + ts.Hours.ToString() : ts.Hours.ToString();
            string minutes = ts.Minutes.ToString().Length < Constans.NumberTwo ? Constans.Zero + ts.Minutes.ToString() : ts.Minutes.ToString();
            string seconds = ts.Seconds.ToString().Length < Constans.NumberTwo ? Constans.Zero + ts.Seconds.ToString() : ts.Seconds.ToString();
            string timeString = hours + Constans.Colon + minutes + Constans.Colon + seconds;

            return timeString;
        }
    }
}
