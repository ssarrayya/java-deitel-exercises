package ChapterThree;

public class Date{
	private int month;
	private int day;
	private int year;
	private String displayDate;

	public Date(int month, int day, int year){
		if(month > 0 && month <= 12)
			this.month = month;

		if(day > 0 && day <= 31)
			this.day = day;

		this.year = year;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getMonth(){
		return month;

	}

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}
	
	public String displayDate(){
		return month +"/"+ day +"/"+ year;
	}


}