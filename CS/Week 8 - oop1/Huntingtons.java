public class Huntingtons {

    public static int maxRepeats(String dna)
    {
    	int count =0;
    	int lastIndex =0;
    	int r;
    	int max =0;
    	while (lastIndex != -1) 
    	{
    		lastIndex = dna.indexOf("CAG", lastIndex);
    		if (lastIndex != -1) 
    		{
    			count++;
    			lastIndex += "CAG".length();
    			r = dna.indexOf("CAG", lastIndex);
    			if(r != lastIndex)
    				{
    					max = Math.max(max,count);
    					count = 0;
    				}

    		}
    	}
    	return max;
    }
    public static String removeWhitespace(String s)
    {
    	String o = s.replaceAll(" ", "");
    	o = o.replaceAll("\n", "");
    	o = o.replaceAll("\t", "");
    	return o;
    }
    public static String diagnose(int maxRepeats)
    {
    	if(maxRepeats<=9 || maxRepeats>=181 )
    		return "not human";
    	else if(maxRepeats>=10 && maxRepeats<=35)
    		return "normal";
    	else if(maxRepeats>=36 && maxRepeats<=39)
    		return "high risk";
    	else
    		return "Huntington's";
    }

    // Sample client (see below).
    public static void main(String[] args)
    {
    	String input="";
    	while(!StdIn.isEmpty())
    		input = input+StdIn.readString();
    	String inputwsr = removeWhitespace(input);
    	int n = maxRepeats(inputwsr);
    	String output = diagnose(n);
    	System.out.println("max repeats = "+n);
    	System.out.println(output);
    }

}
