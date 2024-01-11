package streamsExam;

import java.util.Scanner;

public class RambosPattren {
	public void pattern() {
		int number=9;
		int spaces=number/2;
		int star=1;
		for(int index=1;index<=number;index++) {
			for(int index1=index;index1<=number;index1++) {
				System.out.print("");
			}
			for(int index2=1;index2<=index;index2++) {
				System.out.print("*");
			}
			if(index<=number/2) {
				star=star+2;
				spaces--;
				}
			else {
				
				star=star-1;
				spaces++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		RambosPattren rambosPattren=new RambosPattren();
		rambosPattren.pattern();
	}
}
