package pers.fzm.studentevaluation.domain;

public class BasicQualityScore {
    private String studentId;   //学号
    private double politicalPerformance;    //政治表现
    private double legalAwareness;  //法制意识
    private double moralCharacter;  //道德品质
    private double civilization;    //文明状况
    private double physicalFitness; //身体素质

    @Override
    public String toString() {
        return "BasicQualityScore{" +
                "studentId='" + studentId + '\'' +
                ", politicalPerformance='" + politicalPerformance + '\'' +
                ", legalAwareness='" + legalAwareness + '\'' +
                ", moralCharacter='" + moralCharacter + '\'' +
                ", civilization='" + civilization + '\'' +
                ", physicalFitness='" + physicalFitness + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getPoliticalPerformance() {
        return politicalPerformance;
    }

    public void setPoliticalPerformance(double politicalPerformance) {
        this.politicalPerformance = politicalPerformance;
    }

    public double getLegalAwareness() {
        return legalAwareness;
    }

    public void setLegalAwareness(double legalAwareness) {
        this.legalAwareness = legalAwareness;
    }

    public double getMoralCharacter() {
        return moralCharacter;
    }

    public void setMoralCharacter(double moralCharacter) {
        this.moralCharacter = moralCharacter;
    }

    public double getCivilization() {
        return civilization;
    }

    public void setCivilization(double civilization) {
        this.civilization = civilization;
    }

    public double getPhysicalFitness() {
        return physicalFitness;
    }

    public void setPhysicalFitness(double physicalFitness) {
        this.physicalFitness = physicalFitness;
    }
}
