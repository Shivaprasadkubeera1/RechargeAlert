package com.pyramidion.recharge;
import java.util.Scanner;

class RechargeValidation {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Hey, are you ");
		System.out.println("\"prepaid\" or \"postpaid\" user");
		String input1 = scan.next();
		System.out.print("Kindly, ");
		System.out.println("enter the date of recharge");
		int date = scan.nextInt();
		System.out.println("enter the month of recharge");
		int month = scan.nextInt();
		System.out.println("enter the year of recharge");
		int year = scan.nextInt();

		if(input1.contains("prepaid")){
			System.out.println("Dear prepaid user, your recharge validity will get over by");
			int newMonth = ++month;
			if(newMonth>12) {
				year++;
				month = month%12;
				System.out.println(date+"-"+month+"-"+year);
			}else {
				System.out.println(date+"-"+month+"-"+year);					
			}

		}

		else if(input1.contains("postpaid")){
			if(month==1 || month==3 || month==5 || month==7 ||
					month==8 || month==10 || month==12) {
				System.out.println("Dear postpaid user, your recharge validity will get over by");
				System.out.println("31"+"-"+month+"-"+year);
			}
			if(month==4 || month==6 || month==9 || month==11) {
				System.out.println("Dear postpaid user, your recharge validity will get over by");
				System.out.println("30"+"-"+month+"-"+year);
			}
			if(month==2) {

				boolean leap = false;

				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0)
							leap = true;
						else
							leap = false;
					}
					else
						leap = true;
				}
				else
					leap = false;

				if (leap) {
					System.out.println("Dear postpaid user, your recharge validity will get over by");
					System.out.println("29"+"-"+month+"-"+year);
				}
				else {
					System.out.println("Dear postpaid user, your recharge validity will get over by");
					System.out.println("28"+"-"+month+"-"+year);
				}
			}

		}else {
			System.out.println("Sorry, Invalid input");
		}
	}
}
