package Composite;

public class Client {
 public static void main(String[] args) {
	 Developer dev1 = new Developer("100", "Lokesh Sharma"); 
     Developer dev2 = new Developer("101", "Vinay Sharma");
     CompanyDirectory devDirecotry = new CompanyDirectory();
     devDirecotry.addEmployee(dev1);
     devDirecotry.addEmployee(dev2);
     
     
     Manager man1 = new Manager("200", "Kushagra Garg"); 
     Manager man2 = new Manager("201", "Vikram Sharma ");
     CompanyDirectory managerDirecotry = new CompanyDirectory();
     managerDirecotry.addEmployee(man1);
     managerDirecotry.addEmployee(man2);
     
   devDirecotry.showEmployeeDetails();
   managerDirecotry.showEmployeeDetails();
   
   managerDirecotry.removeEmployee(man2);
   managerDirecotry.showEmployeeDetails();
   
   dev1.showEmployeeDetails();
   man1.showEmployeeDetails();
   
   
   
   CompanyDirectory mainDirectory = new CompanyDirectory();
   mainDirectory.addEmployee(managerDirecotry);
   
   mainDirectory.addEmployee(devDirecotry);
   System.out.println("*************************************");
   mainDirectory.showEmployeeDetails();
 }
}
