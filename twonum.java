// Sum of 2 numbers

import java.util.*;

public class twonum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;

		System.out.println("Sum = " + sum);
	}
}
