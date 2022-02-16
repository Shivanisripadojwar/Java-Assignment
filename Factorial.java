package main;

import java.util.Scanner;

public class Factorial {
	    public static void main(String [] args){
	        int i,n, fact=1;
	        System.out.println("Enter number:");
	        Scanner in= new Scanner(System.in);
	        n = in.nextInt();
	        for(i=1;i<=n;i++){
	            fact = fact * i;
	        }
	System.out.println("Factorial of given number:"+ fact);
	    }
	}
