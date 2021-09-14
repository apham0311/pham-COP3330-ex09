package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is the length of the room?");
        int length = checkNumber(scanner.nextLine());
        System.out.println("What is the width of the room?");
        int width = checkNumber(scanner.nextLine());

        int area = length * width;
        int leftOver = area % 350;
        int fullCans = area / 350;
        if(leftOver<350 && leftOver>0) {
            fullCans++;
        }
        System.out.println("You will need to buy " + fullCans + (fullCans>1 ? " cans" : " can") + " to cover " +
                area + " square feet.");
    }

    public static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    public static int checkNumber(String inputStr) {
        String inputToCheck = inputStr;
        int input = 0;
        boolean completed = false;
        while(!completed) {
            if (isNum(inputToCheck)) {
                input = Integer.parseInt(inputToCheck);
                completed = true;
            }
            else {
                System.out.println("Error! Please enter numbers only:");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;
    }
}
