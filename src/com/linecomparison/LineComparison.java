package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
    /**
     * Method for calculating the length of the line1 and line2
     * check equality of two lines and see which is small or
     * greater based on the end points.
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Get user input for first line coordinate.
         * 2) Get user input for second line coordinate.
         * 3) Calculate the length of line1 and line2.
         * 4) Checking both lines are equal or not and printing.
         * 5) comparing the two line to see which one is small, equal or greater.
         */
        Scanner input = new Scanner(System.in);
        int x1, y1, x2, y2;
        int x3, y3, x4, y4;
        /*
         * 1) Get user input for first line coordinate.
         */
        System.out.println("Kindly enter first coordinates x1 and y1: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Kindly enter second coordinates x2 and y2: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        /*
         * 2) Get user input for second line coordinate.
         */
        System.out.println("Enter coordinates of second line");
        System.out.println("Kindly enter first coordinates x3 and y3: ");
        x3 = input.nextInt();
        y3 = input.nextInt();
        System.out.println("Kindly enter second coordinates x4 and y4: ");
        x4 = input.nextInt();
        y4 = input.nextInt();

        /*
         *  3) Calculate the length of line1 and line2.
         */
        Integer lengthOfLine1 = (int) Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        Integer lengthOfLine2 = (int) Math.sqrt( (x4 - x3) ^ 2 + (y4 - y3) ^ 2);

        /*
         *  4) Checking both lines are equal or not and printing.
         */
        if (lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
        /*
         *  5) comparing the two line to see which one is small, equal or greater.
         */
        int result = lengthOfLine1.compareTo(lengthOfLine2);
        if(result > 0){
            System.out.println("Line 1 is greater");
        } else if(result < 0){
            System.out.println("Line 2 is greater");
        } else {
            System.out.println("Both the lines are equal");
        }
    }
}
