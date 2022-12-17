package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int KM,age,typeOftrip;
		double NormalAmount,AgeDiscount,AgeDiscountRate,DiscountedAmount,RoundTripTicketDiscount,TotalAmount;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers: ");
		KM = Math.abs(scan.nextInt());
		
		System.out.print("Enter your age: ");
		age = Math.abs(scan.nextInt());
		
		System.out.print("Choose the type of trip"+"(1 => One Direction , 2 => Round Trip): ");
		typeOftrip = scan.nextInt();
		
		if(age<12) {
			AgeDiscountRate=0.50;
		}else if (age>12 && age<24) {
			AgeDiscountRate=0.10;
		}else if (age>65) {
			AgeDiscountRate=0.30;
		}else {
			AgeDiscountRate=0;
		}
		
		NormalAmount = KM * 0.10;
		AgeDiscount = NormalAmount * AgeDiscountRate;
		DiscountedAmount = NormalAmount - AgeDiscount;
		RoundTripTicketDiscount = DiscountedAmount * 0.20;
		TotalAmount = (DiscountedAmount-RoundTripTicketDiscount)* 2;
		
		if(typeOftrip==1) {
			
			if(age<12) {
				
				System.out.println("Total Amount: "+(DiscountedAmount)+" TL");
				
			}else if (age>12 && age<24) {
				
				System.out.println("Total Amount: "+(DiscountedAmount)+" TL");
				
			}else if (age>65) {
				
				System.out.println("Total Amount: "+(DiscountedAmount)+" TL");
				
			}else {
				
				System.out.println("Total Amount: "+NormalAmount+" TL");
				
			}
			
		}else if(typeOftrip==2) {
			
			if(age<12) {
				
				System.out.println("Total Amount: "+(TotalAmount)+" TL");
				
			}else if (age>12 && age<24) {
				
				System.out.println("Total Amount: "+(TotalAmount)+" TL");
				
			}else if (age>65) {
				
				System.out.println("Total Amount: "+(TotalAmount)+" TL");
				
			}else {
				
				System.out.println("Total Amount: "+(TotalAmount)+" TL");
				
			}
		}else {
			
			System.out.println("Entered Wrong, Please Try Again!");
			
		}
	}

}
