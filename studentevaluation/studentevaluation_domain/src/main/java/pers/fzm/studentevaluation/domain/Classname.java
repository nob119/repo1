package pers.fzm.studentevaluation.domain;

import java.io.Serializable;
import java.util.List;

//班级
public class Classname implements Serializable {
    private String classId;
    private String classname;   //班级名称
    private List<Student> students; //所有学生

    public List<Student> getStudents() {
        return students;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
