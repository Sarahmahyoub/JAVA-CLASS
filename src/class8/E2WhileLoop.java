package class8;

import java.util.Scanner;

public class E2WhileLoop {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter number");

        int number = key.nextInt();

        while (number != -1) {

            System.out.println(" try again");

            number = key.nextInt();

        }

    }
}
