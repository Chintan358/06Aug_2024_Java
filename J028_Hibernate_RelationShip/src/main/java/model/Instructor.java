package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="insname")
	private String insName;
	
	@OneToOne(cascade = CascadeType.ALL,fetch  =FetchType.EAGER)
	@JoinColumn(name="ytchannel")
	YoutubeChannel ytChannel;
	
	@OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<Courses> courses;
	
	@ManyToMany
	@JoinTable(
			
			name = "std_ins",
			joinColumns = @JoinColumn(name="iid"),
			inverseJoinColumns = @JoinColumn(name="stid")
			)
	List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}

	public YoutubeChannel getYtChannel() {
		return ytChannel;
	}

	public void setYtChannel(YoutubeChannel ytChannel) {
		this.ytChannel = ytChannel;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student s)
	{
		if(students==null)
		{
			students=new ArrayList<Student>();
		}
		students.add(s);
	}
}
