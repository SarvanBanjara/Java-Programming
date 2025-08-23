//Write a  program to check whether a given number is a 'Harshad' number or not. 
//[ Explanation : Harshad number is a number which is completely divisible by sum of its digits ]                                              

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt(), copy = n, sum = 0;
        while (copy > 0) {
            sum += (copy % 10);
            copy /= 10;
        }
        if (n % sum == 0){
            System.out.print("Harshad Number");
        } else {
            System.out.print("Not Harshad Number");

        }

        sc.close();
    }
}
