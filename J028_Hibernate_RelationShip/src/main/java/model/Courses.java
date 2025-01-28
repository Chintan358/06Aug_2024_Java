package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="subname")
	private String subName;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name="insid")
	Instructor instructor;
	
	@ManyToMany
	@JoinTable(		
			name = "std_course",
			joinColumns = @JoinColumn(name="cid"),
			inverseJoinColumns = @JoinColumn(name="stid")
			)
	List<Student> stduents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public List<Student> getStduents() {
		return stduents;
	}

	public void setStduents(List<Student> stduents) {
		this.stduents = stduents;
	}
	
	
	public void addStudent(Student s)
	{
		if(stduents==null)
		{
			stduents=new ArrayList<Student>();
		}
		stduents.add(s);
	}
	
}
