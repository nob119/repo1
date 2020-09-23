package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.Student;

import java.util.List;

@Repository
public interface StudentDao {

    //查询所有学生信息
    @Select("select * from student where des like '%${des}%' ORDER BY student_id ASC ")
    @Results(id = "studentResultsMap",value = {
            @Result(property = "studentId",column = "student_id"),
            @Result(property = "studentName",column = "student_name"),
            @Result(property = "gender",column = "gender"),
            @Result(property = "grade",column = "grade"),
            @Result(property = "classname",column = "classname"),
            @Result(property = "profession",column = "profession"),
            @Result(property = "institute",column = "institute"),
            @Result(property = "political_status",column = "political_status"),
            @Result(property = "evalScore",column = "eval_score")
    })
    List<Student> findAll(@Param("des")String des);

    //添加学生
    @Insert("insert into student(student_id,student_name,gender,grade,classname,profession,institute,political_status,des)"
            + "values(#{studentId},#{studentName},#{gender},#{grade},#{classname},#{profession},#{institute},#{political_status},#{des})")
    void addStudent(Student student);

    //查询学生
    @Select("select * from student where student_id=#{studentId}")
    @ResultMap("studentResultsMap")
    Student findStudent(String studentId);

    //删除学生
    @Delete("delete from student where student_id=#{studentId}")
    void removeStudent(String studentId);

    //搜索学生
    @Select("select * from student where des like '%${des}%'")
    @ResultMap("studentResultsMap")
    List<Student> findStudentByDesc(@Param("des")String des);

    //计算测评分数
    @Update("update student set eval_score=#{score} where student_id=#{studentId}")
    void calEvalScore(@Param("score") double score,@Param("studentId") String studentId);
}
