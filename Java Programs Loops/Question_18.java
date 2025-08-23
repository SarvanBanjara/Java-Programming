// write a program to check that how many times a digit occurs in agiven no 
// eg if the no is 123425261 the tell how many tims 1 occurs
import java.util.Scanner;
public class Question_18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt(),copy=n;
        System.out.print("Enter the digit to be checked : ");
        int d=sc.nextInt(),count=0;
        while(copy>0){
            int rem = copy%10;
            copy/=10;
            if(rem==d){
                count++;
            }
        }
        System.out.printf("In %d the  digit %d occurs %d times.",n,d,count);
        
        sc.close();
    }
}
