public class RevesPuzzle
{
	public static void repeat(int n, char from_rod, char mid1, char mid2,  char to_rod)
	{
		if(n==1)
			{
			System.out.println("Move disk 1 from " +  from_rod + " to " + to_rod); 
            return;
			}
		else if(n==2)
			{
			repeat(n-1,from_rod,to_rod,mid1,mid2);
			System.out.println("Move disk " + n + " from " +  from_rod + " to " + to_rod); 
			repeat(n-1,mid2,mid1,from_rod,to_rod);
            return;
			}
			if(n%2==0)
			{
				repeat(n/2,from_rod,mid2,to_rod,mid1);
				repeat(n/2-1,from_rod,to_rod,mid1,mid2);
				System.out.println("Move disk " + (int)(n) + " from " +  from_rod + " to " + to_rod);
				repeat(n/2-1,mid2,mid1,from_rod,to_rod);
				repeat(n/2,mid1,from_rod,mid2,to_rod);								
			}
			else
			{
				repeat((n-1)/2,from_rod,mid2,to_rod,mid1);
				repeat((n-1)/2,from_rod,to_rod,mid1,mid2);
				System.out.println("Move disk " + (int)(n) + " from " +  from_rod + " to " + to_rod);
				repeat((n-1)/2,mid2,mid1,from_rod,to_rod);
				repeat((n-1)/2,mid1,from_rod,mid2,to_rod);
			}
		
	}
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		repeat(n,'A','B','C','D');
	}
}