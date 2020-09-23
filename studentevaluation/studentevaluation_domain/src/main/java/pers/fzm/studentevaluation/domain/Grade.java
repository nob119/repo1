package pers.fzm.studentevaluation.domain;

import java.io.Serializable;
import java.util.List;

//年级
public class Grade implements Serializable{
    private String gradeId;
    private String gradeNum;    //年级

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum(String gradeNum) {
        this.gradeNum = gradeNum;
    }
}
