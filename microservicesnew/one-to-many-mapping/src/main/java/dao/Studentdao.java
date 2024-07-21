package dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Student;
@Repository
public interface Studentdao extends JpaRepository<Student,Long>{

}
