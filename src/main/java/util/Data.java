package main.java.util;
import main.java.model.Booking;
import main.java.model.Review;
import main.java.model.Student;
import main.java.model.TimeTable;
import static main.java.model.enums.Gender.Male;
import static main.java.model.enums.Gender.Female;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Data {
    public static String user = "";

    public static List<Student> students = new ArrayList();

    public static String[] days = {"Saturday", "Sunday"};

    public static String[] time = {"Morning", "Afternoon", "Evening"};

    public static List<Booking> bookings = new ArrayList<Booking>();

    public static List<Review> reviews = new ArrayList();

    public static List<TimeTable> timeTables = Arrays.asList(
            new TimeTable("1","English", "Morning", "Saturday", "02/04/2022", "Week 1", 4),
            new TimeTable("2","Math", "Afternoon", "Saturday", "02/04/2022", "Week 1", 4),
            new TimeTable("3","Verbal Reasoning", "Evening", "Saturday", "02/04/2022", "Week 1", 4),

            new TimeTable("4","Non-verbal Reasoning", "Morning", "Sunday", "03/04/2022", "Week 1", 4),
            new TimeTable("5","Math", "Afternoon", "Sunday", "03/04/2022", "Week 1", 4),
            new TimeTable("6","Verbal Reasoning", "Evening", "Sunday", "03/04/2022", "Week 1", 4),

            new TimeTable("7","Verbal Reasoning", "Morning", "Saturday", "09/04/2022", "Week 2", 4),
            new TimeTable("8","English", "Morning", "Saturday", "09/04/2022", "Week 2", 4),
            new TimeTable("9","Non-verbal Reasoning", "Morning", "Saturday", "09/04/2022", "Week 2", 4),

            new TimeTable("10","Math", "Morning", "Sunday", "10/04/2022", "Week 2", 4),
            new TimeTable("11","Non-verbal Reasoning", "Morning", "Saturday", "16/04/2022", "Week 3", 4),
            new TimeTable("12","English", "Morning", "Sunday", "17/04/2022", "Week 3", 4),
            new TimeTable("13","Verbal Reasoning", "Morning", "Saturday", "23/04/2022", "Week 4", 4),
            new TimeTable("14","Math", "Morning", "Sunday", "24/04/2022", "Week 4", 4),
            new TimeTable("15","English", "Morning", "Saturday", "07/05/2022", "Week 5", 5),
            new TimeTable("16","Non-verbal Reasoning", "Morning", "Sunday", "08/05/2022", "Week 5", 5),
            new TimeTable("17","English", "Morning", "Saturday", "14/05/2022", "Week 6", 5),
            new TimeTable("18","Verbal Reasoning", "Morning", "Sunday", "15/05/2022", "Week 6", 5),
            new TimeTable("19","English", "Morning", "Saturday", "21/05/2022", "Week 7", 5),
            new TimeTable("20","Non-verbal Reasoning", "Morning", "Sunday", "22/05/2022", "Week 7", 5),
            new TimeTable("21","English", "Morning", "Saturday", "28/05/2022", "Week 8", 5),
            new TimeTable("22","Math", "Morning", "Sunday", "29/05/2022", "Week 8", 5)
    );

    public static HashMap<String, Double> subjects() {
        HashMap<String, Double> data = new HashMap<>();
        data.put("English", 20.0);
        data.put("Math", 30.0);
        data.put("Verbal Reasoning", 25.0);
        data.put("Non-verbal Reasoning", 15.0);
        return data;
    }

    public static void loadStudents(){
        students.add(new Student("0236478", "John Doe", Male, "Accra", "9473350193", "10/10/1995"));
        students.add(new Student("5553313", "Sara Thompson", Female, "Tema", "8597013405", "01/10/2000"));
        students.add(new Student("5495079", "Erica Watson", Female, "Tema", "7931583120", "20/01/2002"));
        students.add(new Student("1301373", "Michael Bloom", Male, "Tema", "4313613261", "10/10/1995"));
        students.add(new Student("2442262", "Veronica Smith", Female, "Tema", "1049680259", "10/10/1995"));
        students.add(new Student("5890283", "James Auston", Male, "Tema", "4591449351", "10/10/1995"));
        students.add(new Student("0469354", "Timothy Larbi", Male, "Tema", "0314778405", "10/10/1995"));
        students.add(new Student("7714260", "Jessica Garcia", Female, "Tema", "9573841149", "10/10/1995"));
        students.add(new Student("1717977", "Bob Lopez", Male, "Tema", "2944310380", "10/10/1995"));
        students.add(new Student("5671234", "Jennifer Jackson", Female, "Tema", "3046068499", "10/10/1995"));
        students.add(new Student("5537229", "Jennifer Wilson", Female, "Tema", "4801827009", "10/10/1995"));
        students.add(new Student("2058444", "Jonathan Coffie", Male, "Tema", "9027821075", "10/10/1995"));
        students.add(new Student("5455081", "Martha Bianca", Female, "Tema", "3959281410", "10/10/1995"));
        students.add(new Student("4668403", "Nathan James", Male, "Tema", "8227341915", "10/10/1995"));
        students.add(new Student("5589359", "Keren Williams", Female, "Tema", "6923141728", "10/10/1995"));
    }


}

