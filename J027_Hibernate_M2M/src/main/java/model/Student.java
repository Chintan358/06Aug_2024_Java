package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="stname")
	String stName;
	
	@ManyToMany
	@JoinTable(
			name = "std_sub",
			joinColumns = @JoinColumn(name="stid"),
			inverseJoinColumns = @JoinColumn(name="subid")
			)
	List<Subject> subjects;

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

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubject(Subject s)
	{
		if(subjects==null)
		{
			subjects = new ArrayList<Subject>();
		}
		subjects.add(s);
	}
	
	
}
