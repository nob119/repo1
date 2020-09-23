package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.BasicQualityScore;
import pers.fzm.studentevaluation.domain.StudentEval;
import pers.fzm.studentevaluation.domain.StudentScores;

import java.util.List;

@Repository
public interface ScoresDao {

    @Select("select * from eval_results where student_id = #{studentId}")
    @Results({
            @Result(property = "studentId",column = "student_id"),
            @Result(property = "academicScore",column = "academic_score"),
            @Result(property = "basicQualityScore",column = "basic_quality_score"),
            @Result(property = "developmentalQualityScore",column = "developmental_quality_score"),
    })
    StudentEval findResultsById(String studentId);

    @Select("select * from scores where student_id = #{student_id}")
    @Results({
            @Result(property = "studentId",column = "student_id"),
            @Result(property = "courseId",column = "course_id"),
            @Result(property = "score",column = "score"),
            @Result(property = "course",column = "course_id",
                    one = @One(select = "pers.fzm.studentevaluation.dao.CourseDao.findCourseById")),
    })
    List<StudentScores> findAcademicScoresById(String studentId);

    //添加学生记录
    @Insert("insert into eval_results(student_id) values(#{studentId})")
    void addStudent(String studentId);

    //更新学生学习成绩分数
    @Update("update eval_results set academic_score=#{academicScore} where student_id=#{studentId}")
    void updateAcademicScore(@Param("academicScore") double academicScore,@Param("studentId") String studentId);

    //将学生各科成绩插入数据库中
    @Insert("insert into scores(student_id,course_id,score) values(#{studentId},#{courseId},#{score})")
    void addAcademicScore(StudentScores studentScores);

    //更新学生基础性素质分数
    @Update("update eval_results set basic_quality_score=#{basicQualityScore} where student_id=#{studentId}")
    void updateBasicQualityScore(@Param("basicQualityScore")double basicQualityScore,@Param("studentId")String studentId);

    //将学生基础性素质分数插入到数据库中
    @Insert("insert into basic_quality_score(student_id,politicalPerformance,legalAwareness,moralCharacter,civilization,physicalFitness)" +
            "values(#{studentId},#{politicalPerformance},#{legalAwareness},#{moralCharacter},#{civilization},#{physicalFitness})")
    void addBasicQualityScore(BasicQualityScore basicQualityScore);

    //查看学生基础性素质分数
    @Select("select * from basic_quality_score where student_id = #{studentId}")
    @Results({
            @Result(column = "student_id",property = "studentId"),
            @Result(column = "politicalPerformance",property = "politicalPerformance"),
            @Result(column = "legalAwareness",property = "legalAwareness"),
            @Result(column = "moralCharacter",property = "moralCharacter"),
            @Result(column = "civilization",property = "civilization"),
            @Result(column = "physicalFitness",property = "physicalFitness")
    })
    BasicQualityScore listBasicQualityScore(String studentId);
}
