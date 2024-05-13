
/*question 1 Write a program that allows the user to enter a sequence of numbers into an 
array. The program should then prompt the user to enter a number to be 
searched. The program should determine if the number is present in the array 
and, if so, display the number of times it appears.*/

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        
  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        
       
        System.out.print("Enter the number to search: ");
        int searchNum = scanner.nextInt();
        
        
        int count = 0;
        for (int num : arr) {
            if (num == searchNum) {
                count++;
            }
        }
        
        
        if (count > 0) {
            System.out.println(searchNum + " is present in the array " + count + " times.");
        } else {
            System.out.println(searchNum + " is not present in the array.");
        }
        
        scanner.close();
    }
}

