package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.Grade;

import java.util.List;

@Repository
public interface GradeDao {
    //查询所有年级
    @Select("select * from grade")
    @Results({
            @Result(property = "gradeId",column = "gradeId"),
            @Result(property = "gradeNum",column = "gradeNum")
    })
    List<Grade> findAll();
}
