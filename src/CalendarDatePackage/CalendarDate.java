/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalendarDatePackage;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author l-pfeifer
 */
/*
 *      CalendarDate testDate =       new CalendarDate(14, 2, 2013);
        CalendarDate yestderdayDate = new CalendarDate(26, 3, 2014);
        CalendarDate tomorrowDate   = new CalendarDate(28, 3, 2014);
        CalendarDate endofMonthDate = new CalendarDate(30, 4, 2013);
        CalendarDate endofYearDate  = new CalendarDate(31, 12, 2012);
        CalendarDate startofMonthDate = new CalendarDate(1, 9, 2013);
        CalendarDate startofYearDate  = new CalendarDate(1, 1, 2013);
        CalendarDate leapYearDate     = new CalendarDate(29, 2, 2012);
        CalendarDate fauxLeapYearDate = new CalendarDate(28, 2, 1900);
 */
public class CalendarDate {
    
    private int day;
    private int month;
    private int year;
    
    public CalendarDate() {
        Calendar today = new GregorianCalendar();
        this.day    = today.get( Calendar.DAY_OF_MONTH);
        this.month  = today.get( Calendar.MONTH)+1;
        this.year   = today.get( Calendar.YEAR);
    }
    
    public CalendarDate( int day, int month, int year) {
        this.day    = day;
        this.month  = month;
        this.year   = year;
    }
    
    public boolean setDate( int day, int month, int year ) {
        if (day < 0 || day > 31) return false;
        if (month < 1 || month > 12) return false;
        if ((month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 30) return false;
        if (year <1582) return false;
        
        this.day = day;
        this.month = month;
        this.year = year;
        return true;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public String getMonthAsString() {
        if (month == 1) return "January";
        if (month == 2) return "February";
        if (month == 3) return "March";
        if (month == 4) return "April";
        if (month == 5) return "May";
        if (month == 6) return "June";
        if (month == 7) return "July";
        if (month == 8) return "August";
        if (month == 9) return "September";
        if (month == 10) return "October";
        if (month == 11) return "November";
        if (month == 12) return "December";
        else return "Error";
        
    }
    
    public int getYear() {
        return year;
    }
    
    public void tomorrow() {
        if (month == 12 && day == 31){
            year++;
            month=1;
            day=1;
        }
        else if ((month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31){
            month++;
            day = 1;
        }
        else if ((day == 30) && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            month++;
            day = 1;
        }
        else{
            day++;
        }
        
    }
    
    public void yesterday() {
        day--;
        if (day < 1) {
            month--;
            if (month < 1){
                year--;
                month = 12;
            }
            if ((month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
                day = day + 31;
            
            else day = day + 30;
        }
    }
    
    public void lastWeek() {
        day = day - 7;
        if (day < 1){
            month--;
            if (month > 0) { month = 12; year--;}
            if ((month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
                day = 31 + (day);
            else
                day = 30 + day;
        }
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
    
    public void nextWeek() {
        day = day +7;
        if (day > 31){
            
            month++;
            if (month > 12){ year++; month = 1;}
            if ((month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31){
                
                day = day - 31;
            }
            else 
                day = day -30;
        }
        
                System.out.println(day);
        System.out.println(month);
        System.out.println(year);
            
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.day;
        hash = 41 * hash + this.month;
        hash = 41 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CalendarDate other = (CalendarDate) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return true;
    }
    
    public boolean isWeekend() {
        if ("Saturday".equals(getDayOfWeek()) || "Sunday".equals(getDayOfWeek()))
            return true;
        return false;
    }
    public String getDayOfWeek() {
        int sum = day + getCenturyValue() + getYearValue() + getMonthValue();
        sum = sum%7;
        if (sum == 0) return "Sunday";
        if (sum == 1) return "Monday";
        if (sum == 2) return "Tuesday";
        if (sum == 3) return "Wednesday";
        if (sum == 4) return "Thursday";
        if (sum == 5) return "Friday";
        if (sum == 6) return "Saturday";
        else return "Error";
    }
    private boolean isLeapYear() {
        if (year%4 == 0) return true;
        else if (year%100 == 0 && year%400 == 0) return true;
        else return false;
    }
    
    private int getCenturyValue() {
        int myYear = year/100;
        myYear = myYear%4;
        return ((3-(myYear%4))*2);
    }
    
    private int getYearValue() {
        int tempYear = year%100;
        
        int foo = tempYear/4;
        return foo+tempYear;
    }
    
    private int getMonthValue() {
        if (month == 1 && isLeapYear()) return 6;
        if (month == 1) return 0;
        if (month == 2 && isLeapYear()) return 2;
        if (month ==2) return 3;
        if (month ==3) return 3;
        if (month ==4 ) return 6;
        if (month == 5) return 1;
        if (month == 6) return 4;
        if (month == 7) return 6;
        if (month == 8) return 2;
        if (month == 9) return 5;
        if (month ==10) return 0;
        if (month == 11) return 3;
        if (month == 12) return 5;
        else return 0;
    }
}
