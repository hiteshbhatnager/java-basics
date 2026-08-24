package project6;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter you name");

            String name = sc.next();
            System.out.println("hello" + name);
        }
    }
}
