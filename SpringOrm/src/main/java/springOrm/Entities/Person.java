package springOrm.Entities;

import javax.persistence.*;

@Entity
public class Person {
	
	@Id
	@Column(name="id")
	private int pId;
	@Column(name="name")
	private String pName;
	private int age;
	@Column(name="PhoneNumber")
	private long phNo;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return " [pId=" + pId + ", pName=" + pName + ", age=" + age + ", phNo=" + phNo + "]";
	}
	

}
