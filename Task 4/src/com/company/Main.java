package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть кількість хвилин: ");
        double min = input.nextDouble();
        double hour = min / 60;
        int day =(int)(hour / 24) % 365;
        long year = (long) min / 525600;
        System.out.println(year + " років " + day + " днів ");
    }
}
