package System1;

import java.util.ArrayList;

public class AdminRole {
    StudentsDB studentsDB = new StudentsDB("students.txt");

    public AdminRole(StudentsDB studentsDB) {
        this.studentsDB = studentsDB;
    }

    public void AddStudent(int Student_ID, String Full_Name, int age, String Gender, String Department, float GPA) {
        Student newStudent = new Student(Student_ID, Full_Name, age, Gender, Department, GPA);
        studentsDB.insertRecord(newStudent);
        studentsDB.saveToFile();
    }

    public ArrayList<Student> ViewStudents() {
        return studentsDB.returnAllRecords();
    }

    public void UpdateStudent() {
        studentsDB.saveToFile();
    }

    public boolean DeleteStudent(int Student_ID) {
        if(studentsDB.getRecord(Student_ID) == null) {
            return false;
        }
        else{
        studentsDB.deleteRecord(Student_ID);
        return true;
    }
    }

    public void SearchStudent(int Student_ID) {
        studentsDB.getRecord(Student_ID);
    }

    public void SearchStudent(String Full_Name) {
        for (Student student : studentsDB.returnAllRecords()) {
            if (student.getFull_Name().equals(Full_Name)) {
                System.out.println("Student Found: " + student.lineRepresentation());
            }
        }
    }

    public StudentsDB getStudentsDB() {
        return studentsDB;
    }

    public void setStudentsDB(StudentsDB studentsDB) {
        this.studentsDB = studentsDB;
    }
}
