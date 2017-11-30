using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Oes.Entity.util
{
    public class CalculateFinishTime
    {
        public string GetFinishTime(string examDuration)
        {
            DateTime zeroTime = Convert.ToDateTime(Constans.ZeroTime);
            DateTime duration = Convert.ToDateTime(examDuration);
            TimeSpan ts = duration - zeroTime;
            double minutes = ts.Hours * 60.0 + ts.Minutes + ts.Seconds/60.0;
            return minutes.ToString();
        }
    }
}
