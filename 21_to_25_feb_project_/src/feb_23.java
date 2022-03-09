
import java.util.*;
public class feb_23 {
    public static void main(String[] args) {
        //WAP TO  CHECK THE BRANCH AND YEAR OF THE STUDENT
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        switch (year)
        {
            case 1 :
                System.out.println("you study common subject ");
                break;
            case 2:
            case 3:
            case 4:

                System.out.println(" enter your branch");
                String branch = sc.next();
                switch(branch)
                {
                    case "cse":
                    case "it":
                        System.out.println("you have opted for computer branch");
                    break;
                    case "ee":
                    case"ece" :
                        System.out.println("you have opted for electrical  branch");
                        break;
                    case " civil ":
                        System.out.println("you have opted for civil branch");
                        break;
                    case " mechanical" :
                        System.out.println("you have opted for mechanical branch");
                        break;
                    default:
                        System.out.println("invalid input");
                }

        }
    }
}
