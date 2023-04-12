package class8;

import java.util.Scanner;

public class E1WhileLoop {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter number starting point, ending point, ");

        int start = key.nextInt();
        int end = key.nextInt();

        int number = start;
        while (number <= end) {

            System.out.println(number + " ");

            number++;
        }


    }
}
