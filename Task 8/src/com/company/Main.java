package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int k = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Введіть своє число");
	double num = input.nextDouble();
	System.out.println("Введіть до якого степеня піднести");
	double power = input.nextDouble();
	for(int i = 1; i <= power; i++ )
        System.out.println("Число в степені "+ i + " - " + (int)Math.pow(num, i));

    }
}
