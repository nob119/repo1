package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.Course;

import java.util.List;

@Repository
public interface CourseDao {

    @Select("select * from course where course_id=#{courseId}")
    @Results(id = "courseMap",value = {
            @Result(property = "courseId",column = "course_id"),
            @Result(property = "courseName",column = "course_name"),
            @Result(property = "credit",column = "credit"),
            @Result(property = "yearOfCollege",column = "year_of_college"),
    })
    Course findCourseById(String courseId);

    @Select("select * from course where course_id in (select course_id from profession_course where profession_id=#{professionId})")
    @ResultMap("courseMap")
    List<Course> findCoursesByProfessionId(String professionId);
}
