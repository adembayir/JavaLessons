package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeId;
    private String jobTitle;
    private double salary;

    public void setEmployeeId(int employeeId) {
        if(employeeId <= 0) {
            System.out.println("Invalid employee ID!");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank() || jobTitle.isEmpty()) {
            System.err.println("Job title cannot be blank or empty!");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public void setSalary (double salary) {
        if(salary <= 0) {
            System.err.println("It's employee class, not SLAVE class!");
            System.exit(1);
        }
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void work() {
        System.out.println(getName() + "is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */
