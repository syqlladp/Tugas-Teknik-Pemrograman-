import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {

    public static void main(String[] args) {

        // Buat service
        EmployeeService service = new EmployeeService();

        // Buat Department
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        // Buat EmploymentType
        EmploymentType fullTime = new EmploymentType("Full Time");
        EmploymentType contract = new EmploymentType("Contract");

        // Buat Employee
        Employee emp1 = new Employee(1, "Andi", fullTime, 8000000);
        emp1.setDepartment(itDept);

        Employee emp2 = new Employee(2, "Siti", contract, 5000000);
        emp2.setDepartment(hrDept);

        // Tambahkan ke service
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        // Tampilkan sebelum kenaikan gaji
        System.out.println("=== SEBELUM NAIK GAJI ===");
        printEmployee(service.getEmployee(1));
        printEmployee(service.getEmployee(2));

        // Naikkan gaji 10% untuk ID 1
        service.raiseSalary(1, 10);

        System.out.println("\n=== SETELAH NAIK GAJI 10% (ID 1) ===");
        printEmployee(service.getEmployee(1));
        printEmployee(service.getEmployee(2));
    }

    public static void printEmployee(Employee emp) {
        if (emp != null) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Nama: " + emp.getName());
            System.out.println("Department: " + emp.getDepartment().getName());
            System.out.println("Tipe: " + emp.getType().getType());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("------------------------");
        }
    }
}