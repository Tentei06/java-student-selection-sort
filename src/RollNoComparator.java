import java.util.Comparator;

/*
----------------------------------------------
Program Name: RollNoComparator.java
Author: Cody Walker
Date: 05/24/2026
----------------------------------------------
Pseudocode:
1. Create comparator class.
2. Compare students by roll number.
----------------------------------------------
*/

public class RollNoComparator implements Comparator<Student>
{
    @Override
    // Safety check for overriding compare method
    public int compare(Student student1, Student student2)
    {
        if (student1.rollno > student2.rollno)
        {
            return 1;
        }

        else if (student1.rollno < student2.rollno)
        {
            return -1;
        }

        else
        {
            return 0;
        }
    }
}