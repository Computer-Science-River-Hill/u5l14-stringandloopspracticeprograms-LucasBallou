package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Program Name: String and Loops Practice Programs
 * Author: Lucas Ballou
 */

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for the following programs:\n1 - Further Substring Fun\n2 - Run of Integers\n3 - Sum of a Range of Sequential Integers\n4 - Repeatedly Echo a Word\n5 - Words Separated by Dots\n6 - Adding Up Integers\n7 - Shipping Cost Calculator\nInput: ");
        int choice = input.nextInt();
        System.out.println();

        if (choice == 1) {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String string = input1.nextLine();
            System.out.print("Enter beginning index: ");
            int beginIndex = input1.nextInt();
            System.out.print("Enter ending index: ");
            int endIndex = input1.nextInt();
            System.out.println();

            String newString = string.substring(beginIndex, endIndex);
            
            System.out.println("Original string: " + string);
            System.out.println("Substring: " + newString);
        }
        if (choice == 2) {
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter Start: ");
            int start = input2.nextInt();
            System.out.print("Enter End: ");
            int end = input2.nextInt();
            System.out.println();
            
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }
        if (choice == 3) {
            Scanner input3 = new Scanner(System.in);
            System.out.print("Enter low: ");
            int low = input3.nextInt();
            System.out.print("Enter high: ");
            int high = input3.nextInt();
            System.out.println();
            int accumulator = 0;

            for (int i = low; i <= high; i++) {
                accumulator += i;
            }
            
            System.out.println("Sum = " + accumulator);
        }
        if (choice == 4) {
            Scanner input4 = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = input4.nextLine();
            System.out.println();

            for (int i = 0; i < word.length(); i++) {
                System.out.println(word);
            }
        }
        if (choice == 5) {
            Scanner input5 = new Scanner(System.in);
            System.out.print("Enter first word: ");
            String firstWord = input5.nextLine();
            System.out.print("Enter second word: ");
            String secondWord = input5.nextLine();
            System.out.println();

            int dotCount = (30 - (firstWord.length() + secondWord.length()));

            System.out.print(firstWord);
            for (int i = 0; i < dotCount; i++) {
                System.out.print(".");
            }
            System.out.println(secondWord);
        }
        if (choice == 6) {
            Scanner input6 = new Scanner(System.in);
            System.out.print("How many integers will be added: ");
            int numOfInt = input6.nextInt();
            int sum = 0;

            for (int i = 0; i < numOfInt; i++) {
                System.out.print("Enter an integer: ");
                int integer = input6.nextInt();
                sum += integer;
            }

            System.out.println();
            System.out.println("The sum is " + sum);
        }
        if (choice == 7) {
            Scanner input7 = new Scanner(System.in);
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            double cost;
            int weight;
            do {
                System.out.print("Weight of Order: ");
                weight = input7.nextInt();
                if (weight <= 0) {
                    break;
                }
                if (weight <= 10) {
                    cost = 3;
                    System.out.println("Shipping Cost: " + currencyFormatter.format(cost));
                    System.out.println();
                }
                if (weight > 10) {
                    cost = 3 + (0.25 * (weight - 10));
                    System.out.println("Shipping Cost: " + currencyFormatter.format(cost));
                    System.out.println();
                }
            }
            while (weight > 0);
            System.out.println();
            System.out.println("bye");
        }
    }
}