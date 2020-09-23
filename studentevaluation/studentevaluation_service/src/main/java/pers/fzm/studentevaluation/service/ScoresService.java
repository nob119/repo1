package pers.fzm.studentevaluation.service;

import pers.fzm.studentevaluation.domain.*;

import java.util.List;

public interface ScoresService {
    //查询所有测评成绩
    StudentEval findResultsById(String studentId);

    //学习成绩详情
    List<StudentScores> findAcademicScoresById(String studentId);

    //查找学生所有所学课程
    List<StudentScores> findCourses(String studentId);

    //计算并添加学生学习分数
    void addAcademicScore(StudentScoresDTO scores);

    //计算并添加学生基础性素质分数
    void addBasicQualityScore(BasicQualityScore basicQualityScore);

    //查看学生基础性素质分数
    BasicQualityScore listBasicQualityScore(String studentId);
}
