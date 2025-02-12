package kadai8.employee;

public class Engineer extends Employee {

	String language;

	public Engineer(String name, int salary, String language) {
		super(name, salary);
		this.language = language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("言語:" + language);
	}
}
