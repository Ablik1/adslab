package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num1 = scan.nextInt();

        System.out.println(abbinom(num,num1));
    }
    static int abbinom(int n,int k) {
        if (k > n){
            return 0;
        }
        if (k == 0 || k == n){
            return 1;
        }
        return abbinom(n - 1, k - 1) + abbinom(n - 1, k);
    }
}