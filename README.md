# Java Student Selection Sort

A Java console application developed for a Programming II coursework assignment at Colorado State University Global. The project demonstrates the selection sort algorithm, custom comparators, and object-oriented programming by organizing student records according to different attributes.

The application creates ten student objects and sorts them by name, roll number, and address using a reusable selection sort method.

## Project Overview

This project implements selection sort to organize a collection of student records.

Each student contains three attributes:

- Roll number
- Name
- Address

The application stores ten predefined student objects in an `ArrayList<Student>` and displays the original list before sorting it using three different criteria.

The sorting operations are performed in the following order:

1. Sort students alphabetically by name.
2. Sort students numerically by roll number.
3. Sort students alphabetically by address.

Rather than implementing a separate sorting algorithm for each attribute, the application uses Java's `Comparator<Student>` interface to determine how records should be compared.

This allows one selection sort method to work with multiple sorting criteria.

## Features

- Creates and stores ten student records
- Uses an `ArrayList` to manage student objects
- Implements selection sort using nested loops
- Sorts students alphabetically by name
- Sorts students numerically by roll number
- Sorts students alphabetically by address
- Uses custom comparator classes
- Demonstrates method overriding
- Displays student information using `toString()`
- Reuses one sorting method for multiple criteria
- Includes screenshots of the original development and testing process

## Technologies Used

- **Java** — Application logic and object-oriented programming
- **Java Collections Framework** — `ArrayList` and `Comparator`
- **Selection Sort** — Sorting algorithm implemented using nested loops
- **Object-Oriented Programming** — Classes, objects, constructors, and method overriding
- **Command Line** — Program compilation and execution

No external libraries are required.

## Programming Concepts Demonstrated

### Selection Sort

Selection sort is a comparison-based sorting algorithm.

It works by repeatedly finding the smallest element in the unsorted portion of a collection and moving that element into its correct position.

The application implements this algorithm in `SelectionSort.java`.

The process follows these steps:

1. Begin at the first position in the list.
2. Assume the current element is the smallest.
3. Compare it with the remaining elements.
4. Identify the smallest element based on the selected comparator.
5. Swap that element into the current position.
6. Move to the next position and repeat until the list is sorted.

The implementation uses nested `for` loops.

The outer loop determines the current sorting position, while the inner loop searches the remaining elements for the smallest value.

Example from the application:

```java
for (int i = 0; i < studentList.size() - 1; i++)
{
    int smallestIndex = i;

    for (int j = i + 1; j < studentList.size(); j++)
    {
        if (comparator.compare(
                studentList.get(j),
                studentList.get(smallestIndex)) < 0)
        {
            smallestIndex = j;
        }
    }

    Student temp = studentList.get(i);
    studentList.set(i, studentList.get(smallestIndex));
    studentList.set(smallestIndex, temp);
}
```

The comparator determines which student should be considered smaller.

### Comparator Interface

Java's `Comparator` interface allows objects to be compared using different criteria.

The project implements three comparator classes:

| Comparator | Sorting Criteria |
|------------|------------------|
| `NameComparator` | Alphabetical order by student name |
| `RollNoComparator` | Ascending numerical order by roll number |
| `AddressComparator` | Alphabetical order by address |

Each comparator implements `Comparator<Student>` and overrides the `compare()` method.

This separates the sorting algorithm from the rules used to compare student objects.

### Sorting by Name

The `NameComparator` class compares student names alphabetically.

```java
@Override
public int compare(Student student1, Student student2)
{
    return student1.name.compareTo(student2.name);
}
```

The `compareTo()` method determines the alphabetical ordering of two strings.

### Sorting by Roll Number

The `RollNoComparator` class compares the numerical roll numbers assigned to each student.

The method returns:

- `1` when the first roll number is greater.
- `-1` when the first roll number is smaller.
- `0` when both roll numbers are equal.

This allows the selection sort method to organize students in ascending numerical order.

### Sorting by Address

The `AddressComparator` class compares student addresses alphabetically.

```java
@Override
public int compare(Student student1, Student student2)
{
    return student1.address.compareTo(student2.address);
}
```

In the original coursework, the address field contains city names.

The comparator therefore sorts students alphabetically by city.

### Classes and Objects

The `Student` class represents an individual student record.

Each object contains:

```java
int rollno;
String name;
String address;
```

A parameterized constructor initializes these values when a student object is created.

The class also overrides `toString()` to display the student information in a readable format.

### ArrayList

The application uses an `ArrayList<Student>` to store the student objects.

For example:

```java
ArrayList<Student> studentList = new ArrayList<Student>();

studentList.add(new Student(105, "Athena", "Denver"));
studentList.add(new Student(101, "Apollo", "Dallas"));
```

The collection is passed to the selection sort method along with the comparator for the requested sorting order.

The same list is reused for all three sorting operations.

## Project Structure

```text
java-student-selection-sort/
├── src/
│   ├── Student.java
│   ├── SelectionSort.java
│   ├── StudentSortTest.java
│   ├── NameComparator.java
│   ├── RollNoComparator.java
│   └── AddressComparator.java
├── Screenshots/
│   └── Development and testing screenshots
├── .gitignore
├── LICENSE
└── README.md
```

### Source Files

