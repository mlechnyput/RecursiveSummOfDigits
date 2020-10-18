package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multidigital number: ");
        String str = sc.nextLine();
        System.out.print(str);
        meth(str);
    }

    public static void meth(String str) {
        System.out.print("-->");
        int summ = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i < str.length() - 1) System.out.print("+");
            else System.out.print("=");
            summ += Character.getNumericValue(str.charAt(i));
        }
        String abc = String.valueOf(summ);
        System.out.print(abc);
        if (abc.length() == 1) return;
        meth(abc);

    }

}
