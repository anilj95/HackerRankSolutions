
public class TimeConversion {

	public static void main(String[] args) {


		String s = "12:08:35am";
		
		System.out.print(changeFormat(s));

	}

	private static String changeFormat(String s) { // 07:05:45AM

		String[] str = s.split(":");

		int hour = Integer.parseInt(str[0]);

		String min = str[1];
		String secPeriod = str[2]; // 45AM

		String sec = secPeriod.substring(0, secPeriod.length() - 2);
		String period = secPeriod.substring(secPeriod.length() - 2, secPeriod.length());

		String newStringTime = "";

		if ((0 <= hour && hour < 12) && period.equalsIgnoreCase("AM")) {

			newStringTime = String.format("%02d", hour) + ":" + min + ":" + sec;
		} else if ((0 <= hour && hour < 12) && period.equalsIgnoreCase("PM")) {

			newStringTime = (hour + 12) + ":" + min + ":" + sec;
		} else if ((hour == 12) && period.equalsIgnoreCase("AM")) {

			newStringTime = "00" + ":" + min + ":" + sec;
		} else if ((hour == 12) && period.equalsIgnoreCase("PM")) {

			newStringTime = hour + ":" + min + ":" + sec;
		}

		return newStringTime;

	}

}
