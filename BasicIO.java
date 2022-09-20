package lab03;

import java.util.*;
import java.time.LocalDate;

//An exploration of basic input and output.
public class BasicIO {
	
	//Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		//get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		System.out.print("Enter your age: " );
		String years = stdin.nextLine();
		
		System.out.print("Enter your height: " );
		String height = stdin.nextLine();
		
		LocalDate date = LocalDate.now();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
		
		//display output on console
		System.out.println(date+ " 현재 " +name+"("+ years+")의 키는 "+height+"cm 입니다" );
		System.out.println(Integer.valueOf(years)*365);
		
	} // method main
} // class BASIC_IO

