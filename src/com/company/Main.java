/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the input string? ");
        String str=input.nextLine();
        int count=0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }
        System.out.println("\n"+str+" has "+count+" characters.");
    }
}
