public class ActivationFunction 
{
    public static double heaviside(double x)
    {
		if(x<0)
            return 0.0;
        else if(x==0)
            return 0.5;
        else if(x>0)
        	return 1;
        else
        	return Double.NaN;
    }

    public static double sigmoid(double x)
    {
        return (double)1/(1+Math.exp(-x));
    }

    public static double tanh(double x)
    {
        if(x == Double.POSITIVE_INFINITY || x == Double.MAX_VALUE  )
        	return 1.0;
        else if(x == Double.NEGATIVE_INFINITY || x == -Double.MAX_VALUE)
        	return -1.0;
        else if(x == Double.MIN_VALUE)
        	return Double.MIN_VALUE;
         else if(x == -Double.MIN_VALUE)
         	return -Double.MIN_VALUE;
        else
        	return (double)((Math.exp(x)-Math.exp(-x))/(Math.exp(x)+Math.exp(-x)));
    }

    public static double softsign(double x)
    {
        if(x == Double.POSITIVE_INFINITY)
        	return 1.0;
        else if(x == Double.NEGATIVE_INFINITY)
        	return -1.0;
        return (double)x/(1+Math.abs(x));
    }

    public static double sqnl(double x)
    {
       	if(x<=-2)
            return -1;
        else if(-2<x && x<0)
            return x+Math.pow(x/2,2);
        else if(0<=x && x<2)
            return x-Math.pow(x/2,2);
        else if(x>=2)
            return x = 1;
        else
        	return Double.NaN;
    }

    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        System.out.println("heaviside" + "("+x+")" +"\t" + " = " + heaviside(x));
        System.out.println("sigmoid" + "("+x+")" +"\t"+ " = " + sigmoid(x));
        System.out.println("tanh" + "("+x+")" +"\t"+ " = " + tanh(x));
        System.out.println("softsign" + "("+x+")" +"\t"+ " = " + softsign(x));
        System.out.println("sqnl" + "("+x+")" +"\t"+ " = " + sqnl(x));   
    }
}