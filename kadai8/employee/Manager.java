package kadai8.employee;

public class Manager extends Employee {

	String position;

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
		System.out.println("役職:" + position);
	}

	public void evaluation(Employee employee, String score) {
		System.out.println(this.name + "さんは"+ employee.getName() + "さんを" + score + "評価にしました。");
	}

}
