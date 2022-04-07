package day30_CustomClass;

public class Employee {

    public String name;
    public int ID;
    public char gender;
    public String jobtitle;
    public double salary;
    public boolean isFullTime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, int ID, char gender, String jobtitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void work(){
        System.out.println(name+ " should work now");
    }

    public void breakTime(){
        System.out.println(name+" can give break");
    }


}
/*
toString(), setInfo(),
 */
