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

        System.out.println(funcfindmin(aray, size));
    }

    static int funcfindmin(int[] array, int n) {
        int min = array[0];

        for(int i = 0; i < n; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}