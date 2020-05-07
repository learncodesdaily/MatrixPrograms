package matrices;

import java.util.Scanner;

public class SkipAlternateElement {

	public static void main(String[] args) {
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

		//lines to print alternate elements of an matrix	
		System.out.println("Matrix Elements Skipping Alternate Elements : ");
		for(int i = 0;i<m;i++) {
			if(i % 2 == 0)
				for(int j = 0;j<n;j+=2)
					System.out.print(a[i][j]+" ");
			else
				for(int j = 1;j<n;j+=2)
					System.out.print(a[i][j]+" ");
		}
	}
}


/*
Output : 
	
	Enter the row and column Size : 
		4 3
		Enter the Matrix Elements : 
		1 2 3
		4 5 6
		7 8 9
		8 5 2
		Matrix Elements Skipping Alternate Elements : 
		1 3 5 7 9 5 
	*/	
