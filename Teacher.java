package myfirstproject;

public class Teacher {
	
	//teacher data
	
	
	
	private int id;
	private String name;
	private String subject;
	private long mobile_number;
	private int salary;
	
	
	
	// constructors data
	
	

	public Teacher() {}


	public Teacher(int id, String name, String subject, long mobile_number, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.mobile_number = mobile_number;
		this.salary = salary;
	}


	//getters & setters
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public long getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
		
	}	
}
