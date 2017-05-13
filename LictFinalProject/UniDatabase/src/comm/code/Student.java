package comm.code;

public class Student {
	private int studentID;
	private String studentName;
	private String fatherName;
	private String motherName;
	private String sex;
	private String address;
	private String year;
	private String pass;
	private String dept;
	public Student() {
		super();
	}
	public Student(int studentID, String studentName, String fatherName,
			String motherName, String sex, String address, String year, String pass, String dept) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.sex = sex;
		this.address = address;
		this.year = year;
		this.pass=pass;
		this.dept=dept;
	}
	

	public Student(int studentID, String studentName, String fatherName,
			String motherName, String sex, String address, String year, String pass) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.sex = sex;
		this.address = address;
		this.year = year;
		this.pass=pass;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
}
