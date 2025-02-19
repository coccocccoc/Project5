package reference.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		Employee departmentHead = new Employee(null, 0, 0, 0);
		Employee chiefResearcher = new Employee(null, 0, 0, 0);
		Employee principalResearcher = new Employee(null, 0, 0, 0);

		Department department = new Department(departmentHead, chiefResearcher, principalResearcher);

	}

}

// 직원
class Employee {
	String name; // 이름
	int age; // 나이
	int pay; // 월급
	int yearsOfService; // 근속년수

	public Employee(String name, int age, int pay, int yearsOfService) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.yearsOfService = yearsOfService;
	}

}

// 부서
class Department {
	Employee departmentHead; // 부서장
	Employee chiefResearcher; // 수석연구원
	Employee principalResearcher; // 책임연구원

	public Department(Employee departmentHead, Employee chiefResearcher, Employee principalResearcher) {
		super();
		this.departmentHead = departmentHead;
		this.chiefResearcher = chiefResearcher;
		this.principalResearcher = principalResearcher;
	}

}
