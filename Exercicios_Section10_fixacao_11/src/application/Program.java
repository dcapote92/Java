package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How much people to insert: ");
		float[] height = new float[sc.nextInt()];
		char[] sex = new char[height.length];
		byte women = 0, men = 0;
		float womenAverageHeight = 0, max = 0, min = 2f;
		for (int i = 0; i < sex.length; i++) {
			System.out.printf("%d° person data:%n", i+1);
			System.out.print("Height: ");
			height[i] = sc.nextFloat();
			System.out.print("Sex: ");
			sex[i] = sc.next().charAt(0);
			if(height[i] > max)
				max = height[i];
			if(height[i] < min)
				min = height[i];
			if(sex[i] == 'F') {
				women++;
				womenAverageHeight += height[i];
			}else {
				men++;
			}
		}
		sc.close();
		womenAverageHeight /= women; 
		System.out.printf("Min height: %.2f%nMax height: %.2f%nAverage women height: %.2f%nMen number: %d",
				min,max,womenAverageHeight,men);
	}

}
