public class RandomWalker
{
	public static void main(String[] args)
	{
		int r, l, steps;
		r = 0;
		steps = 0;
		int x =0;
		int y =0;
		l = Integer.parseInt(args[0]);
		System.out.println("("+x+","+y+")");
		while(r!=l)
		{
			double m = Math.random();
			if(m<=0.25)
			{
				x = x+1;
				System.out.println("("+x+","+y+")");
			}
			else if(m<=0.5)
			{
				y = y+1;
				System.out.println("("+x+","+y+")");
			}
			else if(m<=0.75)
			{
				x = x-1;
				System.out.println("("+x+","+y+")");
			}
			else
			{
				y = y-1;
				System.out.println("("+x+","+y+")");
			}
			r = Math.abs(x)+Math.abs(y);
			steps = steps+1;
		}
		System.out.println("steps = "+steps);
	}
}
