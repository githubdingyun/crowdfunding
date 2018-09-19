package com.dingyun.model;

import java.io.Serializable;
import java.util.Date;

/**
 * projects
 * @author 
 */
public class Projects implements Serializable {
    private Integer psId;

    private Integer psUsId;

    private String psCustName;

    private String psCustPhone;

    private String psCustAddress;

    private Integer psPstId;

    private String psFile;

    private String psName;

    private String psGoal;

    private String psAddress;

    private Double psMoney;

    private Integer psDays;

    private String psVideo;

    private String psStory;

    private String psSupport;

    private String psRepay;

    private String psAboutme;

    private Integer psType;

    private Date psStarttime;

    private Date psEndtime;

    private Double psGetmoney;

    private Integer psGetpeople;

    private static final long serialVersionUID = 1L;

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public Integer getPsUsId() {
        return psUsId;
    }

    public void setPsUsId(Integer psUsId) {
        this.psUsId = psUsId;
    }

    public String getPsCustName() {
        return psCustName;
    }

    public void setPsCustName(String psCustName) {
        this.psCustName = psCustName;
    }

    public String getPsCustPhone() {
        return psCustPhone;
    }

    public void setPsCustPhone(String psCustPhone) {
        this.psCustPhone = psCustPhone;
    }

    public String getPsCustAddress() {
        return psCustAddress;
    }

    public void setPsCustAddress(String psCustAddress) {
        this.psCustAddress = psCustAddress;
    }

    public Integer getPsPstId() {
        return psPstId;
    }

    public void setPsPstId(Integer psPstId) {
        this.psPstId = psPstId;
    }

    public String getPsFile() {
        return psFile;
    }

