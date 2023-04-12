package class9;

public class E7Arrays {

    public static void main(String[] args) {

        boolean[] flags = {true, false, true, false, true, false};


        for (int j = 0; j < flags.length; j++) {

            if (flags[j] == false) {


                System.out.println(flags[j]);

                System.out.println(flags.length);


            }
        }
    }
}