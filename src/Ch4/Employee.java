package Ch4;

import java.time.LocalDate;

public class Employee {
	// data members
	// 实例变量
	private String name;
	private double salary;
	private LocalDate birthDate;
	
	// methods
	// 构造方法：完成数据成员的初始化
	// 构造方法和类同名，没有返回值这一项
	// 如果一个类没有定义构造方法，JVM会为你自动追加一个默认的构造方法
	// 特点：无参，方法体为空
	// 如果一个类明确地定义了构造方法(可以有参，也可以没参)，JVM不会再自动追加默认的构造方法

	// 构造方法允许重载
	// 重载：overloading，一组方法，同名，参数列表不一样
	// 个数、顺序、类型，三者中任意一项或者多项
	// 当调用这些同名方法时，编译器会根据你传进来的参数，来决定到底调用哪一个方法
	// 行为->方法重载
	public Employee() {
		
	}
	
	public Employee(String name) {
		// 区分了实例变量和方法参数命名的混淆
		this.name = name;
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// 一个构造方法可以调用另外一个构造方法
	// 使用this关键字，而且必须在当前构造方法的第一句话
	public Employee(String name, double salary, LocalDate birthDate) {
		this(name, salary); // 调用了上面两个参的构造方法
		this.birthDate = birthDate;
	}
	

	// getters & setters
	// getters获取属性的值，get开头+属性，驼峰法，没有参数，返回值就是对应属性的类型
	public String getName() {
		return name;
	}
	// setters设置属性的值，set开头+属性，驼峰法，有参数，参数要设定的新值，没有返回值
	public void setName(String newName) {
		this.name = newName;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public static void main(String[] args) {
		// 局部变量
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("zhangsan");
		Employee emp3 = new Employee("lisi", 8000);
		Employee emp4 = new Employee("wangwu", 15000, LocalDate.of(1985, 10, 15));
	}

}
