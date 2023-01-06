package springJdbc.Entities;


public class Student {

	private int sId;
	private String sName;
	private String city;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		
	}
	public Student(int sId, String sName, String city) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.city = city;
	}

	
	@Override
	public String toString() {
		return "Student [Student Id=" + sId + ", Student Name=" + sName + ", city=" + city + "]";
	}
	
}
