package service;

import java.util.List;


import dao.SubjectDao;
import dao.SubjectDaoImpl;
import model.Subject;

public class SubjectServiceImpl implements SubjectService {
	SubjectDao dao;
	
	public SubjectServiceImpl() {
		dao = new SubjectDaoImpl();
	}
	
	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return dao.getAllSubjects();
	}

	@Override
	public Subject getSubject(int id) {
		// TODO Auto-generated method stub
		return dao.getSubject(id);
	}

	@Override
	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
		return dao.addSubject(subject);
	}

	@Override
	public void deleteSubject(int id) {
		// TODO Auto-generated method stub
		dao.deleteSubject(id);
		
	}

}
