//Write a  program to check whether a number is a palindrome or not
import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(),copy=0,temp=n;
        while(temp>0){
            
              copy = (copy*10)+(temp%10) ;
              temp/=10;



        }
        if(copy==n){System.out.print("Palindrome");}
        else{System.out.print("Not Palindrome");}

        
        
        sc.close();
    }
}