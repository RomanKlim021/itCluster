package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        double val1 = input.nextDouble();

        System.out.println("Введіть друге число: ");
        double val2 = input.nextDouble();
        System.out.println("Сума чисел: " + (val1 + val2));
        System.out.println("Різниця чисел: " + (val1 - val2));
        System.out.println("Добуток чисел: " + (val1 * val2));
        System.out.println("Середнє двох чисел: " + ((val1 + val2)/2));
        System.out.println("Відстань чисел: " + (Math.max(val1,val2) - Math.min(val1,val2)));
        System.out.println("Максимальне число: " + Math.max(val1,val2));
        System.out.println("Мінімальне число: " + Math.min(val1,val2));
    }
}
