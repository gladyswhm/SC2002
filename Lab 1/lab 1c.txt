package sce.sc2002.gwhm.lab1c;

import java.util.Scanner;

public class lab1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double CONVERSION_RATE = 1.82; //given in question
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the starting value in S$: ");
		int startvalue = sc.nextInt();
		
		System.out.print("Enter the ending value in S$: ");
		int endvalue = sc.nextInt();
		
		System.out.print("Enter the increment value: ");
		int incre = sc.nextInt();
		
		//1. using a for loop
        System.out.println("\nCurrency Conversion Table");
        System.out.println("---------------------------\n");
        System.out.printf("%-15s%-15s%n", "US$ Value", "S$ Value");
        for(int i = startvalue; i <= endvalue; i+= incre) {
        	double convalue = i*CONVERSION_RATE;
        	System.out.printf("%-15d%-15.2f%n",i,convalue);
        }
        
        //2. Using a while loop
        System.out.println("\nCurrency Conversion Table (While Loop):");
        System.out.println("-------------------------------");
        System.out.printf("%-15s%-15s%n", "US$ Value", "S$ Value");
        int j = startvalue;
        while (j <= endvalue) {
            double convalue = j * CONVERSION_RATE;
            System.out.printf("%-15d%-15.2f%n", j, convalue);
            j += incre;
        }
        
        //3. Using a do/while loop
        System.out.println("\nCurrency Conversion Table (Do/While Loop):");
        System.out.println("-------------------------------");
        System.out.printf("%-15s%-15s%n", "US$ Value", "S$ Value");
        int k = startvalue;
        do {
            double convalue = k * CONVERSION_RATE;
            System.out.printf("%-15d%-15.2f%n", k, convalue);
            k += incre;
        } while (k <= endvalue);
        sc.close();
	}

}
