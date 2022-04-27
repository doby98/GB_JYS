package study_wkd3;

public class If {

	public static void main(String[] args) {
		/*
		 * 입력된 임의의 시간을 기준으로 30분전의 시간을 조건문(if, switch문)을 이용해 출력하시오
		 * 시의 범위(h) : 0 ~ 23, (h = 0 ~ 11 : am), (h = 12 ~ 23 : pm)의 조건에맞게 출력
		 * 분의 범위(m) : 0 ~ 59
		 */
		
		Time time = new Time();
		
		time.timeBefore(10, 30);
		time.timeSay();
		
		
	}

}

class Time {
	int hour;
	int minute;
	String time_type;
	
	public void timeBefore( int hour, int minute ) {
		
		if( minute < 30 ) {
			minute += 30;
			hour -= 1;
		} else {
			minute -= 30;
		}
		
		if( hour < 0 ) {
			hour += 24;
		}
		
		if( hour > 11 ) {
			this.time_type = "PM";
		} else {
			this.time_type = "AM";
		}
		
		this.hour = hour;
		this.minute = minute;
	}
	
	public void timeSay() {
		System.out.println(this.time_type + " " + this.hour + ":" + this.minute);
	}
}








