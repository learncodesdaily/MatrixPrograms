package matrices;

import java.util.Scanner;

public class SwapUpperToLowerDiadonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m,n;

		System.out.println("Enter the row and column Size : ");
		n = sc.nextInt();

		int[][] a = new int[n][n];


		//read the matrix elements
		System.out.println("Enter the Matrix Elements : ");
		for(int i = 0;i<n;i++) 
		{
			for(int j = 0;j<n;j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}

		//swap the elements in the matrix
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		//printing the matrix elements
		System.out.println("Elements of Matrix After Swaping Diagonally : ");
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*
Output : 

	Enter the row and column Size : 
		4
		Enter the Matrix Elements : 
		1 2 3 4
		5 6 7 8
		9 8 7 4
		6 5 3 2
		Elements of Matrix After Swaping Diagonally : 
		1 5 9 6 
		2 6 8 5 
		3 7 7 3 
 */		

