package com.dingyun.model;

import java.io.Serializable;
import java.util.Date;

/**
 * repay
 * @author 
 */
public class Repay implements Serializable {
    private Integer ryId;

    private Integer ryUsId;

    private Integer ryType;

    private Double ryPaymoney;

    private String ryRule;

    private String ryContent;

    private Integer ryNumber;

    private Date ryTime;

    private Integer ryPsId;

    private String ryCode;

    private static final long serialVersionUID = 1L;

    public Integer getRyId() {
        return ryId;
    }

    public void setRyId(Integer ryId) {
        this.ryId = ryId;
    }

    public Integer getRyUsId() {
        return ryUsId;
    }

    public void setRyUsId(Integer ryUsId) {
        this.ryUsId = ryUsId;
    }

    public Integer getRyType() {
        return ryType;
    }

    public void setRyType(Integer ryType) {
        this.ryType = ryType;
    }

    public Double getRyPaymoney() {
        return ryPaymoney;
    }

    public void setRyPaymoney(Double ryPaymoney) {
        this.ryPaymoney = ryPaymoney;
    }

    public String getRyRule() {
        return ryRule;
    }

    public void setRyRule(String ryRule) {
        this.ryRule = ryRule;
    }

    public String getRyContent() {
        return ryContent;
    }

    public void setRyContent(String ryContent) {
        this.ryContent = ryContent;
    }

    public Integer getRyNumber() {
        return ryNumber;
    }

    public void setRyNumber(Integer ryNumber) {
        this.ryNumber = ryNumber;
    }

    public Date getRyTime() {
        return ryTime;
    }

    public void setRyTime(Date ryTime) {
        this.ryTime = ryTime;
    }

    public Integer getRyPsId() {
        return ryPsId;
    }

    public void setRyPsId(Integer ryPsId) {
        this.ryPsId = ryPsId;
    }

    public String getRyCode() {
        return ryCode;
    }

    public void setRyCode(String ryCode) {
        this.ryCode = ryCode;
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
        Repay other = (Repay) that;
        return (this.getRyId() == null ? other.getRyId() == null : this.getRyId().equals(other.getRyId()))
            && (this.getRyUsId() == null ? other.getRyUsId() == null : this.getRyUsId().equals(other.getRyUsId()))
            && (this.getRyType() == null ? other.getRyType() == null : this.getRyType().equals(other.getRyType()))
            && (this.getRyPaymoney() == null ? other.getRyPaymoney() == null : this.getRyPaymoney().equals(other.getRyPaymoney()))
            && (this.getRyRule() == null ? other.getRyRule() == null : this.getRyRule().equals(other.getRyRule()))
            && (this.getRyContent() == null ? other.getRyContent() == null : this.getRyContent().equals(other.getRyContent()))
            && (this.getRyNumber() == null ? other.getRyNumber() == null : this.getRyNumber().equals(other.getRyNumber()))
            && (this.getRyTime() == null ? other.getRyTime() == null : this.getRyTime().equals(other.getRyTime()))
            && (this.getRyPsId() == null ? other.getRyPsId() == null : this.getRyPsId().equals(other.getRyPsId()))
            && (this.getRyCode() == null ? other.getRyCode() == null : this.getRyCode().equals(other.getRyCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRyId() == null) ? 0 : getRyId().hashCode());
        result = prime * result + ((getRyUsId() == null) ? 0 : getRyUsId().hashCode());
        result = prime * result + ((getRyType() == null) ? 0 : getRyType().hashCode());
        result = prime * result + ((getRyPaymoney() == null) ? 0 : getRyPaymoney().hashCode());
        result = prime * result + ((getRyRule() == null) ? 0 : getRyRule().hashCode());
        result = prime * result + ((getRyContent() == null) ? 0 : getRyContent().hashCode());
        result = prime * result + ((getRyNumber() == null) ? 0 : getRyNumber().hashCode());
        result = prime * result + ((getRyTime() == null) ? 0 : getRyTime().hashCode());
        result = prime * result + ((getRyPsId() == null) ? 0 : getRyPsId().hashCode());
        result = prime * result + ((getRyCode() == null) ? 0 : getRyCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ryId=").append(ryId);
        sb.append(", ryUsId=").append(ryUsId);
        sb.append(", ryType=").append(ryType);
        sb.append(", ryPaymoney=").append(ryPaymoney);
        sb.append(", ryRule=").append(ryRule);
        sb.append(", ryContent=").append(ryContent);
        sb.append(", ryNumber=").append(ryNumber);
        sb.append(", ryTime=").append(ryTime);
        sb.append(", ryPsId=").append(ryPsId);
        sb.append(", ryCode=").append(ryCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}