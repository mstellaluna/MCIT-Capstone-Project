package com.marymule.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * The Class Student.
 */

@Entity(name = "Student")
@Table(name="students")
public class Student {
	
	
	
	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The first name. */
	@NotEmpty(message = "First Name is required")
	@Column(name = "firstName")
	private String firstName;
	
	/** The last name. */
	@NotEmpty(message = "Last Name is required")
	@Column(name = "lastName")
	private String lastName;
	
	/** The address. */
	@NotEmpty(message = "Address is required")
	@Column(name = "address")
	private String address;
	
	/** The city. */
	@NotEmpty(message = "City is required")
	@Column (name = "city")
	private String city;
	
	/** The country. */
	@NotEmpty(message = "Country is required")
	@Column (name = "country")
	private String country;
	
	
	/** The phone number. */
	@NotEmpty(message = "Phone Number is required")
	@Column (name = "phoneNumber")
	private String phoneNumber; 
	
	
	/** The major. */
	@NotEmpty(message = "Major is required")
	@Column (name = "major")
	private String major;
	

	/** The email address. */
	@NotEmpty(message = "Email is required")
	@Email(message="Please enter a valid email address")
	@Column (name = "emailAddress")
	private String emailAddress;
	
	/** The student's registered courses. */
	@OneToMany (mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderBy("id Asc")
	private Set<Course> registeredCourses = new HashSet<>();

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
