package k6_math;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Local {
    public static void main(String[] args) {

        LocalDate todays = LocalDate.now();
        System.out.println(todays);

        LocalDate before30 = todays.minusDays(30);
        System.out.println(before30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)");
//        System.out.println(formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日('('E')')", Locale.JAPANESE);
//        System.out.println(formatter2);

        System.out.println("今日の日付：" + todays.format(formatter));
        System.out.println("30日前の日付：" + before30.format(formatter));
        System.out.println("今日の日付：" + todays.format(formatter2));
        System.out.println("30日前の日付：" + before30.format(formatter2));
    }
}
