package class9;

public class E12EnhansedForLoop {

    public static void main(String[] args) {

        int[] num = new int[5];
        int num2=50;
        for ( int i=0; i<num.length ; i++) {
            num[i] = num2;
            num2=num2+10;

        }
        for(int numbers:num){

            System.out.println(numbers);
        }
    }

}