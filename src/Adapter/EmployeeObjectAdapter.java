package Adapter;

public class EmployeeObjectAdapter implements Customer {

	
 private Employee adaptee;

 
 
public EmployeeObjectAdapter(Employee adaptee) {
	super();
	this.adaptee = adaptee;
}

@Override
public String getName() {
	
	return adaptee.getFullName();
}

@Override
public String getAddress() {
	
	return adaptee.getOfficeLocation();
}

@Override
public String getDesignation() {
	
	return adaptee.getJobTitle();
}
 
 
}
