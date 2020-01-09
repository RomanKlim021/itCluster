package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть відстань в метрах: ");
        double distance = scanner.nextFloat();
        System.out.print("Введіть кількість годин: ");
        double hour = scanner.nextFloat();
        System.out.print("Введіть кількість хвилин: ");
        double min = scanner.nextFloat();
        System.out.print("Введіть кількість секунд: ");
        double sec = scanner.nextFloat();
        double timeInSec = (hour*3600) + (min * 60) + sec;
        double metrInSec = distance / timeInSec;
        double kmInHour = (distance / 1000) / (timeInSec / 3600);
        double mInHour = kmInHour / 1.609;
        System.out.println("Час: " + (int)hour + ":" + (int)min + ":" + (int)sec);
        System.out.println(metrInSec + " метрів за секунду");
        System.out.println(kmInHour + " кіломентрів за годину");
        System.out.println(mInHour + " миль за годину");
    }
}
