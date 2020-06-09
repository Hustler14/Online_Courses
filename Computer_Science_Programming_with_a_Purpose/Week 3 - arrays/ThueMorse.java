public class ThueMorse
{
	public static void main(String[] args)
	{
		int i,j,n;
		char[] a = {'+','-'};
		n = Integer.parseInt(args[0]);
		char[][] b = new char[n][n];
		int[] c = new int[(int)Math.pow(2,n)];
		c[0]=0;
		c[1]=1;
		for(i=2;i<=n;i++)
		{
			for(j=(int)Math.pow(2,(i-1));j<(int)Math.pow(2,i);j++)
			{
				if(c[j-(int)Math.pow(2,i-1)] == 0)
				{
					c[j] =1;
				}
				else if(c[j-(int)Math.pow(2,i-1)] == 1)
				{
					c[j] =0;
				}
			}

		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(c[i]==c[j])
					System.out.print("+  ");
				else
					System.out.print("-  ");
			}
			System.out.println();
		}
	}	
}
