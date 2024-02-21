package java_8_functions_questions.timeAndDate;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.parse("1998-03-04");
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your Age: " + age.getYears());
    }
}
