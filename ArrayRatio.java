package arrays_package;

public class ArrayRatio {

	public static void main(String[] args) {

		int[] arr = {-4, 3, -9, 0, 4, 1};
		int len = arr.length;
		int pcount=0, ncount=0, zcount=0;
		
		for(int i=0; i<len; i++)
		{
			if (arr[i] > 0)
			{
				pcount++;
			}
			else if (arr[i] < 0)
			{
				ncount++;
			}
			else
			{
				zcount++;
			}
		}
		
		double pratio = (double)pcount / len;
		System.out.println(String.format("%,.6f", pratio));
		
		double nratio = (double)ncount / len;
		System.out.println(String.format("%,.6f", nratio));
		
		double zratio = (double)zcount / len;
		System.out.println(String.format("%,.6f", zratio));
		
	}

}
