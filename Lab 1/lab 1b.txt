package sce.sc2002.gwhm.lab1b;

import java.util.Scanner;

public class lab1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("Enter your merit points: ");
		int merit = sc.nextInt();
		
		if(800<=salary && salary<=899) {
			System.out.println("Grade A");
		}
		else if(700<=salary && salary<799) {
			if(merit<20) System.out.println("Grade B");
			else System.out.println("Grade A");
		}
		else if(649<=salary && salary<=699) {
			System.out.println("Grade B");
		}
		
		else if(600<=salary && salary<649) {
			if(merit<10) System.out.println("Grade C");
			else System.out.println("Grade B");
		}
		else if(500<=salary && salary<=599) {
			System.out.println("Grade C");
		}
		
	}

}
