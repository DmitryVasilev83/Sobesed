package les5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDAO {

    private final SessionFactory sessionFactory;


    public StudentDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Student> index() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select s from Student s", Student.class)
                .getResultList();
    }

    public Student show(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    public void save(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.save(student);
    }

    public void update(int id, Student updatedStudent) {
        Session session = sessionFactory.getCurrentSession();
        Student studentToBeUpdated = session.get(Student.class, id);

        studentToBeUpdated.setName(updatedStudent.getName());
        studentToBeUpdated.setMark(updatedStudent.getMark());

    }

    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(session.get(Student.class, id));
    }
}
