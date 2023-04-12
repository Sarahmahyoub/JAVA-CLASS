package class9;

public class E11EnhansedForLoop {

    public static void main(String[] args) {

        int[] num = new int[5];
        num[0]=50;
        num[1]=60;
        num[2]=70;
        num[3]=80;
        num[4]=90;


        for(int numbers:num){

            System.out.println(numbers);
        }
    }

}