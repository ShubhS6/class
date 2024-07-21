package AppController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dao.NewPostdao;
import dao.NewStudentdao;
import model.Student;
import model.NewPost;
import model.Post;
@SpringBootApplication
public class controller implements CommandLineRunner{
	@Autowired
	private NewPostdao postDao;
	
	
	@Autowired
	private NewStudentdao studentsdao;
	

	public static void main(String[] args) {
		SpringApplication.run(controller.class, args);
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student(9001L,"M");
		Student student2 = new Student(9002L,"A");
		Student student3 = new Student(9003L,"G");
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		

		Student student4 = new Student(9001L,"ng");
		Student student5 = new Student(9002L,"na");
		Student student6 = new Student(9003L,"av");
		List<Student> students1 = new ArrayList<>();
		students1.add(student4);
		students1.add(student5);
		students1.add(student6);
		Post post = new Post(1001L,"First Post",students);
		
		Post post1 = new Post(1002L,"Second Post",students1);
		
		postDao.save(post);
		postDao.save(post1);
		
		
		System.out.println("one2many mapping done..");
		
		//fetching the data
		Iterable<NewPost> cmts = postDao.findAll();
		cmts.forEach(System.out::println);
	}
		
}
