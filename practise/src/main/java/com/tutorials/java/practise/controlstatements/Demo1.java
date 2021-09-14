package com.tutorials.java.practise.controlstatements;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        /*
          * 1) Simple if statement:
               It is the most basic statement among all control flow statements in Java.
          *    It evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true
          *    if(condition) {
                  statement 1; //executes when condition is true
                }*/


        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        age = scanner.nextInt();
        scanner.close();

        if (age >= 18) //Condition
        {
            System.out.println("you are eligible to cast your vote! ");   // Statements
        }

        /*
        * 2) if-else statement
             The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block.
        *    The else block is executed if the condition of the if-block is evaluated as false.
        *    if(condition) {
                statement 1; //executes when condition is true
             }
             else{
                statement 2; //executes when condition is false
             }
        */

        if (age >= 18){
            System.out.println("your age is: " + age + " & you are eligible to cast your vote!");
        }else {
            System.out.println("your age is: " + age + "  & you are not eligible to cast your vote!");
        }


        /*
        * Switch Statement:
            In Java, Switch statements are similar to if-else-if statements.
            The switch statement contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.
            The switch statement is easier to use instead of if-else-if statements.
            It also enhances the readability of the program.
            *
            * Example: Write a program uses the weekday number to calculate the weekday name:
        * */


        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Weekday Number");
        int day = scnr.nextInt();
        scnr.close();
        Demo1 demo1 = new Demo1();
        demo1.printNameOfTheDay(day);

    }

    private void printNameOfTheDay(int day) {
        String nameOfTheWeekDay = null;
        try {
            switch (day){
                case 1: nameOfTheWeekDay = "Monday";
                    break;
                case 2: nameOfTheWeekDay = "Tuesday";
                    break;
                case 3: nameOfTheWeekDay = "Wednesday";
                    break;
                case 4: nameOfTheWeekDay = "Thursday";
                    break;
                case 5: nameOfTheWeekDay = "Friday";
                    break;
                case 6: nameOfTheWeekDay = "Saturday";
                    break;
                case 7: nameOfTheWeekDay = "Sunday";
                    break;
                default:
                    throw new IllegalStateException("Invalid Day: " + day);
            }
        }catch (IllegalStateException exception){
            System.out.println(exception.fillInStackTrace());
        }

        System.out.println("the day is : " + nameOfTheWeekDay);
    }


}
