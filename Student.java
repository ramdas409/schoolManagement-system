package myfirstproject;

public class Student {
	
	//data
	
	
			int id;
			String name;
			int grade;
			int  feespaid;  // fees for 1to 3r class :30000, for 4th to 6th class :38000,   for  7Th to 9th :43000 , for 10th:50000
			String father_name;
			long mobile_number;
			int standard;
	
	
	//constructors
	public Student() {}
	
	public Student(int id, String name, int grade, int feespaid, String father_name, long mobile_number,int standard){
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.father_name = father_name;
		this.mobile_number = mobile_number;
		this.standard=standard;
	if(this.standard>=1 && this.standard<=3) {
		if(feespaid<=30000) {
			this.feespaid=feespaid;
		
		}
		else {
			System.out.println("you have to pay only 30000  but you paid now :  "+feespaid+"\n  you will get change of"+(feespaid-30000));
			this.feespaid=30000;
		}
	}
	
	
	else if(this.standard>=4 && this.standard<=6){
		if(feespaid<=38000) {
			this.feespaid=feespaid;
		}
		else {
			System.out.println(this.name+" : you have to pay only 38000 but you paid now : "+feespaid+"you will get change of : "+(feespaid-38000));
			this.feespaid=38000;
		}
	}
	else if(this.standard>=7 && this.standard<=9) {
		if(feespaid<=43000) {
			this.feespaid=feespaid;
		}
		else {
			System.out.println(this.name+" : you have to pay only 43000  but you paid now :  "+feespaid+" you will get change of"+(feespaid-43000));
			this.feespaid=43000;
		}
	}
	else if(this.standard==10) {
		if(feespaid<50000) {
			this.feespaid=feespaid;
		}
		else {
			System.out.println(this.name+" : you have to pay only 50000  but you paid now :  "+feespaid+" you will get change of"+(feespaid-50000));
			this.feespaid=50000;
		}
	}
	
		
		
	
	
	}//constructor ended

	
	
	
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(int payment) {
		if(this.standard>=1 && this.standard<=3) {
			if((this.feespaid)==30000) {
				System.out.println("you paid already total fees: 30000");
			}
			else if((this.feespaid+payment)<=30000){
				this.feespaid+=payment;
			}
			
			else {
				
				System.out.println(this.name+" you paid already : "+this.feespaid+" now you have to pay only : "+(30000-this.feespaid)+"\nBut you paid totally : "+(this.feespaid+payment)+"now you will get a change of : "+(this.feespaid+payment-30000));
				this.feespaid+=(30000-this.feespaid);
			}
		}
		
		
		
		else if(this.standard>=4 && this.standard<=6) {
			if((this.feespaid)==38000) {
				System.out.println("you paid already total fees: 38000");
			}
			else if((this.feespaid+payment)<=38000){
				this.feespaid+=payment;
			}
			
			else {
				
				System.out.println(this.name+" you paid already : "+this.feespaid+" now you have to pay only : "+(38000-this.feespaid)+"\nBut you paid totally : "+(this.feespaid+payment)+"now you will get a change of : "+(this.feespaid+payment-38000));
				this.feespaid+=(38000-this.feespaid);
			}
		}
		
		
		
		
		
		
		else if(this.standard>=7 && this.standard<=9) {
			if((this.feespaid)==43000) {
				System.out.println("you paid already total fees: 43000");
			}
			else if((this.feespaid+payment)<=43000){
				this.feespaid+=payment;
			}
			
			else {
				
				System.out.println(this.name+" you paid already : "+this.feespaid+" now you have to pay only : "+(43000-this.feespaid)+"\nBut you paid totally : "+(this.feespaid+payment)+"now you will get a change of : "+(this.feespaid+payment-43000));
				this.feespaid+=(43000-this.feespaid);
			}
		}
		
		
		

		else if(this.standard==10) {
			if((this.feespaid)==50000) {
				System.out.println("you paid already total fees: 50000");
			}
			else if((this.feespaid+payment)<=50000){
				this.feespaid+=payment;
			}
			
			else {
				
				System.out.println(this.name+" you paid already : "+this.feespaid+" now you have to pay only : "+(50000-this.feespaid)+"\nBut you paid totally : "+(this.feespaid+payment)+"now you will get a change of : "+(this.feespaid+payment-50000));
				this.feespaid+=(50000-this.feespaid);
			}
		}
	
		
		
		
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int remainingFees() {
		int fees=0;
		if(this.standard>=1 && this.standard<=3) {
		 fees+=30000-this.feespaid;
		}
		else if(this.standard>=4 && this.standard<=6) {
			 fees+=38000-this.feespaid;
		}
		else if(this.standard>=7 && this.standard<=9) {
			 fees+=43000-this.feespaid;
		}
		else if(this.standard==10) {
			 fees+=50000-this.feespaid;
		}
	return fees;
	}

}
