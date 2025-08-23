//Write a  program to check whether a number is a Strong Number or not.. 
//[ Explanation :Sum of factorial of each digit will be equal to the original number ]
//[ For e.g 145 , Sum of factorial of digits ⇒ 1! + 4! + 5! ⇒ 1 + 4*3*2*1 + 5*4*3*2*1  ⇒ 1 + 24 + 120 = 145  ]

import java.util.Scanner;
public class Question_17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt(),copy=n,sum=0;
        while(copy>0){
            int temp = copy%10;
            int fact =1;
            copy/=10;

            for(int i=temp;i>=1;i--){
                fact*=i;
            }
            sum+=fact;

        }
        if(n==sum){
            System.out.print("Strong Number");
        }
        else{
                        System.out.print("Not Strong Number");

        }

        
        
        sc.close();
    }
}


