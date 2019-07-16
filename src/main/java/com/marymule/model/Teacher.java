package com.marymule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Teacher.
 */
@Entity
@Table(name = "teachers")
public class Teacher {
	
	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The first name. */
	@Column(name="firstName")
	private String firstName;
	
	/** The last name. */
	@Column(name="lastName")
	private String lastName;
	
	/** The address. */
	@Column(name="address")
	private String address;
	
	/** The city. */
	@Column(name="city")
	private String city;
	
	/** The phone number. */
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	/** The salary. */
	@Column(name="salary")
	private int salary;
	
	
	/**
	 * Instantiates a new teacher.
	 */
	public Teacher() { }


	/**
	 * Instantiates a new teacher.
	 *
	 * @param id the id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param address the address
	 * @param city the city
	 * @param phoneNumber the phone number
	 * @param salary the salary
	 */
	public Teacher(int id, String firstName, String lastName, String address, String city, String phoneNumber,
			int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
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
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}


	/**
	 * Sets the salary.
	 *
	 * @param salary the new salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", phoneNumber=" + phoneNumber + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
