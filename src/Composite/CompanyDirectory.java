package Composite;


import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory  extends Employee{

	private List<Employee> empList ;
	
	public CompanyDirectory() {
		 empList = new ArrayList<>() ;
	}

	@Override
	public void showEmployeeDetails() {
		for(Employee emp :empList)
			emp.showEmployeeDetails();
	}

	
	public void addEmployee(Employee emp) {
		this.empList.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		this.empList.remove(emp);
	}
}
