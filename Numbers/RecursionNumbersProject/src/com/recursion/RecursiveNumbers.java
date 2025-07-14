package com.recursion;
import java.util.Scanner;

public class RecursiveNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = getValidNumber(scanner, i + 1);
        }
        
        int result = calculateProduct(numbers, 0);
        System.out.println("Product of all numbers: " + result);
        
        scanner.close();
    }
    
    public static int getValidNumber(Scanner scanner, int position) {
        while (true) {
            System.out.print("Enter number " + position + ": ");
            
            try {
                String input = scanner.nextLine(); 
                int num = Integer.parseInt(input.trim());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
            }
        }
    }
    
    public static int calculateProduct(int[] arr, int index) {
        if (index >= arr.length) {
            return 1;
        }
        return arr[index] * calculateProduct(arr, index + 1);
    }
}