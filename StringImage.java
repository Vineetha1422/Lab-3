package day7.task3;

import java.util.Scanner;

public class StringImage {
    public static void main(String[] args) {
    	StringImage si = new StringImage();
    	
    	System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("The Mirrored version :");
		System.out.println(si.getImage(str));
	}
    
    public String getImage(String str) {
    	StringBuffer sb = new StringBuffer(str);
		
		return str + " | " + sb.reverse();
    }
}
