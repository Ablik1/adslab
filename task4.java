
package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return factorial(n-1)*n;

    }
}