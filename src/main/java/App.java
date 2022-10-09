import les5.Student;
import les5.StudentDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {



        Configuration configuration = new Configuration().addAnnotatedClass(Student.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Student student1 = new Student("StudentTest1", "test1");
            Student student2 = new Student("StudentTest2", "test2");

            session.save(student1);
            session.save(student2);

            StudentDAO studentDAO = new StudentDAO(sessionFactory);
            studentDAO.update(11, new Student("StudentUpdated1", "110"));

            System.out.println(studentDAO.show(11).getName());




            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }

    }
}
