package System1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentsDB {

    private String filename;
    private List<Student> records;
    

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setRecords(ArrayList<Student> records) {
        this.records = records;
    }

    public StudentsDB(String filename) {
        if (filename == null || filename.trim().isEmpty()) {
             throw new IllegalArgumentException("Filename is Empty!!");
        } else {
            this.filename = filename;
        }

        this.records = new ArrayList<>();
        this.readFromFile();
    }

    public void readFromFile() {
        records.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    Student record = createRecordFrom(line);
                    if (record != null) {
                        records.add(record);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading The file: " + e.getMessage());
        }
    }

    public List<Student> returnAllRecords() {
        return records;
    }

    public boolean contains(int Student_ID) {
        for (Student record : records) {
            if (record.getStudent_ID() == Student_ID) {
                return true;
            }
        }
        return false;
    }

    public Student createRecordFrom(String line) {
        String[] parts = line.split(",");
        if (parts.length == 6) {
            try {
                int Student_ID = Integer.parseInt(parts[0]);
                String Full_Name = parts[1].trim();
                int age = Integer.parseInt(parts[2]);
                String Gender = parts[3].trim();
                String Department = parts[4].trim();
                float GPA = Float.parseFloat(parts[5]);
                return new Student( Student_ID,Full_Name, age, Gender, Department, GPA);
            } catch (NumberFormatException e) {
                System.out.println("Error" + e.getMessage());
            }
        }

        return null;
    }
    
   public void insertRecord(Student record) {
        if (contains(record.getStudent_ID())) {
             throw new IllegalArgumentException("Student with this ID already exists!!");
        } else {
            records.add(record);
        }
    }

    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Student record : records) {
                writer.println(record.lineRepresentation());
            }
        } catch (IOException e) {
            System.out.println( "Error saving to The file : " + e.getMessage());
        }
    }

    public Student getRecord(int key) {
        for (Student record : records) {
            if (record.getStudent_ID()==key) {
                return record;
            }
        }
        return null;
    }

    public void deleteRecord(int key) {
        records.removeIf(record -> record.getStudent_ID() == key);
    }
}
