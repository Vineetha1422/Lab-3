package day7.task3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerClassDemo {
    public static void main(String[] args) {
		System.out.println("Enter the numbers sepearted by a space");
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		int sum = 0;
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println(temp);
			sum += Integer.parseInt(temp);
		}
		System.out.println("The sum of all numbers : " + sum);
	}
}
