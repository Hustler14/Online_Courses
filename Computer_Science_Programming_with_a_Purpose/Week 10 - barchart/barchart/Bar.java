import java.util.Arrays;
public class Bar implements Comparable<Bar> 
{
    private final String n;
    private final int v;
    private final String c;
    // Creates a new bar.
    public Bar(String name, int value, String category)
    {
        if (name == null) 
            throw new IllegalArgumentException("Name Unavailable");
        if (value < 0) 
            throw new IllegalArgumentException("Value Incorrect");
        if (category == null) 
            throw new IllegalArgumentException("Category Unavailable");

        n = name;
        v = value;
        c = category;
    }
    public String getName()
    {
        return n;
    }

    public int getValue()
    {
        return v;
    }
    public String getCategory()
    {
        return c;
    }

    public int compareTo(Bar that)
    {
        Bar a = this;
        return Integer.compare(a.v,that.v);
    }

    public static void main(String[] args)
    {
        Bar[] bars = new Bar[10];
        bars[0] = new Bar("Beijing", 22674, "East Asia");
        bars[1] = new Bar("Cairo", 19850, "Middle East");
        bars[2] = new Bar("Delhi", 27890, "South Asia");
        bars[3] = new Bar("Dhaka", 19633, "South Asia");
        bars[4] = new Bar("Mexico City", 21520, "Latin America");
        bars[5] = new Bar("Mumbai", 22120, "South Asia");
        bars[6] = new Bar("Osaka", 20409, "East Asia");
        bars[7] = new Bar("São Paulo", 21698, "Latin America");
        bars[8] = new Bar("Shanghai", 25779, "East Asia");
        bars[9] = new Bar("Tokyo", 38194, "East Asia");

        Arrays.sort(bars);

        for (int i = 0; i < bars.length; i++) 
        {
            StdOut.print(bars[i].getName() + " - " + bars[i].getValue());
            StdOut.println();
        }
    }

}