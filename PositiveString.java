package day7.task3;

import java.util.Scanner;

public class PositiveString {
    public static void main(String[] args) {
    	PositiveString ps = new PositiveString();
    	
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Positive String : " + ps.isPositiveString(sc.next().toCharArray()));
	}
    
    public boolean isPositiveString(char[] arr) {
    	boolean flag = true;
    	int i = 0;
    	while(i+1 != arr.length) {
    		if(arr[i] > arr[i+1]) {
    			flag = false;
    			break;
    		}
    		i++;
    	}
    	return flag;
    }
}
