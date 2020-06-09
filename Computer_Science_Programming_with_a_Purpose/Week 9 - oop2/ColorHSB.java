public class ColorHSB 
{
    private final int hu;
    private final int sa;
    private final int br;

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b)
    {
        if (h<0 || h>359 || s<0 || s>100 || b<0 || b>100)
        {
            h = -50000; 
            s = -50000; 
            b -= -50000;
            throw new IllegalArgumentException("arguments not valid");
        }
    
        hu = h;
        sa = s;
        br = b;
    }
    public String toString()
    {
        return ("(" + hu + ", " + sa + ", " + br+ ")");
    }

    // Is this color a shade of gray?
    public boolean isGrayscale()
    {
        if(sa == 0 || br == 0)
            return (1==1);
        else
            return(1==2);
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that)
    {
        if(that == null)
            throw new IllegalArgumentException("Object not present");
        ColorHSB h1 = this;
        return (int)Math.min((int)Math.pow((h1.hu-that.hu),2), Math.pow((360 - (int)(Math.abs(h1.hu-that.hu))),2)) + (int)Math.pow((h1.sa-that.sa),2) + (int)Math.pow((h1.br-that.br),2);
    }

    // Sample client (see below).
    public static void main(String[] args)
    {
       int h = Integer.parseInt(args[0]);
       int s = Integer.parseInt(args[1]);
       int b = Integer.parseInt(args[2]);
       ColorHSB a = new ColorHSB(h,s,b);

        int mini = 0;
        int maxi = 149600;
        String c = "";
        String cData = "";
        String cNearData = "";

        while(!StdIn.isEmpty())
        {
            String color = StdIn.readString();
            int h2 = StdIn.readInt();
            int s2 = StdIn.readInt();
            int b2 = StdIn.readInt();

            ColorHSB that = new ColorHSB(h2,s2,b2);
            mini = a.distanceSquaredTo(that);
            cData = that.toString();

            if (mini<maxi)
            {
                maxi = mini;
                c = color;
                cNearData = cData;

            }
        }
        System.out.println(c+ " " + cNearData);

    }

}