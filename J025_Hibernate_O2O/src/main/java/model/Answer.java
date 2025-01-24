package model;

import javax.persistence.*;

@Entity
@Table(name="answer")
public class Answer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="answer")
	String anwser;
	
	@OneToOne(mappedBy = "ans",cascade = CascadeType.ALL)
	Questions que;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnwser() {
		return anwser;
	}

	public void setAnwser(String anwser) {
		this.anwser = anwser;
	}

	public Questions getQue() {
		return que;
	}

	public void setQue(Questions que) {
		this.que = que;
	}
	
	
}
