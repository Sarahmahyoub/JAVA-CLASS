package HomeWorks;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = product.nextInt();
        if (num <= 5) {
            System.out.println("Its a weekday");

        } else if (num>5 && num<=7) {

            System.out.println("Its a weekend");
        }else{

            System.out.println("Invalid day");
        }


    }
}
