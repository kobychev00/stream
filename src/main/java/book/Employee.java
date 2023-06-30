package book;

import java.util.Objects;

public class Employee {
    private static int idGenerator = 1;
    private final int id;
    private final String fullName;
    private int departament;
    private double salary;

        public Employee (String fullName,
                         int departament,
                         double salary) {
            this.id = idGenerator++;
            this.fullName = fullName;
            this.departament = departament;
            this.salary = salary;
        }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName)
                && departament == employee.departament && salary == employee.salary;
    }

    @Override

    public int hashCode () {
        return Objects.hash(fullName, departament, salary);
    }

    @Override
    public String toString() {
        return "id: " + id + ", ФИО: " + fullName + ", отдел: " + departament + ", ЗП " + salary;
    }
}

