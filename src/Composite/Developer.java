package Composite;

public class Developer extends Employee {

	private String name;
	private String id;
	public Developer(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", id=" + id + "]";
	}
	@Override
	public void showEmployeeDetails() {
		System.out.println(this.toString());
		
	}
	
	
}
