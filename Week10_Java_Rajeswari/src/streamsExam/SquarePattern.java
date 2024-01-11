package streamsExam;

import java.util.Scanner;

public class SquarePattern {
	public void pattern() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		for(int index=1;index<=number;index++) {
			for(int index1=1;index1<=number;index1++) {
				if(index==1||index1==1||index==number||index1==number) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		SquarePattern squarePattern = new SquarePattern();
		squarePattern.pattern();
	}
}
