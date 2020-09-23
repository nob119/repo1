package pers.fzm.studentevaluation.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.fzm.studentevaluation.dao.UserDao;
import pers.fzm.studentevaluation.domain.MyUser;
import pers.fzm.studentevaluation.domain.UserInfo;
import pers.fzm.studentevaluation.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        try {
            userInfo = userDao.findUserByUserId(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyUser user = new MyUser(userInfo.getUserName(),userInfo.getRoleName(),userInfo.getPassword(),userInfo.getDepartment(),
                userInfo.getUser_id(),"{noop}" + userInfo.getPassword(),
                true,true,true,true,
                getAuthority(userInfo));
        return user;
    }

    public List<SimpleGrantedAuthority> getAuthority(UserInfo userInfo){
        List<SimpleGrantedAuthority> authority = new ArrayList<>();
        if ("学校管理员".equals(userInfo.getRoleName())){
            authority.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            authority.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        return authority;
    }

    @Override
    public List<UserInfo> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserInfo> users = userDao.findAll();
        return users;
    }

    @Override
    public List<UserInfo> userSearch(int pageNum, int pageSize, String val) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> userInfos = userDao.findUserByDesc(val);
        return userInfos;
    }

    @Override
    public void addUser(UserInfo user) {
        userDao.addUser(user);
    }

    @Override
    public UserInfo findUser(String userId) {
        UserInfo user = userDao.findUser(userId);
        return user;
    }

    @Override
    public void removeUsers(String[] userIds) {
        for (String userId : userIds) {
            userDao.removeUser(userId);
        }
    }

    @Override
    public boolean confirmPassword(String oldPassword) {
        MyUser myUser = (MyUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String passport = myUser.getPassport();
        if (passport.equals(oldPassword)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void updatePassword(String password) {
        MyUser myUser = (MyUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        String userId = myUser.getUsername();
        userDao.updatePassword(password,userId);
    }

    @Override
    public void removeUser(String userId) {
        userDao.removeUser(userId);
    }

}
