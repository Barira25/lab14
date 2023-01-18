package lab8;

public class fail {

	final String courseName;
	final int rollNumber;
	final String courseCode;
	public fail(String courseName, int rollNumber, String courseCode) {
	this.courseName = courseName;
	this.rollNumber = rollNumber;
	this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public static void main(String[] args) {
		fail obj = new fail("Operating System", 135, "534");
		System.out.println("\nSorry! you have been failed in this semester\n");
		System.out.println("Course Name: " +obj.getCourseName());
		System.out.println("Coursecode: " +obj.getCourseCode());
		System.out.println("Roll number: " +obj.getRollNumber());
	}
	}



