package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.Profession;

import java.util.List;

@Repository
public interface ProfessionDao {

    @Select("select * from profession where profession_name=#{professionName}")
    @Results({
            @Result(column = "profession_id",property = "professionId"),
            @Result(column = "profession_name",property = "professionName"),
            @Result(column = "profession_id",property = "courses",
            many = @Many(select = "pers.fzm.studentevaluation.dao.CourseDao.findCoursesByProfessionId"))
    })
    Profession findProfessionByName(String professionName);


}
