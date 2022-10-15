package les7.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import les7.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
