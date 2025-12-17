import java.util.*;
public class CelciusToFahren{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		double celsius = sc.nextDouble();

		double fahren = (celsius * 9/5) + 32;

		System.out.println("Fahrenheit : "+fahren);

	}
}
