package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.err.println("Name cannot be empty!");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender!");
            return;
        }
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            System.err.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Salary cannot be zero or negative");
            System.exit(0);
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative

 */
