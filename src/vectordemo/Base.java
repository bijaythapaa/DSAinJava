package vectordemo;

import java.util.List;
import java.util.Vector;

public class Base {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new Vector<>();
		employeeList.add(new Employee("Bishal", "Upadhyaya", 1));
		employeeList.add(new Employee("Santosh", "Paneru", 2));
		employeeList.add(new Employee("Sanjeev", "Roka", 3));
		employeeList.add(new Employee("Vijay", "Dhakal", 4));
		
		employeeList.forEach(employee -> System.out.println(employee));

		
	}

}
