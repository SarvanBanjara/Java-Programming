//Write a program  to find the sum of the series 1 +11 + 111 + 1111 + .. n terms
import java.util.Scanner;
public class Question_13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int series=0,sum=0;;
        for(int i =1;i<=n;i++){
            series = ((series*10)+1);
            System.out.printf("%d + ",series);
            sum+=series;


        }
        System.out.printf("= %d",sum);
        
        
        sc.close();
    }
}
