package project7;

import java.util.Scanner;

public class method {

    public static void welcome(String name) {
        System.out.println("welcome" + name);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            String name = sc.nextLine();
            System.out.println(name);
        }
        for (int i = 0; i <= 5; i++) {
            welcome("htiseh");
        }
    }
}
