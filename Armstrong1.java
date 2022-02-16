package main;
import java.util.Scanner;
public class Armstrong1 {
    public static void main(String[] args) {
        int num, temp, sum=0, r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = scan.nextInt();
        temp = num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum + (r*r*r);
            temp = temp/10;
        }

        if(num==sum)
            System.out.println("\nArmstrong Number.");
        else
            System.out.println("\nNot an Armstrong Number.");
    }

}