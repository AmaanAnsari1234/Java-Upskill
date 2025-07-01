// Even Odd

import java.util.*;
public class evenodd{
	public static void main(String[] agrs){

	Scanner sc = new Scanner (System.in);

	System.out.println("Eneter a number:");

	int num= sc.nextInt ();

	if(num%2==0)
		System.out.println(num+ "No is Even");
	else
		System.out.println(num+ "No is Odd");
}

}