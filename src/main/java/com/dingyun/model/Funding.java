package com.dingyun.model;

import java.io.Serializable;
import java.util.Date;

/**
 * funding
 * @author 
 */
public class Funding implements Serializable {
    private Integer fdId;

    private Integer fdUsId;

    private Integer fdPsId;

    private Double fdMoney;

    private Date fdTime;

    private static final long serialVersionUID = 1L;

    public Integer getFdId() {
        return fdId;
    }

    public void setFdId(Integer fdId) {
        this.fdId = fdId;
    }

    public Integer getFdUsId() {
        return fdUsId;
    }

    public void setFdUsId(Integer fdUsId) {
        this.fdUsId = fdUsId;
    }

    public Integer getFdPsId() {
        return fdPsId;
    }

    public void setFdPsId(Integer fdPsId) {
        this.fdPsId = fdPsId;
    }

    public Double getFdMoney() {
        return fdMoney;
    }

    public void setFdMoney(Double fdMoney) {
        this.fdMoney = fdMoney;
    }

    public Date getFdTime() {
        return fdTime;
    }

    public void setFdTime(Date fdTime) {
        this.fdTime = fdTime;
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
        Funding other = (Funding) that;
        return (this.getFdId() == null ? other.getFdId() == null : this.getFdId().equals(other.getFdId()))
            && (this.getFdUsId() == null ? other.getFdUsId() == null : this.getFdUsId().equals(other.getFdUsId()))
            && (this.getFdPsId() == null ? other.getFdPsId() == null : this.getFdPsId().equals(other.getFdPsId()))
            && (this.getFdMoney() == null ? other.getFdMoney() == null : this.getFdMoney().equals(other.getFdMoney()))
            && (this.getFdTime() == null ? other.getFdTime() == null : this.getFdTime().equals(other.getFdTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFdId() == null) ? 0 : getFdId().hashCode());
        result = prime * result + ((getFdUsId() == null) ? 0 : getFdUsId().hashCode());
        result = prime * result + ((getFdPsId() == null) ? 0 : getFdPsId().hashCode());
        result = prime * result + ((getFdMoney() == null) ? 0 : getFdMoney().hashCode());
        result = prime * result + ((getFdTime() == null) ? 0 : getFdTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fdId=").append(fdId);
        sb.append(", fdUsId=").append(fdUsId);
        sb.append(", fdPsId=").append(fdPsId);
        sb.append(", fdMoney=").append(fdMoney);
        sb.append(", fdTime=").append(fdTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}