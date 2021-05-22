package cis.vmi.edu;

import java.util.Scanner;

public class vowelConsonantCount {

	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String toCountString=input.nextLine();
		
		toCountString=toCountString.toUpperCase();
		
		int countV=0;
		int countC=0;
		
		int length=toCountString.length();
		for(int i=0; i<length ; i++) {
			
			char chCount=toCountString.charAt(i);
			
			if(chCount=='A'||chCount=='E'||chCount=='I'||chCount=='O'||chCount=='U') {
				
				countV++;
			}
			else if(chCount!=' ') {
				countC++;
			}
		}
		
		System.out.println("The count of V is "+countV);
		System.out.println("The count of C is "+countC);
		
		
	}
}
