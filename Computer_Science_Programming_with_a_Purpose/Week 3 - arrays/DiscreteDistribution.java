public class DiscreteDistribution
{
	public static void main(String[] args)
	{
		int n = args.length;
		int[] arr = new int[n-1];
		int l = Integer.parseInt(args[0]);
		int i;
		int total = 0;
		int[] tot = new int[n];
		for(i=1;i<n;i++)
		{
			arr[i-1] = Integer.parseInt(args[i]);
			total = total + arr[i-1];
			tot[i] = total;
		}

		for(int j=0;j<l;j++)
		{
			int r = (int) ((total-1) * Math.random());
        	int event = -1;
        	for (i = 0; i <n-1; i++) 
	        {
	            if(tot[i]<= r && r<tot[i+1])
	            	{
	            		event = i+1;
	            		break;
	            	}
	        }
	        System.out.print(event + " " );
        }
       
	}
}