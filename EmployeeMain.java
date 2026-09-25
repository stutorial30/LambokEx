package lambokEx;

public class EmployeeMain {
	    public static void main(String[] args) {

	        Employee emp = new Employee(101, "Sakshi", "IT", 50000);

	        System.out.println(emp);

	        System.out.println("Employee ID: " + emp.getEid());
	        System.out.println("Employee Name: " + emp.getName());

	        emp.setSalary(60000);

	        System.out.println("Updated Salary: " + emp.getSalary());
	    }
	}