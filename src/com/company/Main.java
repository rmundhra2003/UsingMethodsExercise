package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Input 2 numbers and add them
        add2Numbers(keyboard);
        //Input 2 numbers and divide
        divide2NumbersInputFromUser(keyboard);
        //Input 5 letters and output sorted
        inputLettersFromUserOutputSorted(keyboard);
        //Get length of string
        inputStringGetLength(keyboard);
        //Get average of three numbers
        input3NumbersGetAverage(keyboard);
        //Check if leap year
        checkIfLeapYear(keyboard);
        //count the words in sentence
        countWordsInSentence(keyboard);
        //Calculate area
        calculateArea(keyboard);
        //print 5 random numbers
        print5NumbersGivenBound(keyboard);
        //print random word from list
        printRandomWordFromList();
        //Check if input number is odd or even
        checkOddOrEven(keyboard);
        //Calculate letter grade
        letterGrade(keyboard);
    }

    //Method to add 2 numbers
    public static void add2Numbers(Scanner scan) {
        int add1, add2;
        //Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 2 numbers that need to be added: ");
        add1 = scan.nextInt();
        add2 = scan.nextInt();
        scan.nextLine();
        System.out.println("" + add1 + "/" + add2 + "=" + (add1 + add2));
    }

    /* Application to divide 2 numbers. Prompt the user to enter two numbers. Take the first number and divide it by
     * the second number and print that result to the screen. If the second number is a zero, print "Undefined" to the
     * screen, otherwise just print the result.
     */
    public static void divide2NumbersInputFromUser(Scanner scan) {
        int div1, div2;
        //Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.print("Enter the 2 numbers that need to be divided: ");
        div1 = scan.nextInt();
        div2 = scan.nextInt();
        scan.nextLine();
        if (div2 == 0) {
            System.out.println("Undefined");
        } else {
            System.out.printf("%d/%d = %d\n", div1, div2, div1 / div2);
        }
    }

    /*
     *
     * Get 5 letters from the user, output them sorted (Hint: Use ArrayList and Collections.sort())
     */
    public static void inputLettersFromUserOutputSorted(Scanner scan) {
        //Scanner scan = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();
        scan.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the letter: ");
            strList.add(scan.nextLine());
        }
        Collections.sort(strList);
        System.out.println("" + strList.toString());
    }

    /*
     * Get the length of a string.
     */
    public static void inputStringGetLength(Scanner scan) {
        String inputStr;
        scan.nextLine();
        System.out.print("Enter the string: ");
        inputStr = scan.nextLine();
        System.out.println("The length of " + inputStr + "=" + inputStr.length());
    }


    /*
     * Get the average of 3 numbers.
     */
    public static void input3NumbersGetAverage(Scanner scan) {
        int int1, int2, int3;
        scan.nextLine();

        System.out.print("Enter 3 numbers to compute average: ");
        int1 = scan.nextInt();
        int2 = scan.nextInt();
        int3 = scan.nextInt();
        scan.nextLine();
        System.out.println("Average of the three numbers " + int1 + ", " + int2 + ", " + int3 + " " + "= " + ((int1 + int2 + int3) / 3));
    }

    /*
     * Check if a year is a leap year (A leap year is divisible by 4).
     */
    public static void checkIfLeapYear(Scanner scan) {
        int year;
        scan.nextLine();

        System.out.print("Enter the year: ");
        year = scan.nextInt();
        //check if leap year
        if (year % 400 == 0) // Exactly divisible by 400 e.g. 1600, 2000
            System.out.printf("%d is a leap year.\n", year);
        else if (year % 100 == 0) // Exactly divisible by 100 and not by 400 e.g. 1900, 2100
            System.out.printf("%d isn't a leap year.\n", year);
        else if (year % 4 == 0) // Exactly divisible by 4 and neither by 100 nor 400 e.g. 2016, 2020
            System.out.printf("%d is a leap year.\n", year);
        else // Not divisible by 4 or 100 or 400 e.g. 2017, 2018, 2019
            System.out.printf("%d isn't a leap year.\n", year);
        scan.nextLine();

    }

    /*
     * Count all words in the sentence: The dog jumped over the fence (use String.split(" ") method).
     */
    public static void countWordsInSentence(Scanner scan) {
        String inputStr;
        scan.nextLine();
        System.out.print("Enter the string: ");
        inputStr = scan.nextLine();
        System.out.print("The words in sentence \"" + inputStr + "\" = ");
        String[] strArray = inputStr.split(" ");
        System.out.println("" + strArray.length);
    }

    /*
     * Calculate the area of a rectangle with length and width input from the user.
     */
    public static void calculateArea(Scanner scan) {
        int length, breadth;
        //Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.print("Enter the length and breadth: ");
        length = scan.nextInt();
        breadth = scan.nextInt();
        scan.nextLine();
        System.out.printf("Area of rectangle = %d\n", length * breadth);
    }

    /*
     * Print a 5 random numbers given a bound.
     */
    public static void print5NumbersGivenBound(Scanner scan) {
        Random random = new Random();
        int bound;
        scan.nextLine();
        System.out.print("Enter bound: ");
        bound = scan.nextInt();
        scan.nextLine();
        System.out.println("Random numbers are " + random.nextInt(bound) + " "
                + random.nextInt(bound) + " " + random.nextInt(bound) + " " + random.nextInt(bound)
                + " " + random.nextInt(bound) + " ");

    }

    /*
     * Given the array list, print a random word from the list: (module, class, implement).
     */
    public static void printRandomWordFromList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("The");
        arrayList.add("quick");
        arrayList.add("brown");
        arrayList.add("fox");
        arrayList.add("jumps");
        arrayList.add("over");
        arrayList.add("the");
        arrayList.add("lazy");
        arrayList.add("dog");
        Collections.shuffle(arrayList);
        System.out.println("" + arrayList.get(1));
    }

    /*
     * Take integer input from the user, output whether it's odd or even.
     */
    public static void checkOddOrEven(Scanner scan) {
        int number;
        scan.nextLine();

        System.out.print("Enter the number: ");
        number = scan.nextInt();
        if (number % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
        scan.nextLine();

    }

    /*
     * Program that will print the letter grade based on the percentage entered.
     * The letter grade is determined as follows:
     * A = 90–100%
     * B = 80–89%
     * C = 70–79%
     * D = 60–69%
     * F = 0–59%
     *
     */
    public static void letterGrade(Scanner scan) {
        int percentage;
        scan.nextLine();

        System.out.print("Enter the percentage: ");
        percentage = scan.nextInt();

        try {
            switch (percentage/10) {
                case 9:
                case 10:
                    System.out.printf("Letter grade for %d" +
                            " = \'A\'", percentage);
                    break;
                case 8:
                    System.out.printf("Letter grade for %d percent = \'B\'", percentage);
                    break;
                case 7:
                    System.out.printf("Letter grade for %d percent = \'C\'", percentage);
                    break;
                case 6:
                    System.out.printf("Letter grade for %d percent = \'D\'", percentage);
                    break;
                default:
                    System.out.printf("Letter grade for %d percent = \'F\'", percentage);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
