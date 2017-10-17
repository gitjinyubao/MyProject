using System;

namespace Oes.Entity.util
{
    public class DurationToHourMinitesSecond
    {
        public string DurationTimeToHourMinutesSecond(string durationTime)
        {
            Double durationTimeDouble = Convert.ToDouble(durationTime);
            Double hoursDouble = durationTimeDouble / 60;
            int hoursInt = Convert.ToInt32(hoursDouble);
            double minutesDouble = (hoursDouble - hoursInt) * 60;
            int minutesInt = Convert.ToInt32(minutesDouble);
            int secondInt = Convert.ToInt32(minutesDouble - minutesInt) * 60;

            string hours = hoursInt.ToString();
            string minutes = minutesInt.ToString();
            string seconds = secondInt.ToString();

            if (hours.Length < Constans.NumberTwoInt)
            {
                hours = Constans.Zero + hours;
            }
            else
            {
                // Nothing to do.
            }

            if (minutes.Length < Constans.NumberTwoInt)
            {
                minutes = Constans.Zero +minutes;
            }
            else
            {
                // Nothing to do.
            }

            if (seconds.Length < Constans.NumberTwoInt)
            {
                seconds = Constans.Zero + seconds;
            }
            else
            {
                // Nothing to do.
            }

            return hours + Constans.Colon + minutes + Constans.Colon + seconds;
        }
    }
}
