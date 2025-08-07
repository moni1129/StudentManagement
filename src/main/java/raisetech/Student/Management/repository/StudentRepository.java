package raisetech.Student.Management.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentCourses;

/**
 * 受講生情報を扱うリポジトリ
 *
 * 全権検索や単一条件での検索、コース情報の検索が行えるクラスです。
 */
@Mapper
public interface StudentRepository {

  /**
   *
   * @return　全件検索した受講生情報の一覧
   */
  @Select("SELECT * FROM students")
  List<Student> search();

  @Select("SELECT * FROM students WHERE age>=30")
  List<Student> searchlist();

  @Select("SELECT * FROM student_courses")
  List<StudentCourses> searchCourse();

  @Select("SELECT * FROM student_courses WHERE course_name like 'Java%'")
  List<StudentCourses> searchCourselist();
}


