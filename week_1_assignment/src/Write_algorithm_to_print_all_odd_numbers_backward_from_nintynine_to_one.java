public class Write_algorithm_to_print_all_odd_numbers_backward_from_nintynine_to_one {
    public static void main(String[] args) {
        for(int i =99;i>=1;i--)
        {
            if(i%2 != 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
