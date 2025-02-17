package k9.shape;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void print(){
        System.out.println("名前：" + this.name);
        System.out.println("給料：" + this.salary);
    }
}
