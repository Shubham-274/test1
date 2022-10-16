import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
	int a=1,sum=0;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter 5 numbers: ");
		while(a<=5)
		{
			
			int num = sc.nextInt();
			
			sum = sum+num;
			a++;
		}
		System.out.println("The Sum of five numbers: "+sum);
		
	}

}
