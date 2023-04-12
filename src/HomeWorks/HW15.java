package HomeWorks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your age ");

        int age = key.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");

        } else {

            System.out.println("You are not eligible to vote");

        }
    }
}
