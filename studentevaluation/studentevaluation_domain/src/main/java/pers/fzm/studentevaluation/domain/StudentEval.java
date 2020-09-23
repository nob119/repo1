package pers.fzm.studentevaluation.domain;

public class StudentEval {
    private String studentId;
    private double academicScore;
    private double basicQualityScore;
    private double developmentalQualityScore;

    @Override
    public String toString() {
        return "StudentEval{" +
                "studentId='" + studentId + '\'' +
                ", academicScore=" + academicScore +
                ", basicQualityScore=" + basicQualityScore +
                ", developmentalQualityScore=" + developmentalQualityScore +
                '}';
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAcademicScore() {
        return academicScore;
    }

    public void setAcademicScore(double academicScore) {
        this.academicScore = academicScore;
    }

    public double getBasicQualityScore() {
        return basicQualityScore;
    }

    public void setBasicQualityScore(double basicQualityScore) {
        this.basicQualityScore = basicQualityScore;
    }

    public double getDevelopmentalQualityScore() {
        return developmentalQualityScore;
    }

    public void setDevelopmentalQualityScore(double developmentalQualityScore) {
        this.developmentalQualityScore = developmentalQualityScore;
    }
}
