package bean;

public class Employee {
	
	private int eId;
	private String name;
	private float salary;
	private String address;
	private int exp;
	public Employee()
	{
		
	}
	public Employee(int eId, String name, float salary, String address, int exp) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.exp = exp;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", address=" + address + ", exp="
				+ exp + "]";
	}
	
	

}
