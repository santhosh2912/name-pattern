import java.util.*;
class  P6
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(10);
				if (i==0||i==n-1||i==n/2||i+j==n/n||i+j==n+2)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
				for (int j=0;j<n ;j++ )
			{
				Thread.sleep(100);
				if (i==0||j==0||j==n-1||i==n/2)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(100);
				if (j==0||j==n-1||i==j)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				  
			}
			System.out.print("  ");
			for (int j=0;j<n;j++ )
			{
				Thread.sleep(100);
				if (i==0||j==n/2)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(100);
				if (j==0||j==n-1||i==n/2)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(100);
				if (j==0||j==n-1||i==0||i==n-1)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(100);
				if (i==0||i==n-1||i==n/2||i+j==n/n||i+j==n+2)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.print("  ");
			for (int j=0;j<n;j++ )
			{
				Thread.sleep(100);
				if (j==0||j==n-1||i==n/2)
				{
					System.out.print("* ");
				}
				else
				{ 
					System.out.print("  ");
				}
				
			}
			System.out.println(  );
			
		
	}
	
   }
}