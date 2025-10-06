package arrays_package;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rows = 3, cols = 3;
		int[][] arr = new int[rows][cols];
		
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
