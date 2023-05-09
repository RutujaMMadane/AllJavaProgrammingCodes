package jdbc;

public class Employee {
	
	private int id;
	private String eName;
	private float salary;
	private int age;
	public Employee()
	{
		
	}
	public Employee(int id, String eName, float salary, int age) {
		super();
		this.id = id;
		this.eName = eName;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	

}
