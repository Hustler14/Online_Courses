public class Birthday
{
	public static void main(String[] args)
	{
		int n , trials;
		n = Integer.parseInt(args[0]);
		trials = Integer.parseInt(args[1]);
		double t = (double)trials;
		int i;
		int[] count = new int[365];
		double[] prob = new double[365];
		for(i=0;i<trials;i++)
		{
			boolean[] birthdaymatrix = new boolean[n];
			int j = 0;
			while(j>=0)
			{
				if(j==0)
				{
					double r = Math.random()*n;
					int b = (int)r;
					birthdaymatrix[b] = (1==1);
					j++;
				}
				else
				{
					double r = Math.random()*n;
					int b = (int)r;
					if(birthdaymatrix[b])
					{
						count[j]++;
						j=0;
						break;
					}
					else
					{
						birthdaymatrix[b] = (1==1);
						j++;
					}
					
				}

			}
		}
		double pr = 0;
		for(i=1;i<365;i++)
		{
			prob[i] = count[i]/t;
			prob[i]=prob[i]+prob[i-1];
		}
		for(i=0;i<365 && pr<0.5;i++)
		{
			int g = i+1;
			System.out.println(g+"\t" +count[i]+'\t'+prob[i]);
			pr = prob[i];
		}

	}
}