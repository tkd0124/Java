package k6_math;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeekExample {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("年：");
            int year = scanner.nextInt();

            System.out.print("月：");
            int month = scanner.nextInt();

            System.out.print("日：");
            int day = scanner.nextInt();

            LocalDate date = LocalDate.of(year, month, day);

            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("曜日（英語表記）：" + dayOfWeek);


            String japaneseWeekday;
            switch (dayOfWeek){
                case MONDAY:    japaneseWeekday = "月曜日"; break;
                case TUESDAY:   japaneseWeekday = "火曜日"; break;
                case WEDNESDAY: japaneseWeekday = "水曜日"; break;
                case THURSDAY:  japaneseWeekday = "木曜日"; break;
                case FRIDAY:    japaneseWeekday = "金曜日"; break;
                case SATURDAY:  japaneseWeekday = "土曜日"; break;
                case SUNDAY:    japaneseWeekday = "日曜日"; break;
                default:        japaneseWeekday = "不明"; break;
            }
            System.out.println("曜日（日本語表記）：" + japaneseWeekday);
        }
    }
}
