public class RightTriangle
{
	public static void main(String[] args)
	{
		int a, b, c, t;
		int a1, b1, c1;
		boolean isoutput;
		a1 = Integer.parseInt(args[0]);
		b1 = Integer.parseInt(args[1]);
		c1 = Integer.parseInt(args[2]);
		t = Math.max(a1,b1);
		a = Math.min(a1,b1);
		c = Math.max(t, c1);
		b = Math.min(t, c1);
		isoutput = (a >=0);
		isoutput = (isoutput && (b >=0));
		isoutput = (isoutput && (c >=0));
		isoutput = (isoutput && (a*a + b*b == c*c));
		System.out.println(isoutput);
	}
}