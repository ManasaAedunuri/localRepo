package arrays_package;

public class ArraySum {

	public static void main(String[] args) {

		int[] arr = {13, 67, 5, 4, 8};
		int sum = 0;
		
		for (int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		 System.out.println(sum);
	}

}
