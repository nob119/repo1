package pers.fzm.studentevaluation.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class MyUser extends User {
    private static final long serialVersionUID = -25559580612205393L;
    private String userName;
    private String roleName;
    private String passport;
    private String department;

    public MyUser(String userName, String roleName,String passport,String department,String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.userName = userName;
        this.roleName = roleName;
        this.passport = passport;
        this.department = department;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }



    @Override
    public String toString() {
        return "MyUser{" +
                "userName='" + userName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", passport='" + passport + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
