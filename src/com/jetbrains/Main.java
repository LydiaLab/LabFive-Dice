package com.jetbrains;


// Lab Five: random Dice Roll Simulator. GC Java BootCamp, Lydia Latocki

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char userChar = 'Y';
        System.out.println("Welcome to the Grand Circus Casino!");

        int sides = 0;

        while (userChar == 'Y' ||  userChar =='y') {

            System.out.println("How many sides should each dice have?"); // set variable to pass into random roll generator lines 35,36
            sides = scnr.nextInt();
            Dice(sides);     // calling method to randomly roll 2 separate die.

            System.out.println("Continue? (y/n)"); // passes inside loop to reset new number of sides to die.
            userChar = scnr.next().charAt(0);
        }
        scnr.close();
        System.out.println("Goodbye.");

        return;
    }

    public static void Dice(int sides){

        int die1 = (int)(Math.random()*sides) + 1; // each die has same number of sides.
        int die2 = (int)(Math.random()*sides) + 1;

        System.out.println("Roll: " + die1 + " " + die2);
    }
}






