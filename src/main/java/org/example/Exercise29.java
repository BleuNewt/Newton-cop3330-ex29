package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Newton
 */
import java.util.*;
public class Exercise29
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? "); //IR
                int r=Integer.parseInt(scan.next()); //read
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag = true;
            }
            catch(NumberFormatException e) //invalid number
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e) //error
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag)
            {
                break;
            }
        }
    }
}
