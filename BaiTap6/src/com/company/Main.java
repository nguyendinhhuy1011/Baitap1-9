package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char kytu;
    int sokytu;
        System.out.println("Input your Character:");
    kytu = sc.nextLine().charAt(0);
    kytu = Character.toLowerCase(kytu);
    sokytu = kytu;
        if (sokytu >=97 && sokytu <=122){
            switch (kytu){
                case 'u':
                    System.out.println("Your character is vowel");
                    break;
                case 'e':
                    System.out.println("Your character is vowel");
                    break;
                case 'o':
                    System.out.println("Your character is vowel");
                    break;
                case 'a':
                    System.out.println("your character is vowel");
                    break;
                case 'i':
                    System.out.println("Your character is vowel");
                    break;
                default:
                    System.out.println("Your character is consonant");
            }
        }else
            {
                System.out.println("Your character is not in alphabet");

        }
    }
}

