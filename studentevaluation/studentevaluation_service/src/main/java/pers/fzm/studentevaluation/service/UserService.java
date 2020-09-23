package pers.fzm.studentevaluation.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pers.fzm.studentevaluation.domain.UserInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService extends UserDetailsService {

    //查询所有管理员
    List<UserInfo> findAll(int pageNum, int pageSize);

    //搜索管理员
    List<UserInfo> userSearch(int pageNum,int pageSize,String val);

    //添加管理员
    void addUser(UserInfo user);

    //查询管理员
    UserInfo findUser(String userId);

    //批量删除管理员
    void removeUsers(String[] userIds);

    boolean confirmPassword(String oldPassword);

    void updatePassword(String password);

    void removeUser(String userId);
}
