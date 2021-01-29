package com.ishara.vauesofletters;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Any Word");

	    String inputWord = scanner.nextLine();
		
		String wordLowercase = inputWord.toLowerCase();
		
		char [] charArry = wordLowercase.toCharArray();
		
		int sumOfValues =0;
	
		for(int i =0 ; i<charArry.length;i++) {
			if(charArry[i]==32)
				break;
			
			if((charArry[i]>=97) && (charArry[i]<=122))
				sumOfValues += (charArry[i]-96);
		}
		if (sumOfValues!=0) {
			System.out.println("Value of entered letters : "+sumOfValues);
			
		} else {
			System.out.println("Enter word not contain letters");

		}		


	}

}
