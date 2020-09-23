package pers.fzm.studentevaluation.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.fzm.studentevaluation.dao.ScoresDao;
import pers.fzm.studentevaluation.dao.StudentDao;
import pers.fzm.studentevaluation.domain.MyUser;
import pers.fzm.studentevaluation.domain.Student;
import pers.fzm.studentevaluation.domain.StudentScores;
import pers.fzm.studentevaluation.service.StudentService;

import java.util.List;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ScoresDao scoresDao;

    @Override
    public List<Student> findAll(int pageNum, int pageSize) {
        MyUser myUser = (MyUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String department = myUser.getDepartment();
        PageHelper.startPage(pageNum, pageSize);
        List<Student> students = studentDao.findAll(department);
        return students;
    }

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
        scoresDao.addStudent(student.getStudentId());
    }

    @Override
    public Student findStudent(String studentId) {
        Student student = studentDao.findStudent(studentId);
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.removeStudent(student.getStudentId());
        studentDao.addStudent(student);
    }

    @Override
    public void removeStudent(String studentId) {
        studentDao.removeStudent(studentId);
    }

    @Override
    public void removeStudents(String[] studentIds) {
        for (String studentId : studentIds) {
            studentDao.removeStudent(studentId);
        }
    }

    @Override
    public List<Student> studentSearch(int pageNum, int pageSize, String val) {
        PageHelper.startPage(pageNum, pageSize);
        List<Student> studentByDesc = studentDao.findStudentByDesc(val);
        return studentByDesc;
    }
}
