//Write a  program to check whether a given number is positive or negative and also check whether the given number is even or odd     
import java.util.Scanner;

public class Question_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int no = sc.nextInt();
        sc.close();
        if(no>=0){
            if(no%2==0){
                System.out.print("Poitive and even.");
            }
            else{
                                System.out.print("Poitive and odd.");

            }
        }
        else{
            if(no%2==0){
                System.out.print("Negetive and even.");
            }
            else{
                                System.out.print("Negetive and odd.");

            }
        }
        
        
    }
}