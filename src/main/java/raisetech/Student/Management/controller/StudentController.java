package raisetech.Student.Management.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentCourses;
import raisetech.Student.Management.service.StudentService;

@RestController
public class StudentController {

  private StudentService service;

  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentList(){
    return service.searchStudentList();
  }

  @GetMapping("/studentsList")
  public List<Student> getStudentLists(){
    return service.searchStudentLists();
  }

  @GetMapping("/studentsCourseList")
  public List<StudentCourses> getStudentCourseList(){
    return service.searchStudentCourseList();
  }
  @GetMapping("/studentsCourseLists")
  public List<StudentCourses> getStudentCourseLists(){
    return service.searchStudentCourseLists();
  }
}
