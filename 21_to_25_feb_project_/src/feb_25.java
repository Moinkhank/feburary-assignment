import java.util.*;
public class feb_25 {
    public static void main(String[] args) {
        //WAP TO PRINT HALF DIAMOND STAR PATTERN

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        int i, j;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i = 1; i < n; i++)
        {
            for (j = i; j < n; j++)
                System.out.print("*");
            System.out.print("\n");
         }*/



        //WAP TO PRINT INVERTED STAR V PATTERN

       /* Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int out,in;
        int row_size=cs.nextInt();
        int print_control_x=row_size;
        int print_control_y=row_size;
        for(out=1;out<=row_size;out++)
        {
            for(in=1;in<=row_size*2;in++)
            {
                if(in==print_control_x||in==print_control_y)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            print_control_x--;
            print_control_y++;
            System.out.println();
        }*/



        //WAP TO PRINT PANT,S STYLE STAR PATTERN

      /*  Scanner scan = new Scanner(System.in);
        System.out.print("Rows : ");
        //Taking total rows as input from user
        int r,s, c, rows = scan.nextInt();
        for(r = 0; r<rows; r++)
        {
            for(c = rows ; c>r; c--)
                //Inner loop that prints first half stars
                System.out.print("* ");
            for(s = 1; s<=4*r;s++)
                //Inner loop that prints space in between
                System.out.print(" ");
            for(c = r+1 ; c<=rows; c++)
                //Inner loop that prints second half stars
                System.out.print("* ");
            //Prints a new line
            System.out.println();
        }*/
   }
}
