package HomeWorks;

public class HW20 {

    public static void main(String[] args) {

        int i, j, rows=9;

        for (i = 9; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//Prints lower half  pattern
        for (i = 2; i <= 9; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



}


