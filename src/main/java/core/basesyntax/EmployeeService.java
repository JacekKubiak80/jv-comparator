package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployByOrder(List<Employee> employees) {

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int ageCompares = o1.getAge().compareTo(o2.getAge());
                if (ageCompares !=0) {
                    return ageCompares;
                }
                return String.compare(o1.getName(), o2.getName());
            }
        };
        Set<Employee> employee = new TreeSet<>(employeeComparator);

        return employee;
    }
}
