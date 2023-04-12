package Class4;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is you age?");

        int age = scan.nextInt();
        if (age > 18) {
            System.out.println("You can drive");

        } else {

            System.out.println("you can't drive");
        }

    }
    }
