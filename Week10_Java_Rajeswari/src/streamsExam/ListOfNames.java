package streamsExam;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfNames {
 public static void main(String[] args) {
	 List<Employee> employeeList = ListOfEmployee.listOfEmployee();
	 employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream()
	 .forEach(e->{
		 System.out.println(e.getKey());
		 System.out.println("--------");
		 e.getValue().stream().forEach(e1->System.out.println(e1.getName()));
		 System.out.println("***************");
	 });
}
}
