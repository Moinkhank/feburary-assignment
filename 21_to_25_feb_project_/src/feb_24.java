import java.util.*;
public class feb_24 {
    public static void main(String[] args) {
        // LEFT TRIANGLE STAR PATTERN
       /* Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0;i< row; i++)
        {
            for(int j = 0;j< i;j++)
            {
                System.out.print("  *");
            }
            System.out.println();
        }*/


        //PYRAMID PATTERN
       /* Scanner sc = new Scanner(System.in);
        int i,j,k=0,row=sc.nextInt();

        for (i=1;i<=row;i++)
        {

            for(j=1;j<=row-i;j++)
                System.out.print(" ");

            while(k!=(2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k=0;
            System.out.println();
        }*/


        //WAP TO PRINT FULL DIAMOND STAR PATTERN

       /* Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of row ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/




    }
}
