package System1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdminRole {
    static StudentsDB studentsDB = new StudentsDB("Students.txt");

    public AdminRole(StudentsDB studentsDB) {
        AdminRole.studentsDB = studentsDB;
    }

    public boolean AddStudent(String Full_Name, int age, String Gender, String Department, float GPA) {
        Student newStudent = new Student (Full_Name, age, Gender, Department, GPA);
        studentsDB.readFromFile();
        createID(newStudent);
        studentsDB.insertRecord(newStudent);
        studentsDB.saveToFile();
        return true;
    }
       public static void createID(Student newStudent)
    {
        List<Student> records = studentsDB.returnAllRecords();
        if ( records.isEmpty())
        {
            newStudent.setStudent_ID(1000);
        
        }
        else 
        {
        Collections.sort(records, Comparator.comparingInt(student -> student.getStudent_ID()));
        int ID = records.get(records.size()-1).getStudent_ID();
        newStudent.setStudent_ID(ID+1);
       
        }
        
        
    }

    public List<Student> ViewStudents() {
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
        AdminRole.studentsDB = studentsDB;
    }
}
