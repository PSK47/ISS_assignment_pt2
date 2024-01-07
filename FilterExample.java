import java.util.*;
import java.io.*;

class students
{
    int id;
    int marks;
    String subject;

    students(int a,int b,String c)
    {
        this.id=a;
        this.marks=b;
        this.subject=c;
    }

}

public class FilterExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        students classA[]=new students[10];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter details of student no "+(i+1)+":");
            int a=sc.nextInt();
            int b=sc.nextInt();
            String c=sc.next();
            classA[i]=new students(a,b,c);
        }

        ArrayList<students> filteredList=new ArrayList<students>();
        for (int i=0;i<3;i++)
        {
            if(classA[i].marks>60)
            {
                filteredList.add(classA[i]);
            }
        }

        System.out.println("Filtered List:");
        for (students student : filteredList)
        {
             System.out.println("ID: " + student.id + ", Marks: " + student.marks + ", Subject: " + student.subject);
        }
}
}
