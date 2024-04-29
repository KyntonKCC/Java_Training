package J26;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class J261_datatimelocale {

	public static void main(String[] args) {
		// LocalDate date=new LocalDate()// 此行錯誤,因為沒有建構子
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		LocalDateTime of = LocalDateTime.of(2023, 4, 15, 20, 15, 13);
		System.out.println(of);
		// 取得
		System.out.println(of.getYear());
		System.out.println(of.getMonthValue());
		System.out.println(of.getDayOfMonth());
		System.out.println(of.getDayOfWeek());
		System.out.println(of.getHour());
		System.out.println(of.getMinute());
		System.out.println(of.getSecond());
		// 更改Localxxx為immutable
		System.out.println("=======更改========");
		LocalDateTime of1 = of.withDayOfMonth(8);
		System.out.println(of);
		System.out.println(of1);
		// 加減
		System.out.println("=======加減========");
		LocalDateTime of2 = of.plus(Period.ofDays(10));
		LocalDateTime of3 = of.plusDays(10);
		LocalDateTime of4 = of.plus(Period.ofMonths(2));
		LocalDateTime of5 = of.minus(Period.ofMonths(2));
		System.out.println(of2);
		System.out.println(of3);
		System.out.println(of4);
		System.out.println(of5);
		// 格林威治時間
		System.out.println("======Instant======");
		System.out.println(Instant.now());
		System.out.println(Instant.now().atOffset(ZoneOffset.ofHours(8)));

		// 格式與解析
		// DateTimeFormatter格式化日期時間與解析
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		// 日期-->字串
		String str = formatter.format(now);
		System.out.println(now);
		System.out.println(str);
		// 解析字串-->日期(時間存取器)
		TemporalAccessor parse = formatter.parse(str);
		System.out.println(parse);
		// 本地化相關的格式
		System.out.println("=====本地化相關的格式=====");
		// FormatStyle.FULL LONG MEDIUM SHORT
		DateTimeFormatter ofLocalizedDate1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String str1 = ofLocalizedDate1.format(now);
		System.out.println(str1);
		DateTimeFormatter ofLocalizedDate2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String str2 = ofLocalizedDate2.format(now);
		System.out.println(str2);
		DateTimeFormatter ofLocalizedDate3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String str3 = ofLocalizedDate3.format(now);
		System.out.println(str3);
		// 自定義格式ofPattern("自訂格式")
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("uuuu->MM->dd hh->mm->ss");
		String format = ofPattern.format(now);
		System.out.println(format);

		LocalDate $now = LocalDate.now();
		System.out.println("Now : " + $now);
		LocalDate birthDay = LocalDate.of(2003, 9, 28);
		System.out.println(birthDay);
		System.out.println("是否為過去 : " + birthDay.isBefore($now));
		System.out.println("是否為閏年 : " + birthDay.isLeapYear());
		System.out.println("為星期幾 : " + birthDay.getDayOfWeek());
		System.out.println("為幾日 : " + birthDay.getDayOfMonth());
		System.out.println("為一年中第幾天 : " + birthDay.getDayOfYear());
		LocalDate nowAfterMonth = birthDay.plusDays(1);
		System.out.println(nowAfterMonth);

		// 建立Locale物件方式
		// 1.使用預設
		Locale loc = Locale.getDefault();
		System.out.println(loc);
		Locale locale1 = new Locale("zh", "TW", "WIN");
		System.out.println("Locale:" + locale1);
		// setDefault (Locale newLocale)
		// setDefault (Locale.Category category, Locale newLocale)
		Locale.setDefault(new Locale("en", "US", "MAC"));
		Locale locale2 = Locale.getDefault();
		System.out.println("Locale:" + locale2);
		// 2.使用靜態物件
		System.out.println("=====使用靜態物件=======");
		Locale loc1 = Locale.SIMPLIFIED_CHINESE;
		System.out.println(loc1);
		// 3.使用建構子
		/* 國別一定要配合語系 
		 * Locale(String language) 
		 * Locale(String language, String country)
		 * Locale(String language, String country, String variant)
		 */
		Locale loc2 = new Locale("zh", "TW");
		System.out.println(loc2);
		// Local支援的區域
		System.out.println("=====Local支援的區域=======");
		Locale[] availableLocales = Locale.getAvailableLocales();
		for (Locale x : availableLocales)
			System.out.print(x + ",");

	}

}
