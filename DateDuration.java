package day7.task3;

import java.time.*;
import java.util.*;

public class DateDuration {
    public static void main(String[] args) {
    	
    	
    	//Due date
		System.out.println("Enter the due date in format : dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("/");
		LocalDate ddate = LocalDate.of(Integer.valueOf(arr[2]), Integer.valueOf(arr[1]), Integer.valueOf(arr[0]));
		//Current date
		LocalDate cdate = LocalDate.now();
		Period difference = cdate.until(ddate);
		
		//Calculation
		System.out.println("Time remaining : " + difference.getYears() + " years " + difference.getMonths() + " months " + difference.getDays() + " days " );
	}
}
