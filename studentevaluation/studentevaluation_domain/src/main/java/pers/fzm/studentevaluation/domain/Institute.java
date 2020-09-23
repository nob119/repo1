package pers.fzm.studentevaluation.domain;

import java.util.List;
//学院
public class Institute {
    private String instituteId; //学院编号
    private String instituteName;   //学院名称
    private List<Profession> professions;   //所有专业


    public List<Profession> getProfessions() {
        return professions;
    }

    public void setProfessions(List<Profession> professions) {
        this.professions = professions;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
}
