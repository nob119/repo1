package pers.fzm.studentevaluation.domain;

import java.util.List;

//角色
public class Role {
    private String roleId;  //角色编号
    private String roleName;    //角色名称
    private List<UserInfo> users;   //所有用户

    public List<UserInfo> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", users=" + users +
                '}';
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
