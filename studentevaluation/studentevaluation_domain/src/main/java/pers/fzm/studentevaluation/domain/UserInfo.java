package pers.fzm.studentevaluation.domain;

import org.springframework.format.annotation.DateTimeFormat;
import pers.fzm.studentevaluation.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;

//管理员
public class UserInfo implements Serializable {
    private String user_id; //用户名
    private String userName;   //姓名
    private String gender;   //性别
    private String department;  //所属单位
    private String password;    //密码
    private String roleName;    //角色名称
    private String des;

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id='" + user_id + '\'' +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public String getDes() {
        return user_id+userName;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
