package _01_old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.sun.tools.javac.util.Constants.format;


public class Main {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        System.out.println(now.getTime());           ///(getTime) •−− •−•− •−• − •− • ••• • −•− ••− −• −•• −•−−
        Date sqlDate = new Date(1234567890154l);

        System.out.println(sqlDate);
        System.out.println(now.after(sqlDate));
        System.out.println(now.compareTo(sqlDate));

        Calendar cal = Calendar.getInstance();        ///−•− •− •−•• •−•− −• −•• •− •−•
        System.out.println(cal.get(6));
        cal.set(Calendar.YEAR, 2034);
        System.out.println(cal.getTime());             /// Tue Oct 17 19:31:27 MSK 2034
        cal.add(Calendar.MONTH, 1);
        System.out.println(cal.getTime());             ///Fri Nov 17 19:32:47 MSK 2034

        ///•−− −•−− −−•• −• •− −−−• •− • •−−• •− − ••−•• •−• −• •−− −•−− •−− •− −•• ••− −•• •− −

        SimpleDateFormat format1 = new SimpleDateFormat();
        String formattedDate = format1.format(new Date());
        System.out.println(formattedDate);

        String pattern = "dd 'aaa'-MMMM-y  HH:mm:ss";   /// 17 PM-октября-2023  19:52:23
        format1 = new SimpleDateFormat(pattern);
        System.out.println(format1.format(new Date()));

        ///•−• −−− −••• −− −•• •− − ••− −−•• •−• •− −•• −•− •−

        String someDate = "15-06-1990";
        String pat = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pat);
        Date date = sdf.parse(someDate);
        System.out.println(date);




    }
}
