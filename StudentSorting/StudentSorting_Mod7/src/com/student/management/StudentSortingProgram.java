package com.student.management;

import java.util.ArrayList;

public class StudentSortingProgram {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        // Adding 10 students, most from a random name generator, to show that the program works
        students.add(new Student(101, "John Smith", "123 Main St"));
        students.add(new Student(105, "Jane Doe", "456 Oak Ave"));
        students.add(new Student(102, "Bob Williams", "789 Pine Rd"));
        students.add(new Student(104, "Yasmin Watson", "321 Elm St"));
        students.add(new Student(103, "Lennox Clements", "654 Maple Dr"));
        students.add(new Student(106, "Allison Shannon", "987 Cedar Ln"));
        students.add(new Student(109, "Tatum Callahan", "147 Birch Way"));
        students.add(new Student(108, "Quinton Woods", "258 Spruce Ct"));
        students.add(new Student(110, "Brynlee Vazquez", "369 Willow Pl"));
        students.add(new Student(111, "Layne Marquez", "741 Cherry Blvd"));
        
        // Unaltered list
        System.out.println("Original List of Students: \n ==========================");
        displayStudents(students);
        
        // Make duplicates for sorting
        ArrayList<Student> studentsByName = new ArrayList<>(students);
        ArrayList<Student> studentsByRollNum = new ArrayList<>(students);
        
        SelectionSort.selectionSort(studentsByName, new ComparatorNames());
        System.out.println("\n\nStudents Sorted by Name:");
        System.out.println("========================");
        displayStudents(studentsByName);
        
        SelectionSort.selectionSort(studentsByRollNum, new ComparatorRollNum());
        System.out.println("\n\nStudents Sorted by Roll Number:");
        System.out.println("===============================");
        displayStudents(studentsByRollNum);
    }
    
    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
