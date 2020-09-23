package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.Institute;

import java.util.List;

@Repository
public interface InstituteDao {

    @Select("select * from institute")
    @Results({
            @Result(column = "instituteId",property = "instituteId"),
            @Result(column = "instituteName",property = "institute_name"),
            @Result(column = "instituteId",property = "professions",
                    many = @Many(select = "pers.fzm.studentevaluation.dao.ProfessionDao.findAll")
            )

    })
    List<Institute> findAll();
}
