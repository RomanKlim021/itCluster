package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть масу тіла: ");
        double Weigh = input.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть висоту тіла: ");
        double Heigh = scan.nextInt();

        double BMI =(Weigh / (Heigh * Heigh));

        System.out.println(" Висота " + Heigh + " Маса " + Weigh + " Індекс тіла: " + Math.round(BMI*10000));
    }
}
