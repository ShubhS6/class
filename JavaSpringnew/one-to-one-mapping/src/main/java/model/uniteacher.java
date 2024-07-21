package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="uniteacher")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class uniteacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subjectid", referencedColumnName = "id")
	private unisubject subjectid;
	public uniteacher(int id, String name, unisubject subjectid) {
		super();
		this.id = id;
		this.name = name;
		this.subjectid = subjectid;
	}
	public uniteacher(int id2, String name2, int i) {
		// TODO Auto-generated constructor stub
	}
	
	
}
