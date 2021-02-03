package com.company;
import java.util.Scanner;
public class Lab_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("z1=(sin2a+sin5a-sin3a)/(cos a-cos3a+cos5a)");
        System.out.print("Введите переменную а: ");
        int a = in.nextInt();
        double z1 = (Math.sin(2*a)+Math.sin(5*a)-Math.sin(3*a))/(Math.cos(a)-Math.cos(3*a)+Math.cos(5*a));
        System.out.println(z1);
    }
}
