package Week_2;
import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
				int a;
				int b;
				System.out.print("Input a : ");
					a = input.nextInt();
				System.out.print("Input b : ");
					b = input.nextInt();
				input.close();
			System.out.printf("Sum\t\tDifference\tProduct\t\tQuotient\na+b=%d\t\ta-b=%d\t\ta*b=%d\t\ta/b=%.3f", a + b, a-b, a*b, (float)a/b);
	}

}