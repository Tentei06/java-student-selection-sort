/*
----------------------------------------------
Program Name: Student.java
Author: Cody Walker
Date: 05/24/2026
----------------------------------------------
Pseudocode:
1. Create a Student class.
2. Store roll number, name, and address.
3. Create a constructor to initialize values.
4. Create a toString method to display student information.
----------------------------------------------
Program Inputs: none
Program Outputs: Student object information
----------------------------------------------
*/

public class Student
{
    int rollno;
    String name;
    String address;

    // Constructor
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    // Safety check to help catch mistakes when overriding methods
    public String toString()
    {
        return "Roll No: " + rollno +
               " | Name: " + name +
               " | Address: " + address;
    }
}