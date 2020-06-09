public class Clock {
    private int hours;
    private int minutes;

    public Clock(int h, int m)
    {
        if (h<0 || h>23 || m<0 || m>59)
            throw new IllegalArgumentException("arguments not valid");
        hours = h;
        minutes = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s)
    {
        hours = Integer.parseInt(s.substring(0,1));
        minutes = Integer.parseInt(s.substring(3,4));
    }

    public String toString()
    {
        String hou="";
        String minu="";
        if(hours<10)
            hou = "0"+hours;
        else
            hou = ""+hours;
        if(minutes<10)
            minu = "0"+minutes;
        else
            minu = ""+minutes;
        return hou+":"+minu;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that)
    {
        if(that == null)
            throw new IllegalArgumentException("Object not present");
        Clock a = this;
        return (that.hours>a.hours || (that.hours==a.hours && that.minutes>a.minutes));
    }
    public void tic()
    {
        if((minutes+1) < 60)
            minutes += 1;
        else
        { 
            minutes = (minutes+1)-60;
            hours++;
        }
        if(minutes>59)
        {
            hours = hours + minutes/60;
            minutes = minutes%60;
        }
        if((hours>23))
            hours = hours%24;
    }
    public void toc(int delta)
    {
        if((minutes+delta) < 60) 
            minutes = minutes+delta;
        else
        { 
            minutes = (minutes+delta)-60;
            hours++;
        }
        if(minutes>59)
        {
            hours = hours + minutes/60;
            minutes = minutes%60;
        }
        if((hours>23))
            hours = hours%24;
    }

    // Test client (see below).
    public static void main(String[] args)
    {
        int ho = 24;
        int mi = 00;
        Clock that = new Clock(ho,mi);
        String out= that.toString();
        System.out.println(out);
        Clock p = new Clock(out);
        p.tic();
        p.toc(5);
        Clock b = new Clock(7,1);
        boolean out1 = b.isEarlierThan(that);
    }
}
