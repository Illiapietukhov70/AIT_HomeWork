package homework_45;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DataTimeTestApp {
    public static void main(String[] args) {
//        Task 1
//        Получить и вывести на экран:
//        текущую дату
//        текущий год, месяц и день
//        Создать дату, например Ваш день рождения и вывести на экран
//        Создать две даты и проверить на равенство
//        Получить и вывести на экран:
//        текущее время
//        текущее время + 3 часа
//        Создать дату:
//        которая на неделю позже сегодняшней
//        которая была на год раньше сегодняшней используя метод minus
//        которая на год позже сегодняшней
//        tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
//        Task 2
//        Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами в этом списке

        LocalDate dateTemp = LocalDate.now();
        System.out.println(dateTemp + " | " + dateTemp.getYear() + " | " + dateTemp.getMonth() + " | " + dateTemp.getDayOfMonth());
        LocalDate myDayBirthday = LocalDate.of(1970, 6, 5);
        System.out.println(myDayBirthday);

        // Generator of Random Date
        LocalDate start = LocalDate.of(1988, 8, 8);
        LocalDate end = LocalDate.now();
        RandomDateGenerator dateRandom = new RandomDateGenerator(start, end);
        //
        LocalDate testDate1 = dateRandom.generateDate();
        LocalDate testDate2 = dateRandom.generateDate();
        System.out.println(testDate1 + " isBefore " + testDate2 + ": " + testDate1.isBefore(testDate2));
        System.out.println(testDate1 + " isAfter " + testDate2 + ": " + testDate1.isAfter(testDate2));
        long daysBetween = testDate1.until(testDate2, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);
        //LocalTime
        LocalTime testTime = LocalTime.now();
        System.out.println(testTime);
        testTime = testTime.plusHours(3);
        System.out.println(testTime);
        //LocalDataManipulation
        LocalDate testDate3 = LocalDate.now();
        System.out.println(testDate3.plusWeeks(1));
        System.out.println(testDate3.minusYears(1));
        System.out.println(testDate3.plusYears(1));
        LocalDate yesterday  = testDate3.minusDays(1);
        LocalDate tomorrow = testDate3.plusDays(1);
        System.out.println("yesterday.isBefore(testDate3) && yesterday.isAfter(testDate3): " + (yesterday.isBefore(testDate3) && tomorrow.isAfter(testDate3)));

        // List of Random Data
        System.out.println(countDayMaxAndMinDates(generateListRandomDates(10, dateRandom)));

//        15-12-2022 20-46
//        Запарсить строку в формат LocalDateTime.
//        Распечатать отдельно месяц, день, час объекта LDT
//        13-01-2023 00-47
//        Какому днб недели соответствует вторая дата
//        Сколько дней между этими двумя датами

        String dataString1 = "15-12-2022 20-46";
        String dataString2 = "13-01-2023 00-47";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime localDateTime1 = LocalDateTime.parse(dataString1, formatter);
        LocalDateTime localDateTime2 = LocalDateTime.parse(dataString2, formatter);
        System.out.println(localDateTime1.getMonth() + " " + localDateTime1.getDayOfMonth() + " " + localDateTime1.getHour());
        System.out.println(localDateTime2.getDayOfWeek());
        System.out.println(localDateTime1.until(localDateTime2, ChronoUnit.DAYS));





    }
    public static List<LocalDate> generateListRandomDates(int sizeList, RandomDateGenerator dateRandom) {
        List<LocalDate> dates = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {dates.add(dateRandom.generateDate());}
        return dates;
    }
    public static long countDayMaxAndMinDates(List<LocalDate> dates) {
        if (dates != null && dates.size() >= 2) {
            dates = dates.stream().sorted().toList();
            return dates.get(0).until(dates.get(dates.size()-1), ChronoUnit.DAYS);
        }
        return 0;
    }
}
