package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double max = a;
        if (max<b) max = b;
        if (max<c) max = c;
        if (max<d) max = d;
        System.out.println("Max is " + max);
        double min = a;
        if (min>b) min = b;
        if (min>c) min = c;
        if (min>d) min = d;
        System.out.println("Min is " + min);
    }
}

