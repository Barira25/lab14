package lab8;

public class pass {
	private String coursename;
	private int coursecode;
	private int rollno;
	pass(String coursename , int coursecode , int rollno) 
	{
	this.coursename = coursename;
	this.coursecode = coursecode;
	this.rollno = rollno;
	}
	public String getName() 
	{
	return coursename;
	}
	public void setName(String coursename) {
	this.coursename = coursename;
	}
	public int getcode() 
	{
	return coursecode;
	}
	public void setcode(int coursecode) {
	this.coursecode = coursecode;
	}
	public int getroll() 
	{
	return rollno;
	}
	public void setroll(int rollno) {
	this.rollno = rollno;
	}
	public static void main(String[] args) 
	{
	System.out.println("Last Class Record");
	pass obj = new pass ("Introduction to Software Engineering" , 304 , 135);
	System.out.println("Your Previous Course: " +obj.getName());
	System.out.println("Coursecode:" +obj.getcode());
	System.out.println("Roll number:" +obj.getroll()+"\n");
	System.out.println("You have passed congrats! You're Promoted to new class"+"\n");
	System.out.println("New Class Record");
	obj.setName("Your Current Course: Software Requirement Engineering");
	System.out.println("" +obj.getName());
	obj.setcode(235);
	System.out.println("Coursecode:" +obj.getcode());
	obj.setroll(135);
	System.out.println("Roll number:" +obj.getroll()); }
}



