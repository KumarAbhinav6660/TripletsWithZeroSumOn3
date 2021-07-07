import java.util.Scanner;

class Triplet
{
	public void findTriplets(int ar[] , int x)
	{
		int cnt=0;
		for(int i=0 ; i<x-2 ; i++)
		{
			for(int j=i+1 ; j<x-1 ; j++)
			{
				for(int k=j+1 ; k<x ; k++)
				{
					if((ar[i]+ar[j]+ar[k])==0) {
						System.out.println("Triplet is found.");
						cnt++;
						break;
					}	
				}
			}
		}
		if(cnt == 0)
			System.out.println("Oops! Triplet is not found.");
	}
}

public class Triplets_with_zero_sum_On3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int [n];
			for(int i=0 ; i<n ; i++) {
				a[i] = sc.nextInt();
			}
			Triplet g = new Triplet();
			g.findTriplets(a,n);

				
		}

	}

}