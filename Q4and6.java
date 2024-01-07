import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    int id;
    int age;
    String name;

    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [ID: " + id + ", Age: " + age + ", Name: " + name + "]";
    }


}

class Subject {
    int id;
    String name;

    Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject [ID: " + id + ", Name: " + name + "]";
    }
}

public class Q4and6 {
    public static void main(String[] args) {

        Map<Student, List<Subject>> studentSubjectMap = new HashMap<>();

        // Creating different objects
        Student student1 = new Student(1, 20, "John");
        Student student2 = new Student(2, 22, "Alice");

        Subject subject1 = new Subject(101, "Math");
        Subject subject2 = new Subject(102, "History");
        Subject subject3 = new Subject(103, "Science");

        // Populating the map
        studentSubjectMap.put(student1, new ArrayList<>());
        studentSubjectMap.get(student1).add(subject1);
        studentSubjectMap.get(student1).add(subject2);

        studentSubjectMap.put(student2, new ArrayList<>());
        studentSubjectMap.get(student2).add(subject3);


        for (Map.Entry<Student, List<Subject>> entry : studentSubjectMap.entrySet()) {
            Student student = entry.getKey();
            List<Subject> subjects = entry.getValue();

            System.out.println("Student: " + student);
            System.out.println("Subjects: " + subjects);
            System.out.println();
        }
    }
}
