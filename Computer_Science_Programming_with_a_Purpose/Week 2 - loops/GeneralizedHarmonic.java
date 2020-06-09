public class GeneralizedHarmonic
{
	public static void main(String[] args)
	{
		int n,r,i;
		double sum=0;
		n = Integer.parseInt(args[0]);
		r = Integer.parseInt(args[1]);
		for(i=1;i<=n;i++)
		{
			sum=sum+(1.0/Math.pow(i,r));
		}
		System.out.println(sum);

	}
}