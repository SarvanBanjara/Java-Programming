//Write a program to print Fibonacci series up to Nth terms

import java.util.Scanner;
public class Question_9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int no = sc.nextInt(),p=0,c=1,n=p+c;
        System.out.print(p+" "+c+" ");
        for(int i=1;i<no-1;i++){
            p=c;
            c=n;
            n=p+c;
            System.out.print(c+" ");
        }
        
        
        
        sc.close();
    }
}