package pers.fzm.studentevaluation.service;

import pers.fzm.studentevaluation.domain.Student;
import pers.fzm.studentevaluation.domain.StudentScores;

import java.util.List;

public interface StudentService {

    //查询所有学生信息
    List<Student> findAll(int pageNum, int pageSize);

    //添加学生
    void addStudent(Student student);

    //查询学生
    Student findStudent(String studentId);

    //更改学生信息
    void updateStudent(Student student);

    //删除学生
    void removeStudent(String studentId);

    //删除多个学生
    void removeStudents(String[] studentIds);

    //搜索学生
    List<Student> studentSearch(int pageNum,int pageSize,String val);


}
