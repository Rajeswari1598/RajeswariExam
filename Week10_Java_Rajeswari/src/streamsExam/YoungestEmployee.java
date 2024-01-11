package streamsExam;

import java.util.Comparator;
import java.util.List;

// Get the youngest employee details each department wise (By Using Optional)?
public class YoungestEmployee {
 public static void main(String[] args) {
	 List<Employee> employeeList = ListOfEmployee.listOfEmployee();
	 Employee employee = employeeList.stream().min(Comparator.comparing(Employee::getDepartment)).get();
	 System.out.println(employee);
}
}

