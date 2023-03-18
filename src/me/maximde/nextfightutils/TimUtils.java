package me.maximde.nextfightutils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class TimUtils {

    /**
     * @return Time in this format:
     * 1th of January 2022 Time: 10:00
     */
    public static String getCurrentTime() {
        String finalData = "Error";
        DateFormat dateFormatTime = new SimpleDateFormat("HH:mm");
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";       break;
            case 2:  monthString = "February";      break;
            case 3:  monthString = "March";         break;
            case 4:  monthString = "April";         break;
            case 5:  monthString = "May";           break;
            case 6:  monthString = "June";          break;
            case 7:  monthString = "July";          break;
            case 8:  monthString = "August";        break;
            case 9:  monthString = "September";     break;
            case 10: monthString = "October";       break;
            case 11: monthString = "November";      break;
            case 12: monthString = "December";      break;
            default: monthString = "Error";         break;
        }
        finalData = cal.get(Calendar.DAY_OF_MONTH) + "th of " + monthString + " " + cal.get(Calendar.YEAR) + " Time: " + dateFormatTime.format(cal.getTime());
        return finalData;
    }

    /**
     * Convert seconds to nanos
     * @param seconds
     * @return nanos
     */
    public static Long secondsToNanos(long seconds) {
        return TimeUnit.SECONDS.toNanos(seconds);
    }

    /**
     * Convert nanos to seconds
     * @param nanos
     * @return seconds
     */
    public static long nanosToSeconds(long nanos) {
        return TimeUnit.NANOSECONDS.toSeconds(nanos);
    }


}
