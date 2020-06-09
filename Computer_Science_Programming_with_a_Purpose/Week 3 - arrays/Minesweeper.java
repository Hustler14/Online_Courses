public class Minesweeper
{
	public static void main(String[] args)
	{
		int m,n,k;
		int i,j;
		m = Integer.parseInt(args[0]);
		n = Integer.parseInt(args[1]);
		k = Integer.parseInt(args[2]);
		int count=0;
		char[][] mine = new char[m+2][n+2];
		for(i=0;i<k;i++)
		{
			int x = (int)(Math.random()*m);
			int y = (int)(Math.random()*n);
			if(mine[x+1][y+1]=='*')
				i = i-1;
			else
				mine[x+1][y+1] = '*';
		}
		for(i=1;i<m+1;i++)
		{
			for(j=1;j<n+1;j++)
			{
				if(mine[i][j]!='*')
				{
					if(mine[i+1][j]=='*'){count++;}
					if(mine[i][j+1]=='*'){count++;}
					if(mine[i-1][j]=='*'){count++;}
					if(mine[i][j-1]=='*'){count++;}
					if(mine[i+1][j+1]=='*'){count++;}
					if(mine[i-1][j+1]=='*'){count++;}
					if(mine[i-1][j-1]=='*'){count++;}
					if(mine[i+1][j-1]=='*'){count++;}
					System.out.print(count+"  ");
					count = 0;
				}
				else
				{
					System.out.print(mine[i][j]+"  ");
				}
			}
			System.out.println();
		}
	}
}