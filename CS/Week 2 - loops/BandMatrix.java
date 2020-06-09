public class BandMatrix
{
	public static void main(String[] args)
	{
		int n, w;
		int i, j;
		n = Integer.parseInt(args[0]);
		w = Integer.parseInt(args[1]);
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i == j)
				{
					System.out.print("*  ");
				}
				else if(j <= i+w && i <= j+w)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("0  ");
				}
			}
			System.out.println();
		}
	}
}