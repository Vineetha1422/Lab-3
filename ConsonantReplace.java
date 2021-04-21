package day7.task3;

import java.util.Scanner;

public class ConsonantReplace {
    public static void main(String[] args) {
    	ConsonantReplace cr = new ConsonantReplace();
    	
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String sb = new String(sc.next());
		//System.out.println(cr.alterString(sb.toCharArray()));
		System.out.println(cr.alterString(sb));
	}
    
    /*public String alterString(char[] str) {
    	for(int i = 0;i < str.length;i++) {
			if((str[i] != 'a') && (str[i] != 'e') && (str[i] != 'i') && (str[i] != 'o') && (str[i] != 'u')) {
    		str[i] = (char)(str[i] + 1);
			}
		}
    	return String.valueOf(str);
    }*/
    
    public String alterString(String str) {
    	StringBuffer sb = new StringBuffer(str);
    	for(int i = 0;i < sb.length();i++) {
    		char ch = sb.charAt(i);
    		if((ch != 'a') && (ch != 'e') && (ch!= 'i') && (ch != 'o') && (ch != 'u')) {
        		ch = (char)(ch + 1);
        		sb.replace(i, i+1, String.valueOf(ch));
    			}
    	}
    	return sb.toString();
    }
}
