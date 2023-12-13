import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String studentName;
    double percentage;
    String department;

    public Student(String studentName, double percentage, String department) {
        this.studentName = studentName;
        this.percentage = percentage;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", percentage=" + percentage +
                ", department='" + department + '\'' +
                '}';
    }
    
}

public class SortedList {
    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<>();
        sList.add(new Student("Ram", 75.50, "BFS"));
        sList.add(new Student("Shyam", 80.75, "ABC"));
        sList.add(new Student("MOhan", 65.25, "XYZ"));
        sList.add(new Student("Dev", 90.00, "BFS"));
        
        Collections.sort(sList, Comparator.comparingDouble(student -> student.percentage));

        for (Student st : sList) {
            System.out.println(st);
        }
    }
}
