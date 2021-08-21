package ITVDN.Part1_Single_Responsibility_Principle.part13_employee_architecture;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        System.out.println(employee + " saved!!!");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println(employee + " deleted!!!");
    }
}
