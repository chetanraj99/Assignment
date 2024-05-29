import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class DateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), formatter);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days between: " + daysBetween);
    }
}
