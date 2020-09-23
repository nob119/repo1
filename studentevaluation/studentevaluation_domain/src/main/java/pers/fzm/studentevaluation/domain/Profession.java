package pers.fzm.studentevaluation.domain;


import java.util.List;

//专业
public class Profession {
    private String professionId;    //专业编号
    private String professionName;  //专业名称
    private List<Course> courses; //专业课程

    @Override
    public String toString() {
        return "Profession{" +
                "professionId='" + professionId + '\'' +
                ", professionName='" + professionName + '\'' +
                ", courses=" + courses +
                '}';
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }
}
