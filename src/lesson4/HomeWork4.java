package lesson4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String a = scanner.next();
        System.out.println("Enter your last name:");
        String b = scanner.next();
        System.out.println("Enter your city:");
        String c = scanner.next();
        System.out.println("Enter your age:");
        String d = scanner.next();
        System.out.println("Enter your height:");
        String e = scanner.next();
        System.out.println("Result:");
        System.out.println("My name is " + a + " " + b + ", " + "I live in " + c + ", " + "I am " + d + "y.o., " + "my height is " + e + "cm.");
    }
}
