package matrices;

import java.util.Scanner;

public class SumOfBoundaryElements {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int m,n;

		System.out.println("Enter the row and column Size : ");
		m = sc.nextInt();
		n = sc.nextInt();

		int[][] a = new int[m][n];
		

		//read the matrix elements
		System.out.println("Enter the Matrix Elements : ");
		for(int i = 0;i<m;i++) 
		{
			for(int j = 0;j<n;j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		//finding sum of boundary elements
		long sum = 0;
		System.out.println("Boundary Elements of an Matrix : ");
		for(int i = 0;i<m;i++)
		{
			for(int j = 0;j<n;j++)
			{
				if(i == 0) {
					System.out.print(a[i][j]+" ");
					sum += a[i][j];
				}
				else if(i == m-1) {
					System.out.print(a[i][j]+" ");
					sum += a[i][j];
				}
				else if(j == 0) {
					System.out.print(a[i][j]+" ");
					sum += a[i][j];
				}
				else if(j == n-1) {
					System.out.print(a[i][j]+" ");
					sum += a[i][j];
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("Sum of Boundary Element in a Matrix : "+sum);
	}
}

/*
Output :
	
	Enter the row and column Size : 
		4 4
		Enter the Matrix Elements : 
		1 2 3 4
		5 6 7 8
		9 8 7 6
		5 4 3 2
		Boundary Elements of an Matrix : 
		1 2 3 4 
		5     8 
		9     6 
		5 4 3 2 
		Sum of Boundary Element in a Matrix : 52
		
	*/	
