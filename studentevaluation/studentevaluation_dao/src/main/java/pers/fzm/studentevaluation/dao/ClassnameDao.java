package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.Classname;

import java.util.List;

@Repository
public interface ClassnameDao {

    @Select("select * from classname where ")
    List<Classname> findAll(String gradeId);
}
