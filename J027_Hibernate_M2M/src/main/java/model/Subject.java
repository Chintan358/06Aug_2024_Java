package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="subname")
	String subName;
	
	@ManyToMany
	@JoinTable(
			name = "std_sub",
			joinColumns = @JoinColumn(name="subid"),
			inverseJoinColumns = @JoinColumn(name="stid")
			)
	List<Student> students;

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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student st)
	{
		if(students==null)
		{
			students = new ArrayList<Student>();
		}
		students.add(st);
	}
	
}
