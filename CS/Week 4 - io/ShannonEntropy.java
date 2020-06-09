public class ShannonEntropy
{
	public static void main(String[] args)
	{
		int m = Integer.parseInt(args[0]);
		int count = 0;
		int[] arr = new int[m];
		while(!StdIn.isEmpty())
		{
			int r = StdIn.readInt();
			arr[r-1]++;
			count++;
		}
		float sh = 0;
		for(int i=0;i<m;i++)
		{
			float p = (float)arr[i]/count;
			if(p!=0) {float s = (p*(float)Math.log(p))/(float)Math.log(2); sh = sh-s;}
		}
		System.out.format("%.4f", sh);
	}
}