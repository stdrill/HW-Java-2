package org.example;
/**
 * 4) Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */

import java.util.Scanner;

public class task4 {
    public static void main(String [] args){
        int n, a, b;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (b > a){
                a =b;
            } else {
                System.out.println("Последовательность не является возрастающей");
            }
        }
        System.out.println("Последовательсность возрастает");
    }
}
