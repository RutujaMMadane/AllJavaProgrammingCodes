package Bean;

public class Student {
	
	private int studentid;
	private String firstname;
	private String lastname;
	private String date_of_birth;
	private int age;
	private String gender;
	private String address;
	private String phone_no;
	public Student()
	{
		
	}
	public Student(int studentid,String firstname,String lastname,String date_of_birth,int age,String gender,String address,String phone_no)
	{
		super();
		this.studentid=studentid;
		this.firstname=firstname;
		this.lastname=lastname;
		this.date_of_birth=date_of_birth;
		this.age=age;
		this.gender=gender;
		this.address=address;
		this.phone_no=phone_no;	
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", date_of_birth=" + date_of_birth + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", phone_no=" + phone_no + "]";
	}
	

}
