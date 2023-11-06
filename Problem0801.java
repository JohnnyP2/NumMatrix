import java.util.Scanner;

// Johnny Pedicone


public class Problem0801 {

	
	public static void main(String[] args) 
	{
		System.out.println("Enter a 3-by-4 matrix of numbers!");
		Scanner key = new Scanner(System.in);

		double[][] matrix = new double[3][4]; //Asks the user to enter numbers for the matrix
		for(int row = 0; row < 3; row++) 
		{
			for(int col = 0; col < 4;col++) 
			{
				matrix[row][col] = key.nextDouble();
			}
			
		}
		
		for(int row = 0; row < 3; row++) //Prints out the matrix
		{
			for(int col = 0; col < 4;col++) 
			{
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println(" ");
		}
		
		for(int i = 0; i < 3; i++) 
		{ //Calls the function and then prints out the results
			double sum = sumColumn(matrix, i);
			System.out.println("The sum of row number " + (i+1) +" is: " + sum);
		}
		

	}
	public static double sumColumn(double[][] m, int columnIndex) 
	{
		double[] sum = new double[3];  
				for(int row = 0; row < 3; row++) //gets the sum of the matrix and then give it to the sum array
				{
					for(int col = 0; col < 4;col++) 
					{
						sum[row] += m[row][col];
					}
					
				}
		return sum[columnIndex]; //Returns the sum array
		
	}
}
