package java_8_functions_questions.timeAndDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.print("Print the current date: ");
//        var date = LocalDateTime.now();
        var date = LocalDateTime
                .now()
                .format(DateTimeFormatter
                        .ofPattern("dd_mm_yyyy HH:mm:ss"));
        System.out.println(date);
    }
}
