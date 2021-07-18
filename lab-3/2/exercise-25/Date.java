import java.time.Year;

public class Date {
    private static int[] normalMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] leapMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isLeap(int year) {
        return Year.isLeap(year);
    }

    public int daysSinceJan1() {
        int[] months = isLeap(year) ? leapMonths : normalMonths;
        int sumOfDays = 0;

        for(int i = 0; i < month -1; i++) { 
            sumOfDays += months[i];
        }

        return sumOfDays + day;
    }
}