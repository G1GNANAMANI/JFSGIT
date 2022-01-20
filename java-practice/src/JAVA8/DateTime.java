package JAVA8;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class DateTime {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("LOCAL DATE :" + localDate);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LOCAL DATE  AND TIME : " + localDateTime);
		String localDateString = localDate.toString();
		System.out.println("LOCAL DATE STRING " + localDateString);
		String localDateTimeString = localDateString.toString();
		System.out.println("LOCAL DATE TIME STRING " + localDateTimeString);
		String dateString = "23-09-1999";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");
		try {
			Date parsedDate = simpleDateFormat.parse(dateString);
			System.out.println(parsedDate);
		}
		catch (ParseException parseException) {
			System.out.println("EXCEPTION : INVALID DATE FORMAT" +parseException);
		}
	}

}
