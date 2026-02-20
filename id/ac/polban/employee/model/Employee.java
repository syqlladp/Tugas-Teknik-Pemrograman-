package id.ac.polban.employee.model;

public class Employee {

    private static int counter = 0; // static field

    private int id; 
    private String name; 
    private Department department;
    private EmploymentType type;
    private double salary;


    public Employee (int id, String name, EmploymentType type, double salary){

        this.id = generateId();  //static method
        this.id = id;
        this.name = name;
        this.type = type; 
        this.salary = salary;
    }

    private static int generateId(){
        return counter++;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public EmploymentType getType() {
        return type;
    }

    public void setType(EmploymentType type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
