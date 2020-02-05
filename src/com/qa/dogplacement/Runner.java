package com.qa.dogplacement;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int i=0;
	
System.out.println("Enter the place :");
int place = DoggoCompetition.DoggoCompetition();
 while ( i<100) {
	 i++;
	 System.out.println(i);
 }
 if(i==place) {
	 i++;
 }
	}

}
