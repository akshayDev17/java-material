import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Date date = new GregorianCalendar(year, month-1, day).getTime();
        Locale loc = new Locale("ENGLISH");
        DateFormat formatter = new SimpleDateFormat("EEEE", loc);
        return formatter.format(date).toUpperCase();
        // return calendar.DAY_OF_THE_WEEK;

    }
    public static void main(String[] args) {
        System.out.println(findDay(12, 20, 2003));        
    }

}