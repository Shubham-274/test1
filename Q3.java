import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fact = 1,a=1;
		System.out.println("Please enter number");
		int num = sc.nextInt();
		
		while(a<=num)
		{
			//System.out.print(a);
			fact = fact*a;
			a++;
		}
		System.out.println("Factorial of "+ num+" is: "+fact);
	}

}
