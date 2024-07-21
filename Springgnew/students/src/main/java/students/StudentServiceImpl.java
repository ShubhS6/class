package students;
import java.util.*;


public class StudentServiceImpl implements StudentService {
	StudentDao dao;
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}
	
	public StudentServiceImpl() {
		super();
		this.dao = new StudentDaoImpl();
	}
}
