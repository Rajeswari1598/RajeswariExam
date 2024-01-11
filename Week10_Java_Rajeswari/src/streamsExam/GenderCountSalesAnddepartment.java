package streamsExam;

import java.util.List;
import java.util.stream.Collectors;

public class GenderCountSalesAnddepartment {
	public static void main(String[] args) {
		List<Employee> employeeList = ListOfEmployee.listOfEmployee();
		employeeList.stream().filter(e->e.getDepartment().equals("Sales")||e.getDepartment().equals("Marketing"))
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender,Collectors.counting())))
		.entrySet().stream().forEach(e->{
			System.out.println(e.getKey());
			e.getValue().forEach((e1,count)->{
				System.out.println(e1+":"+count);
			});
		});
	}
}
