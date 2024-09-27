package sce.sc2002.gwhm.lab1a;

import java.util.Scanner; //for scanning users entry

public class lab1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your choice (A, C, D): ");
		char ans = sc.next().charAt(0);
		
		//using switch
		switch(ans) {
			case 'A':
			case 'a':
				System.out.println("Action movie fan\n");
				break;
			case 'C':
			case 'c':
				System.out.println("Comedy movie fan\n");
				break;
			case 'D':
			case 'd':
				System.out.println("Drama movie fan\n");
				break;
			default:
				System.out.println("Invalid choice\n");
				break;
		}
		
		sc.close();
			
	}

}
