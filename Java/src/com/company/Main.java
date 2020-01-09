package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word 'Java'");
        String s = scanner.nextLine();
        char[][] charJ = {
                {' ', ' ', 'J', 'J', 'J'},
                {' ', ' ', ' ', ' ', 'J'},
                {' ', ' ', ' ', ' ', 'J'},
                {'J', ' ', ' ', ' ', 'J'},
                {' ', 'J', 'J', 'J', 'J'}};

        char[][] charA = {
                {' ', 'A', 'A', 'A', ' '},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'}};

        char[][] charV = {
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {' ', ' ', 'V', ' ', ' '}};

        char[][] char0 = {
                {' ', ' '},
                {' ', ' '},
                {' ', ' '},
                {' ', ' '},
                {' ', ' '}};
        char[][] charE = {
                {'E', 'E', 'E', 'E'},
                {'E', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E'},
                {'E', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E'}};

        char[][] charR = {
                {'R', 'R', 'R', ' '},
                {'R', ' ', ' ', 'R'},
                {'R', 'R', 'R', ' '},
                {'R', ' ', 'R', ' '},
                {'R', ' ', ' ', 'R'}};

        char[][] charO = {
                {' ', 'O', 'O', ' '},
                {'O', ' ', ' ', 'O'},
                {'O', ' ', ' ', 'O'},
                {'O', ' ', ' ', 'O'},
                {' ', 'O', 'O', ' '}};

        if(s.equals("Java")) {
            for (int i = 0; i < charJ.length; i++) {
                for (int j = 0; j < charJ[i].length; j++) {
                    System.out.print(charJ[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charA[i].length; j++) {
                    System.out.print(charA[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charV[i].length; j++) {
                    System.out.print(charV[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charA[i].length; j++) {
                    System.out.print(charA[i][j]);
                }
                System.out.println();
            }
        }
        else {
            for (int i = 0; i < charJ.length; i++) {
                for (int j = 0; j < charE[i].length; j++) {
                    System.out.print(charE[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charR[i].length; j++) {
                    System.out.print(charR[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charR[i].length; j++) {
                    System.out.print(charR[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charO[i].length; j++) {
                    System.out.print(charO[i][j]);
                }
                for (int j = 0; j < char0[i].length; j++) {
                    System.out.print(char0[i][j]);
                }
                for (int j = 0; j < charR[i].length; j++) {
                    System.out.print(charR[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.print("Try again");
        }

    }

}