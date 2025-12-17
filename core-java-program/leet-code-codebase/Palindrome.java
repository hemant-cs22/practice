import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String str = sc.next();


		int i=0;
		int j=str.length()-1;

		while(i < j){
			if(str.charAt(i) != str.charAt(j)){
				System.out.println("String is not a palindrome");
				break;
			}
			i++;
			j--;
		}

		if(i>=j){
			System.out.println("String is palindrome");

		}

	}

}
