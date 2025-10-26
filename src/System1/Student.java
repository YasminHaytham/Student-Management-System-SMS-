package System1;

public class Student {

    private int Student_ID;
    private String Full_Name;
    private int age;
    private String Gender;
    private String Department;
    private float GPA;

    public Student(int Student_ID, String Full_Name, int age, String Gender, String Department, float GPA) {
        this.Student_ID = Student_ID;
        this.Full_Name = Full_Name;
        this.age = age;
        this.Gender = Gender;
        this.Department = Department;
        this.GPA = GPA;

    }

    public Student(String Full_Name, int age, String Gender, String Department, float GPA) {
        if (Full_Name == null || Full_Name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name is Empty!!");
        } else {
            this.Full_Name = Full_Name;
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be ZERO or NEGATIVE !!");
        } else {
            this.age = age;
        }

        if (Gender == null || Gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender is Empty!!");
        } else if (Gender.equalsIgnoreCase("male") || Gender.equalsIgnoreCase("female")) {
            throw new IllegalArgumentException("Invalid Gender !!");
        } else {
            this.Gender = Gender;
        }
        if (Department == null || Department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department is Empty!!");
        } else {
            this.Department = Department;
        }
        if (GPA < 0) {
            throw new IllegalArgumentException("GPA cannot be NEGATIVE !!");
        } else if (GPA > 4) {
            throw new IllegalArgumentException("GPA cannot be more than 4!!");
        } else {
            this.GPA = GPA;
        }

    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        if (Student_ID <= 0) {
            throw new IllegalArgumentException("Student ID cannot be Negative !!");
        } else {
            this.Student_ID = Student_ID;
        }
    }

    public String getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(String Full_Name) {
        if (Full_Name == null || Full_Name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name is Empty!!");
        } else {
            this.Full_Name = Full_Name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be ZERO or NEGATIVE !!");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        if (Gender == null || Gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender is Empty!!");
        } else if (Gender.toLowerCase().equals("male") || Gender.toLowerCase().equals("Female")) {
            throw new IllegalArgumentException("Invalid Gender !!");
        } else {
            this.Gender = Gender;
        }
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        if (Department == null || Department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department is Empty!!");
        } else {
            this.Department = Department;
        }
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        if (GPA < 0) {
            throw new IllegalArgumentException("GPA cannot be NEGATIVE !!");
        } else if (GPA > 4) {
            throw new IllegalArgumentException("GPA cannot be more than 4!!");
        } else {
            this.GPA = GPA;
        }
    }

    public String lineRepresentation() {
        return this.Student_ID + "," + this.Full_Name + "," + this.age + "," + this.Gender + "," + this.Department + "," + this.GPA;
    }

    public int getSearchKey() {
        return this.Student_ID;
    }

}
