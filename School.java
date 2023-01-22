package myfirstproject;
import java.util.*;
import java.util.List;

import java.util.ArrayList;

public class School {
	
	// data members
	
	List<Student>studentslist=new ArrayList<>();
	List<Teacher>teacherslist=new ArrayList<>();
	 
	
	
	  public void student_details(){
		  
		 Student ram=new Student(409,"rammohan",1,30000,"gopal",8790876534l,10);
			

		Student muzzu=new Student(420,"muzzu",2,30000,"azez",8297443101l,9);

			Student ali=new Student(420,"ali",2,25000,"rahamatulla",9014484452l,10);
		studentslist.add(ali);
		studentslist.add(muzzu);
		studentslist.add(ram);		
		Teacher akshay=new Teacher(2,"akshay","java",8748382637l,20000);
		Teacher anupama=new Teacher(1,"anupama","java",7384929394l,30000);
		teacherslist.add(anupama);
		teacherslist.add(akshay);
	 }
	 //constructors
	 public School() {}
	 
	public School(Student sb,Teacher tc) {
	
		studentslist.add(sb);
		teacherslist.add(tc);
	}
	
	public School(Student sb) {
		
		studentslist.add(sb);
		
	}
	
	
	public School(Teacher tc) {
		
		teacherslist.add(tc);
	}
	
	//  data addding methods
	
	
	
	public List<Student> getStudentslist(){
		return studentslist;
	}
	public List<Teacher> getTeacherslist(){
		return teacherslist;
	}
	
public long total_earning() {
	 long total_money_earned=0;
	for(Student ss:studentslist) {
		total_money_earned+=(ss.getFeespaid());
	}
	return total_money_earned;
	
	
}
	public  void addStudent(Student ab) {
		studentslist.add(ab);
	}
	public  void addTeacher(Teacher ba) {
		teacherslist.add(ba);
	}
	
	public long totalMoneySpent() {
		 long total_money_spent=0;
		for(Teacher tc:teacherslist) {
			total_money_spent+=(tc.getSalary());
		}
		return total_money_spent;
	}
	
	public long remainingMoney() {
		return (total_earning()-totalMoneySpent());
	}
	
}
