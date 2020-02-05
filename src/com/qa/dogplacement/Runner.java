package com.qa.dogplacement;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Enter the place :");
		int place = DoggoCompetition.DoggoCompetition();
		while (i <= 100) {
			if (i == place) {
				i += 1;
				
			
			}
			if(i>=11&&i<=20) {
				System.out.println(Integer.toString(i)+"th");
			}
		
			else if(Integer.toString(i).endsWith("1")) {
				System.out.println(Integer.toString(i)+"st");
			}else if(Integer.toString(i).endsWith("2")) {
				System.out.println(Integer.toString(i)+"nd");
			}else if(Integer.toString(i).endsWith("3")) {
				System.out.println(Integer.toString(i)+"rd");
			}else {
				System.out.println(Integer.toString(i)+"th");
			}
				i=i+1;
			}
		}
		
	}


