//Write a program to accept the height of a person in centimeter and categorize the person
// according to their height if below 150 he is dwarf if above 150 and below 200 average and
// above 200 tall

import java.util.Scanner;
public class Question_21{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Height : ");
        int height = sc.nextInt();
        if(height<=150){
            System.out.print("Dwarf");
        }
        else if( height <= 200){
                        System.out.print("Average");

        }
        else{
            System.out.print("Tall");
        }
        
        sc.close();
    }
}