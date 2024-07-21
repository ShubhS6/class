package students;

public class StudentController {
	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		service.getAllStudent().forEach(System.out::println);
	}
}
