package main.java.model;

public class TimeTable {
    private String id;
    private String subject;
    private String time;
    private String day;
    private String date;
    private String weekName;
    private int month;

    public TimeTable(String id, String subject, String time, String day, String date, String weekName, int month) {
        this.id = id;
        this.subject = subject;
        this.time = time;
        this.day = day;
        this.date = date;
        this.weekName = weekName;
        this.month = month;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
