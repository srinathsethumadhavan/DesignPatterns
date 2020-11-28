package Composite;

public class Manager extends Employee{

	private String name;
	private String id;
	public Manager(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public void showEmployeeDetails() {
		
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", id=" + id + "]";
	}
	
	
}
