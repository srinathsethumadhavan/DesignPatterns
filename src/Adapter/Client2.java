package Adapter;

public class Client2 {

	public static void main(String[] args) {
		
		 Employee employee = new Employee();
		 populateEmployee(employee);
		EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
		BusniessCardDesigner designer  = new BusniessCardDesigner();
		String card = designer.designCard(adapter);
			System.out.println(card);
	}
	private static void populateEmployee(Employee employee) {
		employee.setFullName("Srinath\n");
		employee.setJobTitle("manager\n");
		employee.setOfficeLocation("US\n");
	}
}
