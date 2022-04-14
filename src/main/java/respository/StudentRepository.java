package main.java.respository;
import main.java.model.Student;
import main.java.model.enums.Gender;
import main.java.util.Data;
import main.java.util.Helper;

public class StudentRepository {

    public Student findById(String id){
        for (Student student : Data.students) {
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public Student registerStudent(String name, Gender gender, String address, String emergencyContact, String dob){
        String studentID = generateStudentId();
        Student student = new Student(studentID, name, gender, address, emergencyContact, dob);
        System.out.println(student.toString());
        Data.students.add(student);
        return student;
    }

    private String generateStudentId(){
        String studentID = Helper.generateId();
        Student existingStudent = findById(studentID);
        if(existingStudent != null){
            return generateStudentId();
        }
        else{
            return studentID;
        }
    }
}

