package chapter3;

public class DateTest{
	public static void main(String[] args){
		Date sarahDate = new Date(5, 15, 2000);

		System.out.printf("The date is %s%n", sarahDate.displayDate());

		System.out.printf("The month is %d%n", sarahDate.getMonth());

		System.out.printf("The day is %d%n", sarahDate.getDay());

		System.out.printf("The year is %d%n", sarahDate.getYear());
	}

}