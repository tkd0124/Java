package kadai8;

import kadai8.employee.Employee;
import kadai8.employee.Engineer;
import kadai8.employee.Manager;

public class Kadai8_6 {

	public static void main(String[] args) {

		Employee[] employees = {
				new Manager("山田太郎",  700000, "部長"),
				new Engineer("鈴木次郎", 300000, "Java"),
				new Manager("佐藤花子",  500000, "課長"),
				new Engineer("田中三郎", 250000, "C++")
		};

		System.out.println("従業員情報");
		for (Employee employee : employees) {
			employee.print();
			System.out.println();
		}

		Manager manager1 = (Manager) employees[0];
		manager1.evaluation(employees[1], "A");

		Manager manager2 = (Manager) employees[2];
		manager2.evaluation(employees[3], "S");
	}
}
