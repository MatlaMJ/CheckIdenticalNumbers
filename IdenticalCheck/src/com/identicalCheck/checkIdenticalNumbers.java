package com.identicalCheck;

import java.util.Scanner;

public class checkIdenticalNumbers {
static int i =0;

	public static void main(String[] args) {
	
		//Using scanner to get user input and store them in an array
		
		/*System.out.println("Please insert a number value: ");
		Scanner input = new Scanner(System.in);
		double dbl = input.nextDouble();
		
		
		//Create a an array and convert double into a string to be able to parse into the int
		
		String[] stringArray = String.valueOf(dbl).split(".\\");
		
		
		int[] intArray = new int[2];
		
		intArray[0] =Integer.parseInt(null)
		intArray[1]**/
		
		
		
		/*Scanner input = new Scanner(System.in);
	    int[] array = new int[2];
	    int[] arrayCopy = new int[1000];

	    int k=0,j=0;

	    System.out.println("enter your integer numbers");
	    while(input.hasNext())
	    {
	        array[i] = input.nextInt();


	        for(j =0 ; j< array.length; j++)
	        {
	            arrayCopy[j] = array[j];

	        }


	        for( k =1; k<arrayCopy.length; k++)
	        {
	            int aV = arrayCopy[k];

	        }
	        i++;

	    }

	    input.close();
	    }
				
		**/
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter your first double number : ");
		Double firstNum =sc.nextDouble();
		
		System.out.println("Please enter your secong double number : ");
		Double secNum =sc.nextDouble();
		
		
		if(firstNum.equals(secNum)) {
			
			System.out.println("The first Number is : " + firstNum + ' '+"The second number is :  " + secNum);
			System.out.println("The inputs are identical");
			
		} else {
			
			System.out.print("The numbers are not identical");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
