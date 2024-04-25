package J15;

import javax.swing.JOptionPane;

public class J151_inherittest {

	public static void main(String[] args) {
		J151_Employee e1 = new J151_Employee("Andy", "A123456789", 90000);
		e1.displayformation();

		J151_Employee e2 = new J151_Employee("Cindy", "B123456789", 50000);
		e2.raiseSalary(5000);
		e2.displayformation();

		J151_Engineer e3 = new J151_Engineer("Amy", "C123456789", 150000);
		e3.addskill("JAVA");
		e3.addskill("PYTHON");
		e3.addskill("C++");
		e3.displayformation();

		J151_Manager m4 = new J151_Manager("David", "D123456789", 250000, "台北總部");
		m4.displayformation();

		J151_Director d5 = new J151_Director("Betty", "E123456789", 3700000, "高雄分部", 700000);
		d5.displayformation();

	}

}

//Employee--begin
class J151_Employee {
	private static int empID = 100;
	private String name;
	private String ssn;
	private double salary;

	public J151_Employee(String name, String ssn, double salary) {
		empID++;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void raiseSalary(double increase) {
		if (increase > 0) {
			salary += increase;
		} else {
			JOptionPane.showMessageDialog(null, "加薪必須大於0");
		}
	}

	public void displayformation() {
		System.out.println("==========員工資料==========");
		System.out.println("員工編號:" + empID);
		System.out.println("員工姓名:" + name);
		System.out.println("身分證號:" + ssn);
		System.out.println("員工薪資:" + salary);
	}
}
//Employee--end

//Engineer--begin
class J151_Engineer extends J151_Employee {
	private String[] skills = new String[5];
	private int skillCount;

	//Source -> Generate Constructors from Superclass
	public J151_Engineer(String name, String ssn, double salary) {
		super(name, ssn, salary);
	}

	public void addskill(String skill) {
		if (skillCount < skills.length) {
			skills[skillCount++] = skill;
		} else {
			JOptionPane.showMessageDialog(null, "技能只能有5項");
		}
	}
	
	//Source -> Override/Implement Methods
	@Override
	public void displayformation() {
		super.displayformation();
		System.out.println("技能如下:");
		for (String x : skills) {
			if (x != null) {
				System.out.print(x + "\t");
			}
		}
		System.out.println();
	}
}
//Engineer--end

//Manager--begin
class J151_Manager extends J151_Employee {
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public J151_Manager(String name, String ssn, double salary, String deptName) {
		super(name, ssn, salary);
		this.deptName = deptName;
	}

	@Override
	public void displayformation() {
		super.displayformation();
		System.out.println("部門名稱:" + deptName);
	}

}
//Manager--end

//Director--begin
class J151_Director extends J151_Manager {
	private double budget;

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public J151_Director(String name, String ssn, double salary, String deptName, double budget) {
		super(name, ssn, salary, deptName);
		this.budget = budget;
	}

	@Override
	public void displayformation() {
		super.displayformation();
		System.out.println("預算經費:" + budget);
	}

}
//Director--end