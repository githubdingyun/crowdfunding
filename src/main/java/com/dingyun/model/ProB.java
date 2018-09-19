package com.dingyun.model;

import java.io.Serializable;

/**
 * pro_b
 * @author 
 */
public class ProB implements Serializable {
    private Integer proBId;

    private Integer proBUsId;

    private String proBFile;

    private String proBName;

    private String proBGoal;

    private String proBAddress;

    private String proBMoney;

    private Integer proBDatenum;

    private static final long serialVersionUID = 1L;

    public Integer getProBId() {
        return proBId;
    }

    public void setProBId(Integer proBId) {
        this.proBId = proBId;
    }

    public Integer getProBUsId() {
        return proBUsId;
    }

    public void setProBUsId(Integer proBUsId) {
        this.proBUsId = proBUsId;
    }

    public String getProBFile() {
        return proBFile;
    }

    public void setProBFile(String proBFile) {
        this.proBFile = proBFile;
    }

    public String getProBName() {
        return proBName;
    }

    public void setProBName(String proBName) {
        this.proBName = proBName;
    }

    public String getProBGoal() {
        return proBGoal;
    }

    public void setProBGoal(String proBGoal) {
        this.proBGoal = proBGoal;
    }

    public String getProBAddress() {
        return proBAddress;
    }

    public void setProBAddress(String proBAddress) {
        this.proBAddress = proBAddress;
    }

    public String getProBMoney() {
        return proBMoney;
    }

    public void setProBMoney(String proBMoney) {
        this.proBMoney = proBMoney;
    }

    public Integer getProBDatenum() {
        return proBDatenum;
    }

    public void setProBDatenum(Integer proBDatenum) {
        this.proBDatenum = proBDatenum;
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
        ProB other = (ProB) that;
        return (this.getProBId() == null ? other.getProBId() == null : this.getProBId().equals(other.getProBId()))
            && (this.getProBUsId() == null ? other.getProBUsId() == null : this.getProBUsId().equals(other.getProBUsId()))
            && (this.getProBFile() == null ? other.getProBFile() == null : this.getProBFile().equals(other.getProBFile()))
            && (this.getProBName() == null ? other.getProBName() == null : this.getProBName().equals(other.getProBName()))
            && (this.getProBGoal() == null ? other.getProBGoal() == null : this.getProBGoal().equals(other.getProBGoal()))
            && (this.getProBAddress() == null ? other.getProBAddress() == null : this.getProBAddress().equals(other.getProBAddress()))
            && (this.getProBMoney() == null ? other.getProBMoney() == null : this.getProBMoney().equals(other.getProBMoney()))
            && (this.getProBDatenum() == null ? other.getProBDatenum() == null : this.getProBDatenum().equals(other.getProBDatenum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProBId() == null) ? 0 : getProBId().hashCode());
        result = prime * result + ((getProBUsId() == null) ? 0 : getProBUsId().hashCode());
        result = prime * result + ((getProBFile() == null) ? 0 : getProBFile().hashCode());
        result = prime * result + ((getProBName() == null) ? 0 : getProBName().hashCode());
        result = prime * result + ((getProBGoal() == null) ? 0 : getProBGoal().hashCode());
        result = prime * result + ((getProBAddress() == null) ? 0 : getProBAddress().hashCode());
        result = prime * result + ((getProBMoney() == null) ? 0 : getProBMoney().hashCode());
        result = prime * result + ((getProBDatenum() == null) ? 0 : getProBDatenum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proBId=").append(proBId);
        sb.append(", proBUsId=").append(proBUsId);
        sb.append(", proBFile=").append(proBFile);
        sb.append(", proBName=").append(proBName);
        sb.append(", proBGoal=").append(proBGoal);
        sb.append(", proBAddress=").append(proBAddress);
        sb.append(", proBMoney=").append(proBMoney);
        sb.append(", proBDatenum=").append(proBDatenum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}