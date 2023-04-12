package Class4;

import java.util.Scanner;

public class E2if {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("is it time of a break true/false");
        boolean isBreak=input.nextBoolean();

        if(isBreak){

            System.out.println("Let's have a break");

        }else{

            System.out.println("lets continue the class");

        }




    }


}
