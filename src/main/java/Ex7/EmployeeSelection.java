package Ex7;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeSelection {

    public Employee select(List<Employee> employees){

        if (employees == null)
            return null;

        return employees.stream().filter(employee -> employee != null && employee.getSalary() >= 30000)
                .findFirst().orElse(new Employee("Ana","asd",2000.00));
    }

    public List<Employee> sortByName(List<Employee> employees){

        if (employees == null)
            return null;

        Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
       employees.sort(comparator);
       return employees;
    }
    public Double maxSalary(List<Employee> employees){

        if (employees == null)
            return null;
        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary);
        return employees.stream().map(Employee::getSalary).max(Comparator.naturalOrder()).orElse(0.0);

    }

}