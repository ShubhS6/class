package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="new_post")
public class NewPost {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "post1", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NewStudent> students = new ArrayList<>();
    
	public NewPost() {

	}

	public NewPost(Long id, String name, List<NewStudent> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NewStudent> getStudents() {
		return students;
	}

	public void setStudents(List<NewStudent> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "NewPost [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
		


}
