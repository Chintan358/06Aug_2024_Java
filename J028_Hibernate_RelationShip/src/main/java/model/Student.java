package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="stname")
	private String stName;
	
	@ManyToMany
	@JoinTable(	
			name = "std_course",
			joinColumns = @JoinColumn(name="stid"),
			inverseJoinColumns = @JoinColumn(name="cid")
			)
	List<Courses> courses;
	
	@ManyToMany
	@JoinTable(
			
			name = "std_ins",
			joinColumns = @JoinColumn(name="stid"),
			inverseJoinColumns = @JoinColumn(name="iid")
			)
	List<Instructor> instructors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}
	
	public void addCourse(Courses c)
	{
		if(courses==null)
		{
			courses=  new ArrayList<Courses>();
		}
		courses.add(c);
	}
	
	public void addInstructor(Instructor ins)
	{
		if(instructors==null)
		{
			instructors = new ArrayList<Instructor>();
		}
		instructors.add(ins);
	}
	
}
