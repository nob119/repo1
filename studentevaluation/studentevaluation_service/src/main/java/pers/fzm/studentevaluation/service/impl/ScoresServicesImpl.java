package pers.fzm.studentevaluation.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import pers.fzm.studentevaluation.dao.CourseDao;
import pers.fzm.studentevaluation.dao.ProfessionDao;
import pers.fzm.studentevaluation.dao.ScoresDao;
import pers.fzm.studentevaluation.dao.StudentDao;
import pers.fzm.studentevaluation.domain.*;
import pers.fzm.studentevaluation.service.ScoresService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoresServicesImpl implements ScoresService {
    @Autowired
    private ScoresDao scoresDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ProfessionDao professionDao;
    @Autowired
    private CourseDao courseDao;

    //查询所有测评结果
    @Override
    public StudentEval findResultsById(String studentId) {
        StudentEval resultsById = scoresDao.findResultsById(studentId);
        return resultsById;
    }

    //查询某一学生的所有成绩
    @Override
    public List<StudentScores> findAcademicScoresById(String studentId) {
        List<StudentScores> scores = scoresDao.findAcademicScoresById(studentId);
        return scores;
    }

    @Override
    public List<StudentScores> findCourses(String studentId) {
        Student student = studentDao.findStudent(studentId);
        Profession profession = professionDao.findProfessionByName(student.getProfession());
        List<Course> courses = profession.getCourses();
        List<StudentScores> studentScores = new ArrayList<>();
        for (Course course : courses) {
            StudentScores studentScore = new StudentScores();
            studentScore.setStudentId(studentId);
            studentScore.setCourseId(course.getCourseId());
            studentScore.setCourse(course);
            studentScore.setScore(0.0);
            studentScores.add(studentScore);
        }
        return  studentScores;
    }

    @Override
    public void addAcademicScore(StudentScoresDTO scores) {
        try {
            List<StudentScores> scoresList = scores.getStudentScores();
            double sum = 0.0;
            double credits = 0.0;
            for (StudentScores studentScore : scoresList) {
                Course course = courseDao.findCourseById(studentScore.getCourseId());
                scoresDao.addAcademicScore(studentScore);
                sum += (double)(studentScore.getScore() * course.getCredit());
                credits +=(double)course.getCredit();
            }
            double evalScore = (double)sum / credits;
            scoresDao.updateAcademicScore(evalScore,scoresList.get(0).getStudentId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addBasicQualityScore(BasicQualityScore basicQualityScore) {
        double sum = 0;
        sum = basicQualityScore.getCivilization() +
                basicQualityScore.getLegalAwareness() +
                basicQualityScore.getMoralCharacter() +
                basicQualityScore.getPhysicalFitness() +
                basicQualityScore.getPoliticalPerformance();
        scoresDao.addBasicQualityScore(basicQualityScore);
        scoresDao.updateBasicQualityScore(sum,basicQualityScore.getStudentId());
    }

    @Override
    public BasicQualityScore listBasicQualityScore(String studentId) {
        return scoresDao.listBasicQualityScore(studentId);
    }

}
