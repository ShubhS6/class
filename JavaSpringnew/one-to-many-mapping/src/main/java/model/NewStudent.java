package model;

import model.NewPost;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="new_students")
public class NewStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String students;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id")
	private NewPost post1;
	public NewStudent() {
		super();
	}
	public NewStudent(long id, String students, model.NewPost post1) {
		super();
		this.id = id;
		this.students = students;
		this.post1 = post1;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudents() {
		return students;
	}
	public void setStudents(String students) {
		this.students = students;
	}
	public NewPost getPost1() {
		return post1;
	}
	public void setPost1(NewPost post1) {
		this.post1 = post1;
	}
	@Override
	public String toString() {
		return "NewStudent [id=" + id + ", students=" + students + "]";
	}
	
}
