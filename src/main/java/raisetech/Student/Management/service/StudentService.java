package raisetech.Student.Management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentCourses;
import raisetech.Student.Management.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    return repository.search();
  }

  public List<Student> searchStudentLists() {
    return repository.searchlist();
  }

  public List<StudentCourses> searchStudentCourseList() {
    return repository.searchCourse();
  }

  public List<StudentCourses> searchStudentCourseLists() {
    return repository.searchCourselist();
  }
}

