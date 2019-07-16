package com.marymule.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */

@Entity
@Table(name="students")
public class Student {
	
	
	
	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The first name. */
	@Column(name = "firstName")
	private String firstName;
	
	/** The last name. */
	@Column(name = "lastName")
	private String lastName;
	
	/** The address. */
	@Column(name = "address")
	private String address;
	
	/** The city. */
	@Column (name = "city")
	private String city;
	
	/** The country. */
	@Column (name = "country")
	private String country;
	
	
	/** The phone number. */
	@Column (name = "phoneNumber")
	private String phoneNumber; 
	
	
	/** The major. */
	@Column (name = "major")
	private String major;
	

	/** The email address. */
	@Column (name = "emailAddress")
	private String emailAddress;
	

	/**
	 * Instantiates a new student.
	 */
	public Student() {}


	public Student(int id, String firstName, String lastName, String address, String city, String country,
			String phoneNumber, String major, String emailAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.emailAddress = emailAddress;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", country=" + country + ", phoneNumber=" + phoneNumber + ", major=" + major
				+ ", emailAddress=" + emailAddress + "]";
	}

   
	

	


	


	
	
	
	

}
