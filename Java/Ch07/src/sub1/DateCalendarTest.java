package sub1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
		System.out.println("now : " + now);
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);          // 년
		int month = cal.get(Calendar.MONTH) + 1;    // 월, 0부터 시작해서 +1 필요
		int day = cal.get(Calendar.DATE);           // 일
		int hour = cal.get(Calendar.HOUR_OF_DAY);   // 시, 24시간 기준
		int minute = cal.get(Calendar.MINUTE);      // 분
		int second = cal.get(Calendar.SECOND);      // 초
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		System.out.println("hour : " + hour);
		System.out.println("minute : " + minute);
		System.out.println("second : " + second);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 "
				+ hour + "시 " + minute + "분 " + second + "초");
	}
}