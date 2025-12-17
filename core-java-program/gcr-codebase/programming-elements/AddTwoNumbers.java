import java.util.*;
public class AddTwoNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		// take two numbers from user for addition
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = 0;

		// adding them and store into a third variable sum
		
		sum = num1+num2;

		System.out.println("Sum : "+sum);

	}

}
