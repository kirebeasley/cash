package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("How much change is owed?");
        double dollars = input.nextDouble();

        while (dollars <=0 || dollars ==(' '))
        {
            System.out.print("Input a valid amount:");
            dollars = input.nextDouble();
        }

        int cents = (int) Math.round(dollars * 100);
        int cr= 0;

        while(cents>= 25)
        {cents -= 25;
        cr ++;}
        while(cents >= 10)
        {cents -= 10;
        cr++;}
        while(cents >= 5)
        {cents -= 5;
        cr ++;}
        while (cents >= 1)
        {cents -= 1;
        cr ++;}


        System.out.println("Change Owed:" + cr);


    }
}
