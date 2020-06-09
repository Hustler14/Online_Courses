public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a)
    {
    	int n = a.length;
    	int dummy;
    	long count = 0;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<(n-i-1);j++)
    			if(a[j+1]<=a[j])
            		{
            			dummy = a[j];
            			a[j] = a[j+1];
            			a[j+1] = dummy;
            			count++;
            		}
    	}
    	return count;

    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k)
    {
    	int[] a = new int[n];
    	int temp;
    	for(int i=0;i<n;i++)
    	{
    		a[i] = i;
    	}
    	if(k>n*(n-1)/2)
    		k = n*(n-1)/2;
    	if(k==0)
    		return a;
    	else
    	{
    		for(int i=1;i<n;i++)
   		{
   			for(int j = n-1; j>i-1;j--)
    		{
    			temp = a[j];
    			a[j] = a[j-1];
    			a[j-1] = temp;
    			k = k-1;
    			if(k<=0)
    				break;
    		}
    	}
    	return (a);
    	}
   		
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args)
    {
    	int n = Integer.parseInt(args[0]);
    	int k = Integer.parseInt(args[1]);
    	int[] a = generate(n,k);
    	for(int i=0;i<n;i++)
    		System.out.print(a[i]+" ");

    }
}