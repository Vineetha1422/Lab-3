package day7.task3;

import java.util.Scanner;
import java.lang.Math;

public class ModifyNumbers {
    public static void main(String[] args) {
    	ModifyNumbers mn = new ModifyNumbers();
    	
		System.out.println("Enter The number : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Result : " + mn.modifyNumber(sc.nextInt()));
	}
    
    public int modifyNumber(int num) {
    	char arr[] = (String.valueOf(num)).toCharArray();
    	StringBuffer str = new StringBuffer();
    	for(int i = 0;i < arr.length-1;i++) {
    		str.append(Math.abs((int)(arr[i]) - (int)(arr[i+1])));
    	}
    	str.append(arr[arr.length-1]);
    	return Integer.valueOf(str.toString());
    }
}
