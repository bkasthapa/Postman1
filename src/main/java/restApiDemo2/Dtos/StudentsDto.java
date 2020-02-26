package restApiDemo2.Dtos;

import java.io.Serializable;

public class StudentsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String address;
	private String emailAddress;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentsDto [name=" + name + ", address=" + address + ", emailAddress=" + emailAddress + ", gender="
				+ gender + "]";
	}

}
