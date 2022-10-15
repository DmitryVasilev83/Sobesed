package les7.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import les7.models.Student;
import les7.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findOne(int id) {
        Optional<Student> foundStudent = studentRepository.findById(id);
        return foundStudent.orElse(null);
    }

    @Transactional
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Transactional
    public void update(int id, Student updatedStudent) {
        updatedStudent.setId(id);
        studentRepository.save(updatedStudent);
    }

    @Transactional
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}
