package com.towcase.calculator.logic;

import java.util.Scanner;

public class Entering {
    private static String enteringText;
    private byte countOfTries = 0;

    private void enteringText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your example in one row");
        String example = sc.nextLine();
        sc.close();
        if (ExampleCheck.checking(example)){

        }else if (countOfTries < 3){
            System.out.println("Invalid input, try again");
            enteringText();
            System.out.println("Remaining attempts = " + (3 - countOfTries++));
        }else{
            System.out.println("Too many wrong inputs");
        }
    }

    public static String getEnteringText() {
        return enteringText;
    }
}
