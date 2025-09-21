import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bod = LocalDate.of(2005, 4, 2);
        LocalDate nextweek = today.plusWeeks(1);
        LocalDate prevWeek = today.minusWeeks(1);
        LocalDate endOfTenure = LocalDate.of(2027, 5, 29);

//        long daysLeft = today;
        long between1 = ChronoUnit.DAYS.between(today, endOfTenure);
        System.out.println(between1);
        Period between =  Period.between(today, endOfTenure);
        System.out.println("Days left till the end of Tinibu's tenure: " + between);
    }
}
