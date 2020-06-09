public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n)
    {
    	int count = 0;
    	boolean a;
    	for (int i=1; i<Math.cbrt(n);i++)
    	{
    		double x = Math.cbrt(n - Math.pow(i,3));
    		if( x == (int)x)
    			count++;
    	}
    	if(count>=4)
    		a = (1==1);
    	else
    		a = (1==2);
    	return a;

    }
    public static void main(String[] args)
    {
    	long n = Long.parseLong(args[0]);
    	System.out.println(isRamanujan(n));
    }
}