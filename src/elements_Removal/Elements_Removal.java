package elements_Removal;

import java.util.Arrays;
import java.util.Scanner;

/*
	Given an integer array A of size N. You can remove any element from the array in one operation.
	
	The cost of this operation is the sum of all elements in the array present before this operation.
	
	Find the minimum cost to remove all elements from the array.

	Input 1:
						1st => 2+1 =3
      						2nd => 1+0 =1 (total 4)
	A = [2, 1]
	
	Input 2:
	
	A = [5]

	Output 1:
	
	4
	
	Output 2:
	5
 */
public class Elements_Removal {

	private static void element_removal(int[] array,int sum) {
		
		Arrays.sort(array);
		int answer=0;
		for(int i=array.length-1;i>=0;i--)		// Always pick largest element to minimize the cost
		{			
			answer+=sum;		
			sum-=array[i];				// We subtract the added element from the total sum
		}
		System.out.println(answer);		
	}
	
	public static void main(String[] args) {	
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
			sum+=array[i];					// Total Sum of the array
		}
		element_removal(array,sum);
	}
}
