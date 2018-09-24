import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.util.Set;

public class Test16 {

	public static void main(String[] args) {
		
		ZoneId zone=ZoneId.of("Europe/London");
		
		System.out.println(LocalDateTime.now(zone));
		/*Set<String> availableZoneIds = zone.getAvailableZoneIds();
		
		for(String azone:availableZoneIds) {
			System.out.println(azone);
		}
		System.out.println(zone);
		
	ZoneId id=ZoneId.of("Europe/London");*/
	
		
	/*	LocalDate localDate=LocalDate.of(1986, 10, 17);
		
		LocalDate todaysDate=LocalDate.now();
		
		Period p=Period.between(localDate, todaysDate);
		
		System.out.println( p.getYears()+"-"+p.getMonths()+"-"+p.getDays());*/
		
	/*	Year year=Year.of(2018);
		
		System.out.println(year.isLeap());*/
		
		
	
		//LocalDate date=LocalDate.now();
		
		//LocalDate date=LocalDate.of(2020, Month.OCTOBER, 17);
		//System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
		
		
		//LocalTime localTime=LocalTime.now();
		
		//LocalTime localTime=LocalTime.of(5,30,00);
		//System.out.println(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond()+":"+localTime.getNano());
	
	
		//LocalDateTime localDateTime=LocalDateTime.now();
		//System.out.println(localDateTime.plusDays(4));
		
		
	}

}
