package class6;

import java.util.Scanner;

public class HWScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter height");

        int height = scan.nextInt();

        if (height<60){

            System.out.println("Short");
        }if (height>60&&height<72){

            System.out.println("Medium");
        }if(height>72){

            System.out.println("tall");
        }
    }

}
