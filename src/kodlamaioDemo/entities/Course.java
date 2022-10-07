package kodlamaioDemo.entities;

public class Course {

	private int id;
	private String courseName;
	private int unitPrice;
	
	public Course() {
		
	}

	public Course(int id, String courseName, int unitPrice) {
		this.id = id;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
