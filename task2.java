TASK 2
package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] aray = new int[size];

        for(int i = 0; i < size; ++i) {
            aray[i] = scan.nextInt();
        }

        System.out.println(funcfindaver(aray, size));
    }

    static double funcfindaver(int[] array, int n) {
        double sum = 0;
        for(int i = 0; i < n; ++i) {
            sum = sum + array[i];
        }
        return sum/n;
    }
}