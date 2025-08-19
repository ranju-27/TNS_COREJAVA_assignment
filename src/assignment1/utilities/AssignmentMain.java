package assignment1.utilities;
import assignment1.employees.Developers;
import assignment1.employees.manager;
import assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        manager m = new manager();
        m.setEmployeeId(1);
        m.setName("Alice");
        m.setSalary(90000);
        m.setDepartment("HR");

        Developers d = new Developers();
        d.setEmployeeId(2);
        d.setName("Bob");
        d.setSalary(70000);
        d.setProgrammingLanguage("Java");

        EmployeeUtilities util = new EmployeeUtilities();
        util.printEmployeeDetails(m);
        util.printEmployeeDetails(d);

        util.updateSalary(d, 80000);
        System.out.println("After salary update:");
        util.printEmployeeDetails(d);
    }
}