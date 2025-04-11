// check and print if year is leap year

public class LeapYear {
	public static void main(String[] args) {
		int n = 2025;
				if((n%4==0&&n%100!=0)||n%400==0) {
			System.out.println(n+" is leap year");
		}
		else {
			System.out.println(n+" is not leap year");
		}
	}

}