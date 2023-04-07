package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
    /**
     * Method for calculating the length of the line.
     * @param args
     */

    public static void main(String[] args) {
        /**
         * 1) Get user input for first coordinate.
         * 2) Get user input for second coordinate.
         * 3) Calculate the length of line.
         * 4) print the length of line.
         */
        Scanner input = new Scanner(System.in);
        int x1, y1, x2, y2;
        /**
         * 1) Get user input for first coordinate.
         */
        System.out.println("Kindly enter first coordinates x1 and y1: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        /**
         * 2) Get user input for second coordinate.
         */
        System.out.println("Kindly enter second coordinates x2 and y2: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        /**
         *  3) Calculate the length of line.
         */
        int lengthOfLine = (int) Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        /**
         *  4) print the length of line.
         */
        System.out.println("length of line: " + lengthOfLine);
    }
}
