
////Write a  program to find the LCM of two numbers using GCD formula LCM = (a*b)/GCD(a,b)
import java.util.Scanner;

public class Question_11or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int x=a,y=b;

        while(b!=0){
            int c =  a%b;
            a=b;
            b=c; 


        }
        System.out.printf("The LCM of %d and %d is %d",x,y,(x*y)/a);

        sc.close();
    }
}
