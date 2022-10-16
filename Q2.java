import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		while(choice)
		{
			System.out.println("Please select \n1.Area of Cicle \n2.Series \n3.Table of given number");
			int num = sc.nextInt();
			
			switch(num)
			{
			case 1:
			{
				System.out.println("Please enter radius");
				float r = sc.nextFloat();
				float area = (float) (3.14*r*r);
				System.out.println("Area of cicle is "+ area);
			}
			break;
			case 2:
			{
				int n=1;
				System.out.println("Please enter the number ");
				int n2 = sc.nextInt();
				while(n<=n2)
				{
					System.out.println(n);
					n+=2;
				}
			}
			break;
			case 3:
			{
				int pro=1,a=1;
				System.out.println("Please enter the number");
				int n3=sc.nextInt();
				
				while(a<=10)
				{
					pro = n3*a;
					System.out.println(n3+" X "+a+" = "+pro);
					a++;
				}
			}
			break;
			default :
			{
				System.out.println("Invalid Choice");
				choice = false;
			}
			}
		}

	}

}
