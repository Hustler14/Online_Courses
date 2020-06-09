public class TrinomialDP 
{
	public static long trinomial(int n, int k)
    {
    	long[][] t = new long[n+1][n+1];
    	if(Math.abs(k)>n)
    		return 0;
    	else
    	{
			t[0][0]= 1;
			k = Math.abs(k);
			for (int i = 0; i <= n; i++)
			{
				for(int j = 0; j <=Math.max(n,k); j++)
				{
					if(Math.abs(j)>i)
						t[i][Math.abs(j)] =0;
					else if(j == i)
						t[i][Math.abs(j)] = 1;
					else
						t[i][Math.abs(j)] = t[i-1][Math.abs(j-1)]+t[i-1][Math.abs(j)]+t[i-1][Math.abs(j+1)];
				}
			}
			return t[n][k];
    	}
		
    }
	public static void main(String[] args) 
	{
		long a;
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		a = trinomial(n,k);
		System.out.println(a);
	}
}