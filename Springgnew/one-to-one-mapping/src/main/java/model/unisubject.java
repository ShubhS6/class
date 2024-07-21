package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "unisubject")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class unisubject {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
	public unisubject() {
		super();
	}
	public unisubject(int i, String string) {
		// TODO Auto-generated constructor stub
	}
    
    
}
