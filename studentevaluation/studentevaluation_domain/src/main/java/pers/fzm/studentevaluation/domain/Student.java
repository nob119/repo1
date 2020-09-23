package pers.fzm.studentevaluation.domain;

import org.springframework.format.annotation.DateTimeFormat;
import pers.fzm.studentevaluation.utils.DateUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

//学生
public class Student implements Serializable{
    private String studentId;   //学号
    private String studentName; //姓名
    private String gender;  //性别
    private String grade;   //年级
    private String classname;   //班级
    private String profession;  //专业
    private String institute;   //学院
    private String political_status;    //政治面貌
    private String des;
    private double evalScore;   //测评分数

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", classname='" + classname + '\'' +
                ", profession='" + profession + '\'' +
                ", institute='" + institute + '\'' +
                ", political_status='" + political_status + '\'' +
                ", des='" + des + '\'' +
                ", evalScore=" + evalScore +
                '}';
    }

    public double getEvalScore() {
        return evalScore;
    }

    public void setEvalScore(double evalScore) {
        this.evalScore = evalScore;
    }

    public String getDes() {
        return studentId + studentName + "学校" + institute + profession;
    }

    public void setDes(String des) {
        this.des = des;
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getPolitical_status() {
        return political_status;
    }

    public void setPolitical_status(String political_status) {
        this.political_status = political_status;
    }
}
