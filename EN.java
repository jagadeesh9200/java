package my;

public class EN {

	public static void main(String[] args) 
	{
		int n=1000;
		System.out.println("Print even numbers b/w 1 to " +n);
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(++i);
				
			}
		}
		

	}

}
