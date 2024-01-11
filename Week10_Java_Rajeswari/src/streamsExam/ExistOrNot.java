package streamsExam;

import java.util.List;
import java.util.stream.Collectors;

public class ExistOrNot {
	public static void main(String[] args) {
	List<Employee> employeeList = ListOfEmployee.listOfEmployee();
	boolean empty = employeeList.stream().filter(e->e.getName().equals("Sita")).collect(Collectors.groupingBy(Employee::getName)).isEmpty();
	System.out.println(empty);
	}
	
}
