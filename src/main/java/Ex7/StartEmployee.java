package Ex7;

        import java.util.ArrayList;
        import java.util.List;

public class StartEmployee {

    static Employee employee1 = new Employee("John","emp011",20000.00);
    static Employee employee2 = new Employee("A","emp011",40000.00);
    static Employee employee3;

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        //modalitate mai usoara de instantiere

        List<Employee> employeeList1 = new ArrayList<>(){{
            add(employee1);
            add(employee2);
        }};
        employeeList1.add(employee3);

        System.out.println(employeeList);

        System.out.println(new EmployeeSelection().select(employeeList));
        System.out.println(new EmployeeSelection().select(employeeList1));
        System.out.println(new EmployeeSelection().sortByName(employeeList));
        System.out.println(new EmployeeSelection().maxSalary(employeeList));
    }
}
