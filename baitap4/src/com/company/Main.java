package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if (a+b>c && a+c>b && b+c>a)
            System.out.println("a b c là cạnh của 1 tam giác");
        else
            System.out.println(" a b c khong phai la canh cua 1 tam giac");
    }
}
