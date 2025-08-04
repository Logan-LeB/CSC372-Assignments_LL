package com.student.loop;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentLoopProgram {

	    public static void main(String[] args) {
	        LinkedList<Student> students = new LinkedList<>();
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        boolean continueEntry = true;
	        while (continueEntry) {
	            System.out.print("Enter student name: ");
	            String name = scanner.nextLine();
	            
	            System.out.print("Enter student address: ");
	            String address = scanner.nextLine();
	            
	            double gpa = 0.0;
	            boolean validGPA = false;

	            while (!validGPA) {
	                System.out.print("Enter student GPA to a single decimal: ");
	                String gpaInput = scanner.nextLine();
	                try {
	                    gpa = Double.parseDouble(gpaInput);
	                    if (gpa >= 0.0 && gpa <= 4.0) {
	                        validGPA = true;
	                    } else {
	                        System.out.println("GPA must be between 0.0 and 4.0 inclusive. Try again.");
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input. GPA must be a number to a single decimal between 0 and 4 inclusive. Try again.");
	                }
	            }
	            
	            Student student = new Student(name, address, gpa);
	            students.add(student);
	            
	            System.out.print("Add another student? (Y/N): ");
	            String response = scanner.nextLine().trim().toLowerCase();
	            continueEntry = response.equals("y");
	        }
	        
	        Collections.sort(students, new ComparatorNames());
	        
	        String fileName = "students.txt";
	        try (PrintWriter writer = new PrintWriter(fileName)) {
	            for (Student student : students) {
	                writer.println(student.toString());
	            }
	            System.out.println("Student data written to " + fileName + " successfully.");
	        } catch (FileNotFoundException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}