package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int no = sc.nextInt();
        for(int i = 1;i<=10;i++)
        {
            System.out.println(no+"x"+i+"="+no*i);
        }
    }
}
