package k6_math;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("年：");
        int year = scanner.nextInt();

        System.out.print("月：");
                int month = scanner.nextInt();

        System.out.print("日：");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.JAPANESE);
        String weekday = date.format(formatter);

        System.out.println(year + "年" + month +"月" +day + "日は" +weekday + "です。");
    }
}
