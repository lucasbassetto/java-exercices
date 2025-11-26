package org.example.ForWhile;

import java.util.Scanner;

public class WithoutFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++) {
           if(i % 10 == 5) {
               continue;
           }
              System.out.print(i + " ");
        }
    }
}
