package Strings;

public class Stundent {

	private String name;
	private int marks;
	
	
	public Stundent(String string, int i) {
		
	}

	public void Student(String name, int marks) {
		
		this.name=name;
		this.marks=marks;
		}
	
	public String getname() {
		return name;
		
	}
	
	public int getMarks() {
		return marks;
		
	}
	    
	public void displayDetail() {
		System.out.println("Student Nmae = " + name);
		System.out.println("Marks =" + marks);
		
		
	}
	
	
	public static  void main(String[] args) {
	 Stundent s1 = new Stundent("Narsimha", 85);

s1.displayDetail();
	 
	 
	 

	}

}
