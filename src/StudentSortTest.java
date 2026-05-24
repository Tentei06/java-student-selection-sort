import java.util.ArrayList;

/*
----------------------------------------------
Program Name: StudentSortTest.java
Author: Cody Walker
Date: 05/24/2026
----------------------------------------------
Pseudocode:
1. Create an ArrayList of students.
2. Add 10 student objects.
3. Display original student list.
4. Sort students by name.
5. Display sorted results.
6. Sort students by roll number.
7. Display sorted results.
----------------------------------------------
Program Inputs: none
Program Outputs: Student sorting results
----------------------------------------------
*/

public class StudentSortTest
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(105, "Athena", "Denver"));
        studentList.add(new Student(101, "Apollo", "Dallas"));
        studentList.add(new Student(109, "Nyx", "Phoenix"));
        studentList.add(new Student(103, "Orion", "Seattle"));
        studentList.add(new Student(107, "Zeus", "Chicago"));
        studentList.add(new Student(102, "Hades", "Boston"));
        studentList.add(new Student(110, "Atlas", "Miami"));
        studentList.add(new Student(104, "Freya", "Atlanta"));
        studentList.add(new Student(108, "Artemis", "Houston"));
        studentList.add(new Student(106, "Phoenix", "Las Vegas"));

        System.out.println("Original Student List:");

        for (Student student : studentList)
        {
            System.out.println(student);
        }

        System.out.println("\nSorted By Name:");

        SelectionSort.selectionSort
        (
            studentList,
            new NameComparator()
        );

        for (Student student : studentList)
        {
            System.out.println(student);
        }

        System.out.println("\nSorted By Roll Number:");

        SelectionSort.selectionSort
        (
            studentList,
            new RollNoComparator()
        );

        for (Student student : studentList)
        {
            System.out.println(student);
        }
    }
}