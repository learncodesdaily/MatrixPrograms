package matrices;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m,n;
		
		System.out.println("Enter the row and column Size : ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] a = new int[m][n];
		int[][] b = new int[n][m];
		
		//read the matrix elements
		System.out.println("Enter the Matrix Elements : ");
		for(int i = 0;i<m;i++) 
		{
			for(int j = 0;j<n;j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}

		//below lines are to transpose a matrix
		for(int i = 0;i<n;i++) 
		{
			for(int j = 0; j<m;j++) 
			{
				b[i][j] = a[j][i];
			}
		}

		//these are to display a matrix
		System.out.println("The Transpose of the Matrix is : ");
		for(int i = 0;i<n;i++) 
		{
			for(int j = 0;j<m;j++) 
			{
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
	}
}



/*
Output : 
	
	Enter the row and column Size : 
		2 3
		Enter the Matrix Elements : 
		1 2 3
		4 5 6
		The Transpose of the Matrix is : 
		1 4 
		2 5 
		3 6 
		
*/
