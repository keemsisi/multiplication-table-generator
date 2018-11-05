//Date created:09/03/2016
//Author: Adeshina p.k.a (Integralcalculus)
//Status: partially complete

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MultiplicationTable 

{
	public static void main(String [] args)
	{
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("\t\t\tThis program prints MultiplicationTable of your choice!");
		
		System.out.println("Enter the number of row:");
		int row =input.nextInt();
		System.out.println("Enter the number of colomn:");
		int column=input.nextInt();
		System.out.printf("%75s","MULTIPLIATION TABLE");
		System.out.println();
		
		for(int i=1 ; i<=row; i++)
		{
			
			for(int j=1; j<=column; j++)//nested loop over here
			{
				System.out.printf("%3s|_",j*i);
		
			}
			
			System.out.println();
		}
		
		
	
	} 
}
