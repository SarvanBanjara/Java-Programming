
//Write a program to check whether an alphabet is a vowel or a consonant.
import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet : ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.print(ch + " is Vowel.");
        } else {
            System.out.print(ch + " is Consonant.");

        }

        sc.close();
    }
}
