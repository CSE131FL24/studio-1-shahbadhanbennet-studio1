package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		System.out.print("What is the first of the two integers to be averaged?");
		int n1 = in.nextInt();
		System.out.print("What is the second of the two integers to be averaged?");
		int n2 = in.nextInt();
		double averageInt = (double)(n1+n2)/2;
		System.out.print("The average of "+ n1+" and "+n2+" is "+averageInt);


	}

}
