package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, x1, x2, delta;
        System.out.println("Input a");
        float a = sc.nextFloat();
        System.out.println("Input b");
        float b = sc.nextFloat();
        System.out.println("Input c");
        float c = sc.nextFloat();
        if (a == 0) {
            System.out.println("x= "+ (-b / c));
        } else {
            delta = (b * b) - (4 * a * c);
            if (delta == 0) {
                x1 = (-b) / (2 * a);
                x2 = x1;
            } else if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
            } else {
                System.out.println("Phuong Trinh vo Nghiem");
            }
        }

    }
}