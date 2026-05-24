import java.util.Comparator;

/*
----------------------------------------------
Program Name: NameComparator.java
Author: Cody Walker
Date: 05/24/2026
----------------------------------------------
Pseudocode:
1. Create comparator class.
2. Compare students by name.
----------------------------------------------
*/

public class NameComparator implements Comparator<Student>
{
    @Override

    // Safety check to ensure compare() is correctly overridden

    public int compare(Student student1, Student student2)
    {
        // Compare students alphhabetically by name
        return student1.name.compareTo(student2.name);
    }
}