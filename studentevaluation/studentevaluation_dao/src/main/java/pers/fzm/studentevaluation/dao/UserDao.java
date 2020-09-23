package pers.fzm.studentevaluation.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import pers.fzm.studentevaluation.domain.UserInfo;

import java.util.List;


@Repository
public interface UserDao {

    @Select("select * from user where user_id = #{userId}")
    @Results(id = "userResultsMap",value = {
            @Result(property = "user_id",column = "user_id"),
            @Result(property = "userName",column = "username"),
            @Result(property = "gender",column = "gender"),
            @Result(property = "department",column = "department"),
            @Result(property = "password",column = "password"),
            @Result(property = "roleName",column = "rolename"),
    })
    UserInfo findUserByUserId(String userId);

    @Select("select * from user ORDER BY user_id ASC")
    @ResultMap("userResultsMap")
    List<UserInfo> findAll();

    @Insert("insert into user(user_id,username,gender,department,password,rolename,des)"
            + "values(#{user_id},#{userName},#{gender},#{department},#{password},#{roleName},#{des })")
    @ResultMap("userResultsMap")
    void addUser(UserInfo user);

    @Select("select * from user where user_id=#{userId}")
    @ResultMap("userResultsMap")
    UserInfo findUser(String userId);

    @Delete("delete from user where user_id=#{userId}")
    void removeUser(String userId);

    @Update("update user set password=#{password} where user_id=#{userId}")
    void updatePassword(@Param("password")String password, @Param("userId") String userId);

    //搜索学生
    @Select("select * from user where des like '%${des}%'")
    @ResultMap("userResultsMap")
    List<UserInfo> findUserByDesc(@Param("des")String des);
}
