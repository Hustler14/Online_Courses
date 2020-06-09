public class CMYKtoRGB
{
	public static void main(String[] args)
	{

		double c, y, m, k;
		c = Double.parseDouble(args[0]); 
		m = Double.parseDouble(args[1]); 
		y = Double.parseDouble(args[2]); 
		k = Double.parseDouble(args[3]);
		double r, g, b, w;
		w = 1.0 - k;
		r = Math.round(255*w*(1-c));
		g = Math.round(255*w*(1-m));
		b = Math.round(255*w*(1-y));
		System.out.println("red = "+(int)r);
		System.out.println("green = "+(int)g);
		System.out.println("blue = "+(int)b);
	}
}
