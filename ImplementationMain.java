package myfirstproject;

import java.util.Scanner;

public class ImplementationMain {

	public ImplementationMain() {
		// TODO Auto-generated constructor stub
	}
	public static void doOperation() {
		boolean bab=true;
		while(bab) {
		
		System.out.println("1. student            2.Teacher");
		System.out.println("3. Management         4.Exit");
		Scanner scb=new Scanner(System.in);
		byte num=scb.nextByte();
		
		switch(num) {
		
		//case1 started
		case 1:{Implementation.studentDetails();
				break;
				
		}
		
		//case2  started
		case 2:
			Implementation.teacherDetails();
			break;
		
		case 3:{
			Implementation.managementDetails();
			break;
		}
		case 4:{
				bab=false;
				
				System.out.println("exit done sucessfully");
				
				scb.close();
				System.exit(0);
				
				break;
		}
		default:{
			System.out.println("selected Invalid Option");
			
		
		}
		
	
		}//switch completed
		
		
		}
	}
}
