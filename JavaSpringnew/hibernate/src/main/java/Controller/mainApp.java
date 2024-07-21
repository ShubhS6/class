package Controller;


import model.Subject;
import service.SubjectServiceImpl;

public class mainApp {
	public static void main(String[]args) {
		//Subject subject3 = new Subject(3,"Jackson",650);
		SubjectServiceImpl service = new SubjectServiceImpl();
		//service.addSubject(subject3);
		service.getAllSubjects().forEach(subject -> System.out.println(subject));
	}
}
