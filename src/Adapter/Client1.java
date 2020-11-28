package Adapter;

public class Client1 {

	public static void main(String[] args) {
		/*
		 * 2 way adapter
		 */
		
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		/*
		 * passing an  object of adapter
		 */
		populateEmployee(adapter);
		BusniessCardDesigner designer  = new BusniessCardDesigner();
		
		/*
		 * passing a object of customer interface
		 */
		String card = designer.designCard(adapter);
		System.out.println(card);
		
		
	}
	
	private static void populateEmployee(Employee employee) {
		employee.setFullName("Srinath\n");
		employee.setJobTitle("manager\n");
		employee.setOfficeLocation("US\n");
	}

}
