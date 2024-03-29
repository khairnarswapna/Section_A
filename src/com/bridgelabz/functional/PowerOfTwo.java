package com.bridgelabz.functional;
import java.util.*;
public class PowerOfTwo 
{
	
	public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		PowerOfTwo powerOfTwo=new PowerOfTwo();

		do{
			System.out.println("Enter Number :");
			number = sc.nextInt();
			} while(!chkValidity(number));
			powerOfTwo.printPowerOfTwo(number);
	}
		
		public static boolean chkValidity(int number) 
		{
			if(number >=0 && number < 31)
				return true;
			else
				return false;
		}
		
		//Power of 2 table Print
		public void printPowerOfTwo(int number)
		{
			System.out.println("Power of 2^"+number+" is: "+(Math.pow(2, number)));
			System.out.println();
			System.out.println("Printing all till Power Value "+number);
			for(int i=0;i<number;i++)
			{
			System.out.println("2 ^ "+i+" = "+Math.pow(2,i));		


			}
	}

}
