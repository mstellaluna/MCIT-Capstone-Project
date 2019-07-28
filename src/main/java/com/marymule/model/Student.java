package com.marymule.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * The Class Student.
 */

@Entity(name = "Student")
@Table(name= "students")
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
	
	 @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	    @JoinTable(name = "student_in_course",
	            joinColumns = { @JoinColumn(name="course_id") },
	            inverseJoinColumns = { @JoinColumn(name = "student_id") })
	    private Set<Student> studentsRegistered = new HashSet<>();


	/**
	 * Instantiates a new student.
	 */
	public Student() {}



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



	public Set<Student> getStudentsRegistered() {
		return studentsRegistered;
	}



	public void setStudentsRegistered(Set<Student> studentsRegistered) {
		this.studentsRegistered = studentsRegistered;
	}




	
	


	}


	
  
	



	



    
	
	

    

	




   
	

	


	
	
	
	


