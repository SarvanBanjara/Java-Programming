//Write a program to print the sum of all even & odd numbers separately up to n term

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),os=0,es=0;
        for(int i =1;i<=n;i++){
            if(i%2==0){es+=i;}
            else{os+=i;}
        }
        System.out.println("Even Sum = "+es);
        System.out.print("Odd Sum = "+os);

        sc.close();



    }
}
