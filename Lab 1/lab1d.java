package sce.sc2002.gwhm.lab1d;

import java.util.Scanner;

public class lab1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height: ");
		int h = sc.nextInt();
		
		for(int i=1; i<=h; i++) {
			char startChar = (i % 2 == 1) ? 'A' : 'B';
			
			for(int j=0; j<i; j++) {
				char current;
				
				if(j%2 == 0) current = startChar;
				else {
					if(startChar == 'A') current = 'B';
					else current = 'A';
				}
				
				System.out.print(current);
				System.out.print(current);
			}
			System.out.println(); //next line
		}
		sc.close();

	}

}
