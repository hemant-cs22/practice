import java.util.*;
public class CylinderVolume{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		float rad = sc.nextFloat();
		int height = sc.nextInt();

		float volume = 3.14f * rad*rad*height;

		System.out.println("Volume of the cylinder : "+volume);

	}

}
