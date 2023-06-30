package book;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    private static double raiseSalaries;

    int departament = 5;

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static int getTotalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = (int) (sum + employee.getSalary());
            }
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = (int) employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = (int) employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalaries() / count;
        }
        return 0;
    }

    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static void indexSalaries() {

        for (Employee employee : EMPLOYEES) {
            double percent = 1.09;
            employee.setSalary(employee.getSalary() * percent);
            System.out.printf(" После индексации зарплаты сотрудник " + employee.getFullName() + " получает %.0f " + " рублей%n", employee.getSalary());
        }
    }

    private static Employee findEmployeeWithMinSalaryByDep() {
        int min = Integer.MAX_VALUE;
        int departament = 5;
        Employee employeeWithMinSalaryByDep = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min && employee.getDepartament() == departament) {
                min = (int) employee.getSalary();
                employeeWithMinSalaryByDep = employee;
            }
        }
        return employeeWithMinSalaryByDep;
    }

    private static Employee findEmployeeWithMaxSalaryByDep() {
        int max = Integer.MIN_VALUE;
        int departament = 5;
        Employee employeeWithMaxSalaryByDep = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max && employee.getDepartament() == departament) {
                max = (int) employee.getSalary();
                employeeWithMaxSalaryByDep = employee;
            }
        }
        return employeeWithMaxSalaryByDep;
    }

    private static double getTotalSalariesByDep() {
        double sum = 0;
        int departament = 5;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getDepartament() == departament) {
                sum = (double) (sum + employee.getSalary());
            }
        }
        return sum;
    }

    private static double findAverageSalaryByDep() {
        int count = 0;
        int departament = 5;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getDepartament() == departament) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalariesByDep() / count;
        }
        return 0;
    }

    private static void indexSalariesByDep() {

        for (Employee employee : EMPLOYEES) {
            int departament = 5;
            double percent = 1.09;
            if (employee != null && employee.getDepartament() == departament) {
                employee.setSalary(employee.getSalary() * percent);
            }
            if (employee != null && employee.getDepartament() == departament) {
                System.out.printf("После индексации зарплаты в отделе № " + departament + " сотрудник " + employee.getFullName() + " получает %.0f " + " рублей%n", employee.getSalary());
            }
        }
    }
    private static void printFullNameAndSalaryInfoByDep() {
        for (Employee employee : EMPLOYEES) {
            int departament = 5;
            if (employee != null && employee.getDepartament() == departament) {
                System.out.println("Сотрудник " + employee.getFullName() + ", ЗП " + employee.getSalary() + " рублей");
            }
        }
    }

    private static void checkSalaryLess (){
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < 60000) {
                System.out.println("Получает менее 60000 рублей " + employee.getFullName() + ", ЗП " + employee.getSalary() + " рублей");
            }
        }
    }

    private static void checkSalaryMore (){
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() >= 60000) {
                System.out.println("Получает более 60000 рублей " + employee.getFullName() + ", ЗП " + employee.getSalary() + " рублей");
            }
        }
    }





    public static void main(String[] args) {
        System.out.println("Курсовая работа");
        EMPLOYEES[0] = new Employee("Иванов Сергей Петрович", 2, 55000);
        EMPLOYEES[1] = new Employee("Петров Иван Сергеевич", 3, 54000);
        EMPLOYEES[2] = new Employee("Сергеев Петр Иванович", 4, 56000);
        EMPLOYEES[3] = new Employee("Аббасов Али Рассимович", 5, 66000);
        EMPLOYEES[4] = new Employee("Аманнулаев Эльмир Салех Оглы", 1, 60000);
        EMPLOYEES[5] = new Employee("Карпов Денис Евгеньевич", 2, 61000);
        EMPLOYEES[6] = new Employee("Щербакова Анна Евгеньевна", 4, 60500);
        EMPLOYEES[7] = new Employee("Голованова Яна Петровна", 4, 41500);
        EMPLOYEES[8] = new Employee("Малютенкова Инна Петровна", 5, 49500);
        EMPLOYEES[9] = new Employee("Асфодьярова Ирина Владмировна", 5, 48750);


        printFullInfo();
        int totalSalaries = getTotalSalaries();
        System.out.println("Сумма зарплат " + totalSalaries);
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой:" + employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой:" + employeeWithMaxSalary);
        double averageSalary = findAverageSalary();
        System.out.printf("Средняя зарплата %.2f%n", averageSalary);
        printFullNameInfo();
        System.out.println("2ой уровень");
        int departament = 5;
        indexSalaries();
        Employee employeeWithMinSalaryIn5thDep = findEmployeeWithMinSalaryByDep();
        System.out.println("Сотрудник с минимальной зарплатой отделе № " + departament + " " + employeeWithMinSalaryIn5thDep);
        Employee employeeWithMaxSalaryIn5thDep = findEmployeeWithMaxSalaryByDep();
        System.out.println("Сотрудник с максимальной зарплатой в отделе № " + departament + " " + employeeWithMaxSalaryIn5thDep);
        double totalSalariesIn5thDep = getTotalSalariesByDep();
        System.out.println("Сумма затрат на зарплату отделе № равна " + departament + " " + getTotalSalariesByDep() + " рублей");
        double averageSalaryIn5thDep = findAverageSalaryByDep();
        System.out.println("Средняя зарплата в отделе № " + departament + " " + averageSalaryIn5thDep + " рублей");
        indexSalariesByDep();
        printFullNameAndSalaryInfoByDep();
        checkSalaryLess();
        checkSalaryMore();
    }
}
