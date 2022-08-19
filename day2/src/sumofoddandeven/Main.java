package sumofoddandeven;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the interger value");
		int n = scanner.nextInt();
		int r=sum(n);
		
		if(r== 1)
			 System.out.println("yes");
		else
			 System.out.println("no");
	}

}
