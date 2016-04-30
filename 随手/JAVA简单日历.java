import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        GregorianCalendar d = new GregorianCalendar();

        /**
         * 调用get方法获取当前 日，月
         */
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        /**
         * 将d设置为这个月的第一天，并得到这一天为星期几
         */
        d.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        /**
         * 获得当地地区星期的起始日
         */
        int firstDayOfWeek = d.getFirstDayOfWeek();
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent ++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        /**
         * 输出表示星期几的名称
         */
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        while (weekday != firstDayOfWeek);
        System.out.println();

        /**
         * 输出日期
         */
        for (int i = 1; i<= indent; i++)
            System.out.print("    ");

            d.set(Calendar.DAY_OF_MONTH, 1);
            do {
                int day = d.get(Calendar.DAY_OF_MONTH);
                System.out.printf("%3d", day);

                if (day == today) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                d.add(Calendar.DAY_OF_MONTH, 1);
                weekday = d.get(Calendar.DAY_OF_WEEK);

                if (weekday == firstDayOfWeek) {
                    System.out.println();
                }
            }
            while (d.get(Calendar.MONTH) == month);

            if (weekday != firstDayOfWeek) {
                System.out.println();
            }
    }
}
