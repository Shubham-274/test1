import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		int a=1,pro=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter base: ");
		int x = sc.nextInt();
		System.out.println("Please enter power: ");
		int y = sc.nextInt();
		
		while(a<=y)
		{
			pro = x*pro;
			a++;
		}
		System.out.println(pro);

	}

}
