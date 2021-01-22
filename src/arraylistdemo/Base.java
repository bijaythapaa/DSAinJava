package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class Base {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Bishal", "Upadhyaya", 1));
		employeeList.add(new Employee("Niraj", "Dangi", 2));
		employeeList.add(new Employee("Anil", "Maharjan", 3));
		employeeList.add(new Employee("Siraj", "Lama", 4));
		
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
		employeeList.forEach(employee -> System.out.println(employee));
		System.out.println(employeeList.get(0));
		System.out.println(employeeList.isEmpty());
		
		employeeList.set(1, new Employee("Sanjeev", "Roka", 5));
		employeeList.add(1, new Employee("Nishwartha", "DC", 6));
		employeeList.forEach(employee -> System.out.println(employee));
		
		System.out.println(employeeList.size());
		
//		Object[] employeeArray = employeeList.toArray();
//		for (Object object : employeeArray) {
//			System.out.println(object);
//		}
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(employeeList.contains(new Employee("Bishal", "Upadhyaya", 1)));
		System.out.println(employeeList.indexOf(new Employee("Siraj", "Lama", 4)));
		
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
		
	}

}
