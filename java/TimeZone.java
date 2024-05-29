import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class TimezoneConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.print("Enter the date and time (yyyy-MM-dd HH:mm): ");
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine(), formatter);

        System.out.print("Enter the source timezone (e.g., America/New_York): ");
        ZoneId sourceZone = ZoneId.of(scanner.nextLine());

        System.out.print("Enter the target timezone (e.g., Europe/London): ");
        ZoneId targetZone = ZoneId.of(scanner.nextLine());

        ZonedDateTime sourceDateTime = dateTime.atZone(sourceZone);
        ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(targetZone);

        System.out.println("Converted time: " + targetDateTime.format(formatter));
    }
}
