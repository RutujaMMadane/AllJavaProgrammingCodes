package ProtypeDesignPattern;

public class Employee implements Prototype {
	
	private int id;
	private String name;
	private String address;
	private float salary;
	public Employee()
	{
		System.out.println(id+name+address+salary);
	}
	public Employee(int id, String name, String address, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public void display()
	{
		System.out.println(id+name+address+salary);
	}
	public Prototype getClone()
	{
		return new Employee(id,name,address,salary);
	}
}
