
// Write a program to print positive and negative elements of an array separately .
// Sample Input → n (size of array) : 5
// Sample Input → Elements of array : 1 -23 56 -69 36
// Sample Output → Positive Elements : 1 56 36
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question_2or {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elemets of array ; ");
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        System.out.print("Positive elements are ; "+pos);
        System.out.print("\nNegetive elements are ; "+neg);



        
        
        sc.close();
    }
}