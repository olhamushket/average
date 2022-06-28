package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input !=0) {
           sum+=input;
           i++;
           input = scanner.nextInt();
        }
        System.out.println(sum/i);
    }

}