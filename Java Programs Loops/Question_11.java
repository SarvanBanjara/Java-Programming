
//Write a  program to find the LCM of two numbers
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int temp = a;
        sc.close();

        for (;;) {

            if (temp % a == 0 && temp % b == 0) {
                break;

            } else {
                temp += a;
            }
        }

        System.out.print("LCM of " + a + " and " + b + " is " + temp);

        
    }
}