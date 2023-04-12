package HomeWorks;

import java.util.Scanner;

public class HW17 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your mark");

        int mark = key.nextInt();


        if (mark<=25) {
            System.out.println("F");

        } else {

            System.out.println("e");

        }
    }
}
