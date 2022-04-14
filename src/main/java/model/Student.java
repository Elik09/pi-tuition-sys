package main.java.model;
import main.java.model.enums.Gender;

public class Student {
    private String id;
    private String name;
    private Gender gender;
    private String address;
    private String emergencyContact;
    private String dob;

    public Student(String id, String name, Gender gender, String address, String emergencyContact, String dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.emergencyContact = emergencyContact;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
