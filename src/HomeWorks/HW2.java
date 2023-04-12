package HomeWorks;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = product.nextInt();
        if (num <= 10) {
            System.out.println("small");

        } else if (num > 10 && num <= 100) {

            System.out.println("medium");
        } else if (num > 100 && num <= 1000) {

            System.out.println("large");
        }


    }


}

