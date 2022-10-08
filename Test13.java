import java.util.Scanner;
class Test13
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
        System.out.print("enter value in n");
		n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			 System.out.print("\n");
		}
	}
}