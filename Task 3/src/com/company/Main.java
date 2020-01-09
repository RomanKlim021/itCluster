package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число до 1000");
        int n = scanner.nextInt();

        if (n <= 1000) {
            while (n != 0) {
                sum += (n % 10);
                n /= 10;
            }
            System.out.println(sum + " ");
        } else
            System.out.println("Ви ввели невірне число, введіть ще раз число до 1000");
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();

        if (m <= 1000) {
            while (m != 0) {
                sum += (m % 10);
                m /= 10;
            }
            System.out.println(sum + " ");
        }
    }
}
