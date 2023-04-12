package class9;

import com.sun.tools.javac.Main;

public class E6Arrays {

    public static void main(String[] args) {

        int[] num = {10, 50, 60, 45, 100};

        for (int j = 0; j <num.length; j++) {

            if (j % 2!= 0) {


                System.out.println(num[j]);


            }
        }
    }
    }