    public void setPsFile(String psFile) {
        this.psFile = psFile;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public String getPsGoal() {
        return psGoal;
    }

    public void setPsGoal(String psGoal) {
        this.psGoal = psGoal;
    }

    public String getPsAddress() {
        return psAddress;
    }

    public void setPsAddress(String psAddress) {
        this.psAddress = psAddress;
    }

    public Double getPsMoney() {
        return psMoney;
    }

    public void setPsMoney(Double psMoney) {
        this.psMoney = psMoney;
    }

    public Integer getPsDays() {
        return psDays;
    }

    public void setPsDays(Integer psDays) {
        this.psDays = psDays;
    }

    public String getPsVideo() {
        return psVideo;
    }

    public void setPsVideo(String psVideo) {
        this.psVideo = psVideo;
    }

    public String getPsStory() {
        return psStory;
    }

    public void setPsStory(String psStory) {
        this.psStory = psStory;
    }

    public String getPsSupport() {
        return psSupport;
    }

    public void setPsSupport(String psSupport) {
        this.psSupport = psSupport;
    }

    public String getPsRepay() {
        return psRepay;
    }

    public void setPsRepay(String psRepay) {
        this.psRepay = psRepay;
    }

    public String getPsAboutme() {
        return psAboutme;
    }

    public void setPsAboutme(String psAboutme) {
        this.psAboutme = psAboutme;
    }

    public Integer getPsType() {
        return psType;
    }

    public void setPsType(Integer psType) {
        this.psType = psType;
    }

    public Date getPsStarttime() {
        return psStarttime;
    }

    public void setPsStarttime(Date psStarttime) {
        this.psStarttime = psStarttime;
    }

    public Date getPsEndtime() {
        return psEndtime;
    }

    public void setPsEndtime(Date psEndtime) {
        this.psEndtime = psEndtime;
    }

    public Double getPsGetmoney() {
        return psGetmoney;
    }

    public void setPsGetmoney(Double psGetmoney) {
        this.psGetmoney = psGetmoney;
    }

    public Integer getPsGetpeople() {
        return psGetpeople;
    }

    public void setPsGetpeople(Integer psGetpeople) {
        this.psGetpeople = psGetpeople;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Projects other = (Projects) that;
        return (this.getPsId() == null ? other.getPsId() == null : this.getPsId().equals(other.getPsId()))
            && (this.getPsUsId() == null ? other.getPsUsId() == null : this.getPsUsId().equals(other.getPsUsId()))
            && (this.getPsCustName() == null ? other.getPsCustName() == null : this.getPsCustName().equals(other.getPsCustName()))
            && (this.getPsCustPhone() == null ? other.getPsCustPhone() == null : this.getPsCustPhone().equals(other.getPsCustPhone()))
            && (this.getPsCustAddress() == null ? other.getPsCustAddress() == null : this.getPsCustAddress().equals(other.getPsCustAddress()))
            && (this.getPsPstId() == null ? other.getPsPstId() == null : this.getPsPstId().equals(other.getPsPstId()))
            && (this.getPsFile() == null ? other.getPsFile() == null : this.getPsFile().equals(other.getPsFile()))
            && (this.getPsName() == null ? other.getPsName() == null : this.getPsName().equals(other.getPsName()))
            && (this.getPsGoal() == null ? other.getPsGoal() == null : this.getPsGoal().equals(other.getPsGoal()))
            && (this.getPsAddress() == null ? other.getPsAddress() == null : this.getPsAddress().equals(other.getPsAddress()))
            && (this.getPsMoney() == null ? other.getPsMoney() == null : this.getPsMoney().equals(other.getPsMoney()))
            && (this.getPsDays() == null ? other.getPsDays() == null : this.getPsDays().equals(other.getPsDays()))
            && (this.getPsVideo() == null ? other.getPsVideo() == null : this.getPsVideo().equals(other.getPsVideo()))
            && (this.getPsStory() == null ? other.getPsStory() == null : this.getPsStory().equals(other.getPsStory()))
            && (this.getPsSupport() == null ? other.getPsSupport() == null : this.getPsSupport().equals(other.getPsSupport()))
            && (this.getPsRepay() == null ? other.getPsRepay() == null : this.getPsRepay().equals(other.getPsRepay()))
            && (this.getPsAboutme() == null ? other.getPsAboutme() == null : this.getPsAboutme().equals(other.getPsAboutme()))
            && (this.getPsType() == null ? other.getPsType() == null : this.getPsType().equals(other.getPsType()))
            && (this.getPsStarttime() == null ? other.getPsStarttime() == null : this.getPsStarttime().equals(other.getPsStarttime()))
            && (this.getPsEndtime() == null ? other.getPsEndtime() == null : this.getPsEndtime().equals(other.getPsEndtime()))
            && (this.getPsGetmoney() == null ? other.getPsGetmoney() == null : this.getPsGetmoney().equals(other.getPsGetmoney()))
            && (this.getPsGetpeople() == null ? other.getPsGetpeople() == null : this.getPsGetpeople().equals(other.getPsGetpeople()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPsId() == null) ? 0 : getPsId().hashCode());
        result = prime * result + ((getPsUsId() == null) ? 0 : getPsUsId().hashCode());
        result = prime * result + ((getPsCustName() == null) ? 0 : getPsCustName().hashCode());
        result = prime * result + ((getPsCustPhone() == null) ? 0 : getPsCustPhone().hashCode());
        result = prime * result + ((getPsCustAddress() == null) ? 0 : getPsCustAddress().hashCode());
        result = prime * result + ((getPsPstId() == null) ? 0 : getPsPstId().hashCode());
        result = prime * result + ((getPsFile() == null) ? 0 : getPsFile().hashCode());
        result = prime * result + ((getPsName() == null) ? 0 : getPsName().hashCode());
        result = prime * result + ((getPsGoal() == null) ? 0 : getPsGoal().hashCode());
        result = prime * result + ((getPsAddress() == null) ? 0 : getPsAddress().hashCode());
        result = prime * result + ((getPsMoney() == null) ? 0 : getPsMoney().hashCode());
        result = prime * result + ((getPsDays() == null) ? 0 : getPsDays().hashCode());
        result = prime * result + ((getPsVideo() == null) ? 0 : getPsVideo().hashCode());
        result = prime * result + ((getPsStory() == null) ? 0 : getPsStory().hashCode());
        result = prime * result + ((getPsSupport() == null) ? 0 : getPsSupport().hashCode());
        result = prime * result + ((getPsRepay() == null) ? 0 : getPsRepay().hashCode());
        result = prime * result + ((getPsAboutme() == null) ? 0 : getPsAboutme().hashCode());
        result = prime * result + ((getPsType() == null) ? 0 : getPsType().hashCode());
        result = prime * result + ((getPsStarttime() == null) ? 0 : getPsStarttime().hashCode());
        result = prime * result + ((getPsEndtime() == null) ? 0 : getPsEndtime().hashCode());
        result = prime * result + ((getPsGetmoney() == null) ? 0 : getPsGetmoney().hashCode());
        result = prime * result + ((getPsGetpeople() == null) ? 0 : getPsGetpeople().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psId=").append(psId);
        sb.append(", psUsId=").append(psUsId);
        sb.append(", psCustName=").append(psCustName);
        sb.append(", psCustPhone=").append(psCustPhone);
        sb.append(", psCustAddress=").append(psCustAddress);
        sb.append(", psPstId=").append(psPstId);
        sb.append(", psFile=").append(psFile);
        sb.append(", psName=").append(psName);
        sb.append(", psGoal=").append(psGoal);
        sb.append(", psAddress=").append(psAddress);
        sb.append(", psMoney=").append(psMoney);
        sb.append(", psDays=").append(psDays);
        sb.append(", psVideo=").append(psVideo);
        sb.append(", psStory=").append(psStory);
        sb.append(", psSupport=").append(psSupport);
        sb.append(", psRepay=").append(psRepay);
        sb.append(", psAboutme=").append(psAboutme);
        sb.append(", psType=").append(psType);
        sb.append(", psStarttime=").append(psStarttime);
        sb.append(", psEndtime=").append(psEndtime);
        sb.append(", psGetmoney=").append(psGetmoney);
        sb.append(", psGetpeople=").append(psGetpeople);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}