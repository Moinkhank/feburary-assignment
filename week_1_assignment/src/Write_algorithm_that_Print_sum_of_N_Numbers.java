import java.util.Scanner;
public class Write_algorithm_that_Print_sum_of_N_Numbers {
    public static void main(String[] args) {
        // write your code here
        Scanner sc =new Scanner(System.in);
        int no = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=no;i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
