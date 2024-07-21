package dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.NewStudent;
@Repository
public interface NewStudentdao extends JpaRepository<NewStudent,Long> {

}
