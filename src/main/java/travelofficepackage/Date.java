package travelofficepackage;

public class Date {

    int year;
    int month;
    int day;
    String string;
    String parse;
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date(int year, int month, int day)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    /*public travelofficepackage.Date(String string, String parse)
    {
        setDate(string,parse);
    }*/

    /*public String getInfo()
    {
       return " Rok: " + year + " Miesiac: " + month + " Dzien: ";

    }*/
    public static Date setDate(String string, String parse)
    {
        String[] parts = string.split(parse);
        return new Date(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Rok: ");
        sb.append(year);
        sb.append(" Miesiac: ");
        sb.append(month);
        sb.append(" Dzien: ");
        sb.append(day);
        return sb.toString();
    }

}
