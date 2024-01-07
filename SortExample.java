import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student {
    int id;
    int marks;
    String subject;

    student(int id, int marks, String subject)
    {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Marks: " + marks + ", Subject: " + subject;
    }
}

public class SortExample{
    public static void main(String[] args) {
        // Creating ArrayList of class A
        List<student> classA = new ArrayList<>();
        classA.add(new student(1, 90, "Math"));
        classA.add(new student(2, 85, "Science"));
        classA.add(new student(3, 95, "English"));
        classA.add(new student(4, 92, "Math"));
        classA.add(new student(5, 88, "Science"));

        // Defining a Comparator for sorting based on highest marks in "Math" subject
        Comparator<student> mathMarksComparator = Comparator.comparingInt(a -> a.subject.equals("Math") ? a.marks : 0);

        // Sorting based on the custom Comparator
        Collections.sort(classA, mathMarksComparator.reversed());

        System.out.println("Sorted by highest marks in Math subject:");
        for (student a : classA) {
            System.out.println(a);
        }
    }
}
