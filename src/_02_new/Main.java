package _02_new;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {


        LocalDate newYer2023 = LocalDate.of(2023, 1, 1);
        LocalDate newYer2024 = LocalDate.of(2024, Month.JANUARY, 1);

        LocalDate now = LocalDate.now();
        now.getYear();
        now.getMonthValue();
        now.getDayOfWeek();
        now.getDayOfMonth();

        now.get(ChronoField.YEAR);


        System.out.println(newYer2023.isBefore(newYer2024));

        LocalDate Yer2025 = newYer2023.withYear(2025);
        System.out.println(Yer2025);


        LocalDate plus10 = newYer2023.plusDays(10);
        System.out.println(plus10);

        LocalDate minus10 = newYer2023.minusDays(10);
        System.out.println(plus10);


        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1.format(DateTimeFormatter.ofPattern("dd MMMM y 'T' HH:mm:ss")));

    }
}
