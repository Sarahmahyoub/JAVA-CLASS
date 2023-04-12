package class7;

import java.util.Scanner;

public class E13WhileLoop {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter number");
        int last = key.nextInt();

        int counter= 1;

        while (counter<=last){
            System.out.println(counter+" ");
            counter++;



        }
    }
}
