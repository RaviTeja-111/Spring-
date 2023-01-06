package springWeb.Model;

import javax.persistence.*;

@Entity
public class Person {

	@Id
	private int id;
	private String pName;
	private String email;
	private String password;
	private String city;
	private String gender;
	private long phNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pName=" + pName + ", email=" + email + ", password=" + password + ", city="
				+ city + ", gender=" + gender + ", phNo=" + phNo + "]";
	}
	
	
}