| File | Purpose |
|------|---------|
| `Student.java` | Defines the student attributes, constructor, and `toString()` method |
| `SelectionSort.java` | Implements the reusable selection sort algorithm |
| `StudentSortTest.java` | Creates student records and executes the sorting operations |
| `NameComparator.java` | Compares student names |
| `RollNoComparator.java` | Compares student roll numbers |
| `AddressComparator.java` | Compares student addresses |

## How to Run

### Requirements

- Java Development Kit (JDK)
- Terminal or command prompt

### Instructions

1. Clone or download the repository.

2. Open a terminal in the repository's root directory.

3. Compile the Java source files:

   ```bash
   javac src/*.java
   ```

4. Run the application:

   ```bash
   java -cp src StudentSortTest
   ```

5. The console displays the original student list followed by the three sorted lists.

The application uses predefined student records, so no keyboard input is required.

## Example Output

The application begins with ten student records.

### Original Student List

```text
Roll No: 105 | Name: Athena | Address: Denver
Roll No: 101 | Name: Apollo | Address: Dallas
Roll No: 109 | Name: Nyx | Address: Phoenix
Roll No: 103 | Name: Orion | Address: Seattle
Roll No: 107 | Name: Zeus | Address: Chicago
Roll No: 102 | Name: Hades | Address: Boston
Roll No: 110 | Name: Atlas | Address: Miami
Roll No: 104 | Name: Freya | Address: Atlanta
Roll No: 108 | Name: Artemis | Address: Houston
Roll No: 106 | Name: Phoenix | Address: Las Vegas
```

### Sorted by Name

```text
Roll No: 101 | Name: Apollo | Address: Dallas
Roll No: 108 | Name: Artemis | Address: Houston
Roll No: 110 | Name: Atlas | Address: Miami
Roll No: 105 | Name: Athena | Address: Denver
Roll No: 104 | Name: Freya | Address: Atlanta
Roll No: 102 | Name: Hades | Address: Boston
Roll No: 109 | Name: Nyx | Address: Phoenix
Roll No: 103 | Name: Orion | Address: Seattle
Roll No: 106 | Name: Phoenix | Address: Las Vegas
Roll No: 107 | Name: Zeus | Address: Chicago
```

### Sorted by Roll Number

```text
Roll No: 101 | Name: Apollo | Address: Dallas
Roll No: 102 | Name: Hades | Address: Boston
Roll No: 103 | Name: Orion | Address: Seattle
Roll No: 104 | Name: Freya | Address: Atlanta
Roll No: 105 | Name: Athena | Address: Denver
Roll No: 106 | Name: Phoenix | Address: Las Vegas
Roll No: 107 | Name: Zeus | Address: Chicago
Roll No: 108 | Name: Artemis | Address: Houston
Roll No: 109 | Name: Nyx | Address: Phoenix
Roll No: 110 | Name: Atlas | Address: Miami
```

### Sorted by Address

```text
Roll No: 104 | Name: Freya | Address: Atlanta
Roll No: 102 | Name: Hades | Address: Boston
Roll No: 107 | Name: Zeus | Address: Chicago
Roll No: 101 | Name: Apollo | Address: Dallas
Roll No: 105 | Name: Athena | Address: Denver
Roll No: 108 | Name: Artemis | Address: Houston
Roll No: 106 | Name: Phoenix | Address: Las Vegas
Roll No: 110 | Name: Atlas | Address: Miami
Roll No: 109 | Name: Nyx | Address: Phoenix
Roll No: 103 | Name: Orion | Address: Seattle
```

## Algorithm Complexity

Selection sort uses two nested loops to compare elements.

For a collection containing `n` elements:

- **Time complexity:** O(n²)
- **Auxiliary space complexity:** O(1)

The algorithm compares elements repeatedly, making it less efficient than some other sorting algorithms for larger datasets.

However, selection sort is useful for learning how comparison-based sorting algorithms work.

This project uses a small collection of ten student records, making the algorithm appropriate for demonstrating the sorting process.

## Development and Testing Screenshots

The `Screenshots/` directory contains 11 images documenting the original coursework.

These include:

- Java source code in the development environment
- Student class implementation
- Selection sort implementation
- Comparator implementations
- Test application code
- Console output from the application
- Additional test cases
- Original GitHub repository documentation

[View the Screenshots Directory](Screenshots/)

These screenshots preserve the development and testing process associated with the original assignment.

## Current Limitations

This project was developed as an introductory sorting assignment.

Its current limitations include:

- Student records are predefined in the source code.
- Users cannot add, edit, or remove students interactively.
- Sorting is performed using selection sort rather than Java's built-in sorting methods.
- The application sorts strings using their natural, case-sensitive alphabetical order.
- The student records are not saved to an external file or database.
- Output is displayed in the console rather than a graphical interface.
- Selection sort has quadratic time complexity and is not ideal for large collections.

These limitations reflect the educational scope of the original assignment.

## Educational Context

This application was developed for a Programming II course at Colorado State University Global.

The assignment provided practical experience with:

- Implementing a sorting algorithm
- Understanding nested loops
- Comparing and swapping elements
- Creating Java classes and objects
- Using constructors to initialize data
- Working with `ArrayList`
- Implementing the `Comparator` interface
- Overriding the `compare()` and `toString()` methods
- Separating sorting logic from comparison criteria
- Testing different sorting orders

The original coursework structure, pseudocode, and implementation have been preserved to demonstrate programming progression throughout the degree program.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
