package k9.shape;

public class Manager extends Employee {
    private String position;

    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("役職：" + this.position);
    }

    public void evaluation(Employee e, String grade){
        System.out.println(getName() + "さんは" + e.getName() + "さんを" + grade + "にしました。");
    }
}
