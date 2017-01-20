package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int retrievedNumber = readNumber();
        List<Integer> myList = getHailstoneSequence(retrievedNumber);
        System.out.println(myList);
    }

    private static List<Integer> getHailstoneSequence(int number) {
        List<Integer> myList = new ArrayList<>();
        myList.add(number);
        while (number != 1) {
            if (number % 2 == 0)
                number = number / 2;
            else
                number = number * 3 + 1;
            myList.add(number);

        }
        return myList;

    }

    public static int readNumber() {
        System.out.println("Please enter a positive number");
        Scanner s = new Scanner(System.in);
        int number = -1;
        while (number == -1) {
            try {
                number = s.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Please provide a valid number");
                s.nextLine();
            }
        }
        return number;
    }
}
