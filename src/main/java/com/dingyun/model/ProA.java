package com.dingyun.model;

import java.io.Serializable;

/**
 * pro_a
 * @author 
 */
public class ProA implements Serializable {
    private Integer proAId;

    private Integer prAUsId;

    private String proACustName;

    private String proACustPhone;

    private Integer proAPstId;

    private String proACustAddress;

    private static final long serialVersionUID = 1L;

    public Integer getProAId() {
        return proAId;
    }

    public void setProAId(Integer proAId) {
        this.proAId = proAId;
    }

    public Integer getPrAUsId() {
        return prAUsId;
    }

    public void setPrAUsId(Integer prAUsId) {
        this.prAUsId = prAUsId;
    }

    public String getProACustName() {
        return proACustName;
    }

    public void setProACustName(String proACustName) {
        this.proACustName = proACustName;
    }

    public String getProACustPhone() {
        return proACustPhone;
    }

    public void setProACustPhone(String proACustPhone) {
        this.proACustPhone = proACustPhone;
    }

    public Integer getProAPstId() {
        return proAPstId;
    }

    public void setProAPstId(Integer proAPstId) {
        this.proAPstId = proAPstId;
    }

    public String getProACustAddress() {
        return proACustAddress;
    }

    public void setProACustAddress(String proACustAddress) {
        this.proACustAddress = proACustAddress;
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
        ProA other = (ProA) that;
        return (this.getProAId() == null ? other.getProAId() == null : this.getProAId().equals(other.getProAId()))
            && (this.getPrAUsId() == null ? other.getPrAUsId() == null : this.getPrAUsId().equals(other.getPrAUsId()))
            && (this.getProACustName() == null ? other.getProACustName() == null : this.getProACustName().equals(other.getProACustName()))
            && (this.getProACustPhone() == null ? other.getProACustPhone() == null : this.getProACustPhone().equals(other.getProACustPhone()))
            && (this.getProAPstId() == null ? other.getProAPstId() == null : this.getProAPstId().equals(other.getProAPstId()))
            && (this.getProACustAddress() == null ? other.getProACustAddress() == null : this.getProACustAddress().equals(other.getProACustAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProAId() == null) ? 0 : getProAId().hashCode());
        result = prime * result + ((getPrAUsId() == null) ? 0 : getPrAUsId().hashCode());
        result = prime * result + ((getProACustName() == null) ? 0 : getProACustName().hashCode());
        result = prime * result + ((getProACustPhone() == null) ? 0 : getProACustPhone().hashCode());
        result = prime * result + ((getProAPstId() == null) ? 0 : getProAPstId().hashCode());
        result = prime * result + ((getProACustAddress() == null) ? 0 : getProACustAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proAId=").append(proAId);
        sb.append(", prAUsId=").append(prAUsId);
        sb.append(", proACustName=").append(proACustName);
        sb.append(", proACustPhone=").append(proACustPhone);
        sb.append(", proAPstId=").append(proAPstId);
        sb.append(", proACustAddress=").append(proACustAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}