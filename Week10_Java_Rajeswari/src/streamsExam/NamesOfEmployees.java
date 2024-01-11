package streamsExam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Get the names of all employees who have joined after 2015?
class NamesOfEmployees {
	public static void main(String[] args) {
		List<Employee> employeeList = ListOfEmployee.listOfEmployee();
		
		Map<String, List<Employee>> collect = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015)
				.collect(Collectors.groupingBy(Employee::getName));
		collect.entrySet().stream().forEach(e->{
			System.out.println(e.getKey());
		});
	}

}
