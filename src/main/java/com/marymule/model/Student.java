package com.marymule.model;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * The Class Student.
 */

@Entity(name = "Student")
@Table(name = "student")
public class Student {

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Column(name = "city")
	private String city;

	/** The country. */
	@NotEmpty(message = "Country is required")
	@Column(name = "country")
	private String country;

	/** The phone number. */
	@NotEmpty(message = "Phone Number is required")
	@Column(name = "phoneNumber")
	private String phoneNumber;

	/** The major. */
	@NotEmpty(message = "Major is required")
	@Column(name = "major")
	private String major;

	/** The email address. */
	@NotEmpty(message = "Email is required")
	@Email(message = "Please enter a valid email address")
	@Column(name = "emailAddress")
	private String emailAddress;

	/** The courses registered. */
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "student_in_course", joinColumns = { @JoinColumn(name = "course_id") }, inverseJoinColumns = {
			@JoinColumn(name = "student_id") })
	private Set<Course> coursesRegistered = new HashSet<>();

	/** The results. */
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "studentResult")
	private List<Results> results;

	/** The payments. */
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "studentPayments")
	private List<Payment> payments;

	/**
	 * Instantiates a new student.
	 */
	public Student() { }

	

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

	/**
	 * Gets the courses registered.
	 *
	 * @return the courses registered
	 */
	public Set<Course> getCoursesRegistered() {
		return coursesRegistered;
	}

	/**
	 * Sets the courses registered.
	 *
	 * @param coursesRegistered the new courses registered
	 */
	public void setCoursesRegistered(Set<Course> coursesRegistered) {
		this.coursesRegistered = coursesRegistered;
	}

	/**
	 * Gets the results.
	 *
	 * @return the results
	 */
	public List<Results> getResults() {
		return results;
	}

	/**
	 * Sets the results.
	 *
	 * @param results the new results
	 */
	public void setResults(List<Results> results) {
		this.results = results;
	}

	/**
	 * Gets the payments.
	 *
	 * @return the payments
	 */
	public List<Payment> getPayments() {
		return payments;
	}

	/**
	 * Sets the payments.
	 *
	 * @param payments the new payments
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", country=" + country + ", phoneNumber=" + phoneNumber + ", major=" + major
				+ ", emailAddress=" + emailAddress + ", coursesRegistered=" + coursesRegistered + ", results=" + results
				+ "]";
	}

}
