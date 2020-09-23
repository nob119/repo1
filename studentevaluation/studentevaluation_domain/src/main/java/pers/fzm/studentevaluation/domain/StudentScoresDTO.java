package pers.fzm.studentevaluation.domain;

import java.util.List;

public class StudentScoresDTO {
    private List<StudentScores> studentScores;

    @Override
    public String toString() {
        return "StudentScoresDTO{" +
                "studentScores=" + studentScores +
                '}';
    }

    public List<StudentScores> getStudentScores() {
        return studentScores;
    }

    public void setStudentScores(List<StudentScores> studentScores) {
        this.studentScores = studentScores;
    }
}
