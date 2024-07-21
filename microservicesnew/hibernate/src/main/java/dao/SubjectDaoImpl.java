package dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



import hibernates.utils;

import model.Subject;
public class SubjectDaoImpl implements SubjectDao{
	private SessionFactory sessionFactory;
	
	public SubjectDaoImpl() {
		sessionFactory = utils.getSessionFactory();
	}
	
	
	
	
	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Subject> subjects = session.createQuery("from Subject").list();
		transaction.commit();
		return subjects;
	}

	@Override
	public Subject getSubject(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = session.get(Subject.class, id);
		session.close();
		transaction.commit();
		return subject;
	}

	@Override
	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(subject);
		transaction.commit();
		session.close();
		transaction.commit();
		return subject;
	}

	@Override
	public void deleteSubject(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = session.get(Subject.class, id);
		session.remove(subject);
		transaction.commit();
		session.clear();

		
	}
	
}
