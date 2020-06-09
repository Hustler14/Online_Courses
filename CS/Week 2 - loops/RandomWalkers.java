public class RandomWalkers
{
	public static void main(String[] args)
	{
		int r, l, steps, trials;
		double avg =0;
		long sum =0;
		trials = Integer.parseInt(args[1]);
		double q = trials;
		l = Integer.parseInt(args[0]);
		while(trials>0)
		{
			r = 0;
			int x =0;
			int y =0;
			steps = 0;
			while(r!=l)
			{
				double m = Math.random();
				if(m<=0.25)
				{
					x = x+1;
				}
				else if(m<=0.5)
				{
					y = y+1;
				}
				else if(m<=0.75)
				{
					x = x-1;				}
				else
				{
					y = y-1;
				}
				r = Math.abs(x)+Math.abs(y);
				steps = steps+1;
			}
			trials--;
			sum = sum+steps;
		}
		avg = sum/ (q);
		System.out.println("average number of steps = " + avg);

	}
}
