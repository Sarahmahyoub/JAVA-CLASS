package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you salary");

        int salary = scan.nextInt();
        if (salary > 100000) {
            System.out.println("You are rich");

        } else {

            System.out.println("you need to look for better opportunity");

        }


    }


}
