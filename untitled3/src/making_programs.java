import java.util.Scanner;

public class making_programs {
    public static void main(String[] args) {
       /*  // import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("january");
              break;
            case 2:
                System.out.println("feburary");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;

        }
        System.out.println("default");*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<10)
        {
            System.out.println(num*num);
        }
        else
        {
            System.out.println("it is greater then 10");
        }

    }
}
