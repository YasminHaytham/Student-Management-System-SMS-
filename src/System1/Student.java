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
        if(Full_Name == null || Full_Name.trim().isEmpty()){
            
        }
        else{
         this.Full_Name = Full_Name;  
        }
       if(age <= 0 ){
       
       }
       else{
             this.age = age;
       }
      if(Gender == null || Gender.trim().isEmpty()){
          
      }
      else {
         this.Gender = Gender;  
      }
       if(Department == null || Department.trim().isEmpty()){
           
       }
       else {
        this.Department = Department;   
       }
        if(GPA < 0){
            
        }
        else {
          this.GPA = GPA;   
        }
       
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

    public String getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(String Full_Name) {
        this.Full_Name = Full_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
     public String lineRepresentation() {
        return this.Student_ID + "," + this.Full_Name + "," + this.age + "," + this.Gender + "," + this.Department + "," + this.GPA;
    }

    public int getSearchKey() {
        return this.Student_ID;
    }
    
}
