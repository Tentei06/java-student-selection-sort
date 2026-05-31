import java.util.Comparator;

/*
----------------------------------------------
Program Name: AddressComparator.java
Author: Cody Walker
Date: 05/31/2026
----------------------------------------------
Pseudocode:
1. Create comparator class.
2. Compare students by address.
----------------------------------------------
Program Inputs: Student objects
Program Outputs: Comparison result by address
----------------------------------------------
*/

public class AddressComparator implements Comparator<Student>
{
    @Override
    // Safety check to ensure compare() is correctly overridden
    public int compare(Student student1, Student student2)
    {
        // IMPROVEMENT: compare students alphabetically by address
        return student1.address.compareTo(student2.address);
    }
}