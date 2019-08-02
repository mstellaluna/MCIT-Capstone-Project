package com.marymule.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * The Class Results.
 */

@Entity(name = "Results")
@Table(name= "results")
public class Results {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/** The session. */
	@NotNull(message = "Session must be between 101 and 1299.")
	@Min(101)
	@Max(1299)
	@Column(name = "session")
	private int session;
	
	/** The mark. */
	@NotNull(message = "Mark must be between 0 and 20.")
	@Min(0)
	@Max(20)
	@Column(name = "mark")
	private int mark;
	
    @Transient
    private int studentID;
    @Transient
    private int courseID;    

	 @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	  @JoinColumn(name = "student_id")
	    private Student studentResult;
	    
	    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	    @JoinColumn(name = "course_id")
	    private Course courseResult;
	    


	public Results() { }
	
	

	public Results(int id, @NotNull(message = "Session must be between 101 and 1299.") @Min(101) @Max(1299) int session,
			@NotNull(message = "Mark must be between 0 and 20.") @Min(0) @Max(20) int mark, int studentID,
			int courseID) {
		this.id = id;
		this.session = session;
		this.mark = mark;
		this.studentID = studentID;
		this.courseID = courseID;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSession() {
		return session;
	}

	public void setSession(int session) {
		this.session = session;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Student getStudentResult() {
		return studentResult;
	}

	public void setStudentResult(Student studentResult) {
		this.studentResult = studentResult;
	}

	public Course getCourseResult() {
		return courseResult;
	}

	public void setCourseResult(Course courseResult) {
		this.courseResult = courseResult;
	}
	
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		return "Results [id=" + id + ", session=" + session + ", mark=" + mark + ", studentResult=" + studentResult
				+ ", courseResult=" + courseResult + "]";
	}
	

	




	

    
    
	
	
	
	

}
