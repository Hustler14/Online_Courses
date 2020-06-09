public class AudioCollage {
    public static double[] amplify(double[] a, double alpha)
    {
        double[] n = new double[a.length];
        for(int i=0; i<a.length; i++)
        {
            n[i] = a[i] * alpha;
        }
        return n;
    }

    public static double[] reverse(double[] a)
    {
        double[] n = new double[a.length];

        int l = a.length;
        for (int i = l-1; i >= 0; i--) 
        {
            n[l-i-1] = a[i];
        }

        return n;
    }
    
    public static double[] merge(double[] a, double[] b)
    {
        int l = a.length + b.length;
        double[] n = new double[l];

        for(int i=0; i<l; i++){
            if(i < a.length){
                n[i] = a[i];
            }
            else{
                n[i] = b[b.length+i-l];
            }
        }
        return n;

    }

    public static double[] mix(double[] a, double[] b)
    {
        int l = a.length > b.length? a.length:b.length;
        double[] x = new double[l];
        double[] y = new double[l];
        for(int i=0; i<a.length; i++)
        {
            x[i] = a[i];
        }
        for(int i=0; i<b.length; i++)
        {
            y[i] = b[i];
        }
        double[] n = new double[l];
        for(int i=0; i<l; i++)
        {
            n[i] = x[i] + y[i];
        }
        return n;
    }

    public static double[] changeSpeed(double[] a, double alpha)
    {
        int l = a.length;
        int m = (int)Math.floor(l/alpha);
        double[] n = new double[m];
        for(int i=0; i<m; i++)
        {
            int k = (int)Math.floor(i*alpha);
            n[i] = a[k];
        }

        return n;
    }
    public static void main(String[] args)
    {
        double[] c = new double[441000];
        double[] b = new double[441000];
        double[] a = new double[441000];
        double[] d = new double[441000];
        double[] e = new double[441000];
        b = StdAudio.read("silence.wav");
        a = StdAudio.read("singer.wav");
        c = StdAudio.read("chimes.wav");
        d = StdAudio.read("beatbox.wav");
        e = StdAudio.read("piano.wav");
        double alpha = 2;
        StdAudio.play(amplify(a, alpha));
        StdAudio.play(reverse((b)));
        StdAudio.play(merge(c, d));
        StdAudio.play(mix(c, d));
        StdAudio.play(changeSpeed(e, alpha));
    }
}