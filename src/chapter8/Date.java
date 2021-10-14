package chapter8;

public class Date {
    private final String[] MONTHS = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };
    private final int[] DAYS_IN_MONTHS = {
            31, 28, 31,
            30, 31, 30,
            31, 31, 30,
            31, 30, 31
    };
    private int day;
    private int month;
    private int year;
    private int dayNumberInYear;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(String month, int day, int year) {
        int monthResult = getMonthIndex(month);
        if(monthResult < 0){
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = monthResult;
        this.day = day;
        this.year = year;
    }

    public Date(int dayNumber, int year) {
        this.year = year;
    }

    private int getMonthIndex(String month) {
        for (int i = 0; i < MONTHS.length; i++) {
            if(month.equals(MONTHS[i])) {
                return i + 1;
            }
        }
        return -1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void calculateMonthAndDay(int dayNumberInYear) {
        for (int i = 0; i < DAYS_IN_MONTHS.length; i++) {
//            dayNumberInYear
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format(
                "%02d/%02d/%d%n%s %02d, %d",
                month, day, year,
                this.MONTHS[month - 1], day, year);
    }
}
