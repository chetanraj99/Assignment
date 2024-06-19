package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfMonth());

		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDateTime l1 = ldt.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(l1);

		System.out.println(ld.plusDays(10));
		System.out.println(ld.plusMonths(10));
		System.out.println(ld.plusYears(10));

		System.out.println(ld.minusDays(10));
		System.out.println(ld.minusMonths(10));
		System.out.println(ld.minusYears(10));

		System.out.println(lt.plusHours(10));
		System.out.println(lt.plusMinutes(10));
		System.out.println(lt.plusSeconds(10));
		System.out.println(lt.plusNanos(10));

		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

		ZoneId z1 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(z1);
		System.out.println(zdt);

		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1979, 01, 19);
		Period p = Period.between(today, dob);
		System.out
				.println("you are " + p.getYears() + "years " + p.getMonths() + " Months" + p.getDays() + " days old");

		Year year = Year.of(2024);

		System.out.println(year.isLeap());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");
		String formattedZonedDateTime = zdt.format(formatter);
		System.out.println("Formatted ZonedDateTime: " + formattedZonedDateTime);

		LocalTime startTime = LocalTime.of(10, 0);
		LocalTime endTime = LocalTime.of(12, 30);

		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Duration: " + duration);

		// Creating a duration
		Duration twoHours = Duration.ofHours(2);
		System.out.println("Two Hours Duration: " + twoHours);

		// Adding a duration to a time
		LocalTime newTime = startTime.plus(twoHours);
		System.out.println("New Time: " + newTime);

	}

}
