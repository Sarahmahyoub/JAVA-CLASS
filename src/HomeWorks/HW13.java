package HomeWorks;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name=key.next();

        System.out.println("Enter your mobile number");
        String mobile=scan.next();

        System.out.println("Enter your age");
        int age=scan.nextInt();

        System.out.println("Your name is "+name+", your age is "+age+", and your mobile number is "+mobile);

    }
}
