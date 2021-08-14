package Projectparts;

import java.util.Scanner;

public class Part5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		Scanner Scan=new Scanner (System.in);
		System.out.println("Input a number");
		 num=Scan.nextInt();
		    boolean prime= false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        prime = true;
		        break;
		      }
		    }
		    if (!prime)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}








