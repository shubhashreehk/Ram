package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id

private int empid;
private String empname;
private String Address;
private String Gender;
private String Email;
private String Date;
private String country;

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}


}
