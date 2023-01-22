package myfirstproject;
import java.util.*;


public class Implementation {

	public Implementation() {
		// TODO Auto-generated constructor stub
	}
	public static void studentDetails() {
		
		boolean bool=true;
		while(bool) {
		Scanner sc=new Scanner(System.in);
		School schoo=new School();
		schoo.student_details();
		List<Student>students=schoo.getStudentslist();
		System.out.println("1.Student Details               2.Pay Fees");
		System.out.println("3.Balance fees                  4.Add New Student");
		System.out.println("5.All Students Details          6.Exit");
		byte val=sc.nextByte();
		{sc.nextLine();
	switch(val) {
	case 1:{
	
	System.out.println("enter the student name");
	String stuname=sc.nextLine();
	
	boolean  b=false;
    for(Student student:students) {
    
    	if(stuname.equals(student.getName())) {
    		System.out.println("Name : "+student.getName()+"\nId :"+student.getId()+"\nGrade :"+student.getGrade());
    		System.out.println("Feespaid : "+student.getFeespaid()+"\n Father Name : "+student.getFather_name());
    		System.out.println("Mobile Number : "+student.getMobile_number());
    		break;
    	}
    	b=true;
    	
    	
    }
    if(b!=true) {
    	System.out.println("details not found of "+stuname);
    }
    break;
	
	}
	
	//case 1 ends
	//case 2 starts
	case 2:{
		boolean b=false;
		
		System.out.println("Enter Name");
		String stuname=sc.nextLine();
		System.out.println("Enter mobile number");
		long mobile_number=sc.nextLong();
		for(Student student :students) {
			if(stuname.equals(student.getName()) && mobile_number==student.getMobile_number()) {
				System.out.println("please Enter how much you pay");
				int pay=sc.nextInt();
				student.setFeespaid(pay);
				System.out.println("Remaining fees : "+student.remainingFees());
				b=true;
				break;
				
			}
			
		}
		 if(b!=true) {
		    	System.out.println("details not found of "+stuname);
		    }
		break;
	}
	
	
	//case2 ended
	//case3 started
	
	case 3:{
		boolean b=false;
		sc.nextLine();
		System.out.println("Enter Name");
		String stuname=sc.nextLine().trim();
		System.out.println("Enter mobile number");
		long mobile_number=sc.nextLong();
		for(Student student:students) {
			if(student.getName().equals(stuname) && (mobile_number==student.getMobile_number())) {
			System.out.println("Remaining fees : "+student.remainingFees());
			b=true;
			break;
		}
			
		
		}
		 if(b!=true) {
		    	System.out.println("details not found of "+stuname);
		    }
		break;
	    }
	
	case 4:{
		sc.nextLine();
		System.out.println("student details");
		System.out.println("enter Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter grade");
		int grade=sc.nextInt();
		System.out.println("Enter fees paid");
		int feespaid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter father Name");
		String father_name=sc.nextLine();
		System.out.println("Enter mobile number");
		long mobile_number=sc.nextLong();
		System.out.println("Enter Standard");
		int standard=sc.nextInt();
		Student stu=new Student(id,name,grade,feespaid,father_name,mobile_number,standard);
		schoo.addStudent(stu);
		System.out.println("Added details sucessfully");
		break;
		
		
	}
	
	//case4 ended
	//case 5 started
	case 5:{
		for(Student student:students) {
			System.out.println("==================================");
			System.out.println("Name : "+student.getName()+"\nId :"+student.getId()+"\nGrade :"+student.getGrade());
    		System.out.println("Feespaid : "+student.getFeespaid()+"\n Father Name : "+student.getFather_name());
    		System.out.println("Mobile Number : "+student.getMobile_number());
    		System.out.println("==================================");
    		
    		
		}
		break;
	}
	case 6:{
		bool=false;
	
		break;
		
		
	}
	default:{
		System.out.println("Entered invalid option");
	}
	}
		}
		}
	
	
		
	
	
	}	
	
	
//teacher details
public static void teacherDetails(){
	boolean bool=true;
	while(bool) {
	Scanner sc=new Scanner(System.in);
	School schoo=new School();
	List<Teacher>teachers=schoo.getTeacherslist();
	System.out.println("1.Teacher Details               2.All Teacher Details ");
	System.out.println("3.Add New Teacher               4.Exit");
	int val=sc.nextInt();
	sc.nextLine();
	switch(val) {
	case 1:{
		System.out.println("enter teacher name");
		String teachername=sc.nextLine();
		System.out.println("enter teacher number");
		long mobile_number=sc.nextLong();
		for(Teacher teacher:teachers) {
		 if(teacher.getName().equals(teachername) && (teacher.getMobile_number()==mobile_number)){
			 System.out.println("Name : "+teacher.getName()+"\nId :"+teacher.getId()+"\nsubject :"+teacher.getSubject());
	    	
	    		System.out.println("Mobile Number : "+teacher.getMobile_number()+"\nsalary"+teacher.getSalary());
	    		break;
		 }
		}
		break;
	}
	//case1 ended & case2 started
	case 2:{
		for(Teacher teacher:teachers) {
			System.out.println("Name : "+teacher.getName()+"\nId :"+teacher.getId()+"\nsubject :"+teacher.getSubject());
	    	
    		System.out.println("Mobile Number : "+teacher.getMobile_number()+"\nsalary"+teacher.getSalary());
    		
		}
		break;
	}
	
	//case2 ended case3 started
	case 3:{
		System.out.println("enter teacher details");
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter subject");
		String subject=sc.nextLine();
		System.out.println("enter mobile number");
		long mobile_number=sc.nextLong();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		Teacher teach=new Teacher(id,name,subject,mobile_number,salary);
		schoo.addTeacher(teach);
		System.out.println("data added sucessfully");
		break;
		
	}
	//case3 ended case4 started
	case 4:{
		bool=false;
		
		break;
	}
	default:{
		System.out.println("selected invalid option");
	}
	

	}
	
	}
	
	
	
	}
	//method ended



public static  void managementDetails() {
	School schoo=new School();
	Scanner sc=new Scanner(System.in);
	boolean bool=true;
	while(bool) {
	System.out.println("1.Total Money Earned       2.Total Money Spent");
	System.out.println("3.Remaining Money left     4.Exit");
	int num=sc.nextInt();
	switch(num) {
	case 1:{
		System.out.println("Total Money Earned : "+schoo.total_earning());
		break;
	}
	case 2:{
		System.out.println("Total Money Spent : "+schoo.totalMoneySpent());
		break;
		
	}
	case 3:{
		System.out.println("Remaining Money Left : "+schoo.remainingMoney());
		break;
	}
	case 4:{
		bool=false;
		
		break;
	}
	default:{
		System.out.println("selected invalid option");
	}
	}
	
}//loop end
}
//method end
}