package pers.fzm.studentevaluation.domain;

import java.util.List;

//课程
public class Course {
    private String professionId;
    private String courseId;    //课程编号
    private String courseName;  //课程名称
    private double credit;  //学分
    private Integer yearOfCollege;  //课程学年

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", yearOfCollege=" + yearOfCollege +
                '}';
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Integer getYearOfCollege() {
        return yearOfCollege;
    }

    public void setYearOfCollege(Integer yearOfCollege) {
        this.yearOfCollege = yearOfCollege;
    }
}
