package matrices;

import java.util.Scanner;

public class FindMaxElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int m,n;

		System.out.println("Enter the row and column Size : ");
		m = sc.nextInt();
		n = sc.nextInt();

		int[][] a = new int[m][n];
		
		//initializing MAX element as INT_MIN
		int maxElem = Integer.MIN_VALUE;

		//read the matrix elements
		System.out.println("Enter the Matrix Elements : ");
		for(int i = 0;i<m;i++) 
		{
			for(int j = 0;j<n;j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		//these are to find the maximum element in an matrix
		for(int i = 0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j] > maxElem) {
					maxElem = a[i][j];
				}
			}
		}
		
		System.out.println("Maximum Element in an Matrix is : "+maxElem);
	}
}


/*
Output : 
	
	Enter the row and column Size : 
		3 4
		Enter the Matrix Elements : 
		1 2 3 4
		25 10 7 12
		12 54 13 5
		Maximum Element in an Matrix is : 54
*/
