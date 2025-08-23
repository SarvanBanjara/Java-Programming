
//Write a program to input cost price and selling price of a product and check profit or loss
import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Selling Price : ");
        int sp = sc.nextInt();
        System.out.print("Enter the Cost Price : ");
        int cp = sc.nextInt();
        if (cp <= sp) {
            System.out.print("Profit of " + (sp - cp));
        } else {
            System.out.print("Loss of " + (cp - sp));

        }

        sc.close();
    }
}