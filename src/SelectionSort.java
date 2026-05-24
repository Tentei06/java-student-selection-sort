import java.util.ArrayList;
import java.util.Comparator;

/*
----------------------------------------------
Program Name: SelectionSort.java
Author: Cody Walker
Date: 05/24/2026
----------------------------------------------
Pseudocode:
1. Create a selection sort method.
2. Loop through the student list.
3. Find the smallest value based on comparator rules.
4. Swap students into the correct position.
5. Continue until the list is sorted.
----------------------------------------------
Program Inputs: ArrayList<Student>, Comparator<Student>
Program Outputs: Sorted ArrayList of student objects
----------------------------------------------
*/

public class SelectionSort
{
    // Uses selection sort to organize student data.
    // Comparator determines how students are compared.
    public static void selectionSort
    (
        ArrayList<Student> studentList,
        Comparator<Student> comparator
    )
    {
        for (int i = 0; i < studentList.size() - 1; i++)
        {
            int smallestIndex = i;

            // Search remaining list for smallest value
            for (int j = i + 1; j < studentList.size(); j++)
            {
                if
                (
                    comparator.compare
                    (
                        studentList.get(j),
                        studentList.get(smallestIndex)
                    ) < 0
                )
                {
                    smallestIndex = j;
                }
            }

            // Swap students into correct position
            Student temp = studentList.get(i);

            studentList.set
            (
                i,
                studentList.get(smallestIndex)
            );

            studentList.set
            (
                smallestIndex,
                temp
            );
        }
    }
}