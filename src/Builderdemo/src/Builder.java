package Builderdemo.src;
public class Builder {

	private String name;
	private String age;
	private int marks;
	private boolean result;
	private double average;
	private String gender;
	
	public Builder withName(String name) {
		this.name = name;
		return this;
	}
	public Builder withAge(String age) {
		this.age = age;
		return this;
	}
	public Builder withMarks(int marks) {
		this.marks = marks;
		return this;
	}
	public Builder withGender(String gender) {
		this.gender = gender;
		return this;
	}
	public Builder withAverage(double average) {
		this.average = average;
		return this;
	}
	public Builder withResult(boolean result) {
		this.result = result;
		return this;
	}
	
	public Student build() {
		Student std = new Student();
		std.setName(this.name) ;
		std.setAge( this.age);
		std.setResult(this.result) ;
		std.setAverage( this.average);
		std.setGender(this.gender) ;
		std.setMarks( this.marks);
		return std;
		
	}
}
