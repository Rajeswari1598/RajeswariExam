package streamsExam;

import java.util.List;
import java.util.stream.Collectors;

public class GenderCountInOrganization {
	public static void main(String[] args) {
		List<Employee> employeeList =ListOfEmployee.listOfEmployee();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
		.forEach((e,count)->{
			System.out.println(e+":"+count);
		});
	}

}
