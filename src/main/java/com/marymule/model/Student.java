package com.marymule.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The Class Student.
 */

@Entity
@Table(name="students")
public class Student {
	
	
	
	/** The id. */
	@Id
	@Column(name = "student_id", length = 6)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	/** The first name. */
	@Column(name = "firstName", length = 20)
	private String firstName;
	
	/** The last name. */
	@Column(name = "lastName", length = 20)
	private String lastName;
	
	/** The address. */
	@Column(name = "address", length = 255)
	private String address;
	
	/** The city. */
	@Column (name = "city", length = 255)
	private String city;
	
	/** The country. */
	@Transient
	private String country;
	
	@Transient
	/** The phone number. */
	private String phoneNumber; 
	
	@Transient
	/** The major. */
	private String major;
	
	@Transient
	/** The email address. */
	private String emailAddress;
	

	/**
	 * Instantiates a new student.
	 */
	public Student() {}


	/**
	 * Instantiates a new student.
	 *
	 * @param id the id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param address the address
	 * @param city the city
	 * @param country the country
	 * @param phoneNumber the phone number
	 * @param major the major
	 * @param emailAddress the email address
	 */
	public Student(int id, String firstName, String lastName, String address, String city, String country,
			String phoneNumber, String major, String emailAddress) {
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


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/**
	 * Gets the major.
	 *
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * Sets the major.
	 *
	 * @param major the new major
	 */
	public void setMajor(String major) {
		this.major = major;
	}


	/**
	 * Gets the email address.
	 *
	 * @return the email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}


	/**
	 * Sets the email address.
	 *
	 * @param emailAddress the new email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", country=" + country + ", phoneNumber=" + phoneNumber + ", major=" + major
				+ ", emailAddress=" + emailAddress + "]";
	}


	


	
	
	
	

}
