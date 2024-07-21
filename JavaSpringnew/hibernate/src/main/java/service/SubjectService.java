package service;
import java.util.List;

import model.Subject;


public interface SubjectService {
	public List<Subject> getAllSubjects();
	public Subject getSubject(int id);
	public Subject addSubject(Subject subject);
	public void deleteSubject(int id);
	
}
