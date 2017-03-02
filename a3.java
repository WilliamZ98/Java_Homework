package Week_2;
import java.util.Scanner;
import static java.lang.System.out;
public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
			int a, b, c, max, min;
	    out.print("Input a : ");
			a = input.nextInt();
		out.print("Input b : ");
			b = input.nextInt();
		out.print("Input c : ");
			c = input.nextInt();
		input.close();
		//以下排序
		if (a > b){
			max = a;
			min = b;
		}else if (a < b){
			max = b;
			min = a;
		}
		else{
			max = a;
			min = a;
		}
		if (max < c)
			max = c;
		 if (min > c)
		    min = c;
		 out.printf("sum=\t\t%d\naverage=\t%d\nproduct=\t%d\nsmallest=\t%d\nlargest=\t%d", a+b+c, (a+b+c)/3, a*b*c, min, max);
	}

}
