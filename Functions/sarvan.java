package Functions;

import java.util.Scanner;

public class sarvan {

    public static int add(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the two no : ");
        int a =sc.nextInt(),b=sc.nextInt();
        int result =add(a,b); 
        System.out.printf("The sum of %d and %d is %d",a,b,result);
        sc.close();

    }

}
