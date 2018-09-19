package com.dingyun.model;

import java.io.Serializable;

/**
 * pro_c
 * @author 
 */
public class ProC implements Serializable {
    private Integer proCId;

    private Integer proCUsId;

    private String proCVedio;

    private String proCStory;

    private String proCSupport;

    private String proCRepay;

    private String proCAboutme;

    private static final long serialVersionUID = 1L;

    public Integer getProCId() {
        return proCId;
    }

    public void setProCId(Integer proCId) {
        this.proCId = proCId;
    }

    public Integer getProCUsId() {
        return proCUsId;
    }

    public void setProCUsId(Integer proCUsId) {
        this.proCUsId = proCUsId;
    }

    public String getProCVedio() {
        return proCVedio;
    }

    public void setProCVedio(String proCVedio) {
        this.proCVedio = proCVedio;
    }

    public String getProCStory() {
        return proCStory;
    }

    public void setProCStory(String proCStory) {
        this.proCStory = proCStory;
    }

    public String getProCSupport() {
        return proCSupport;
    }

    public void setProCSupport(String proCSupport) {
        this.proCSupport = proCSupport;
    }

    public String getProCRepay() {
        return proCRepay;
    }

    public void setProCRepay(String proCRepay) {
        this.proCRepay = proCRepay;
    }

    public String getProCAboutme() {
        return proCAboutme;
    }

    public void setProCAboutme(String proCAboutme) {
        this.proCAboutme = proCAboutme;
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
        ProC other = (ProC) that;
        return (this.getProCId() == null ? other.getProCId() == null : this.getProCId().equals(other.getProCId()))
            && (this.getProCUsId() == null ? other.getProCUsId() == null : this.getProCUsId().equals(other.getProCUsId()))
            && (this.getProCVedio() == null ? other.getProCVedio() == null : this.getProCVedio().equals(other.getProCVedio()))
            && (this.getProCStory() == null ? other.getProCStory() == null : this.getProCStory().equals(other.getProCStory()))
            && (this.getProCSupport() == null ? other.getProCSupport() == null : this.getProCSupport().equals(other.getProCSupport()))
            && (this.getProCRepay() == null ? other.getProCRepay() == null : this.getProCRepay().equals(other.getProCRepay()))
            && (this.getProCAboutme() == null ? other.getProCAboutme() == null : this.getProCAboutme().equals(other.getProCAboutme()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProCId() == null) ? 0 : getProCId().hashCode());
        result = prime * result + ((getProCUsId() == null) ? 0 : getProCUsId().hashCode());
        result = prime * result + ((getProCVedio() == null) ? 0 : getProCVedio().hashCode());
        result = prime * result + ((getProCStory() == null) ? 0 : getProCStory().hashCode());
        result = prime * result + ((getProCSupport() == null) ? 0 : getProCSupport().hashCode());
        result = prime * result + ((getProCRepay() == null) ? 0 : getProCRepay().hashCode());
        result = prime * result + ((getProCAboutme() == null) ? 0 : getProCAboutme().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proCId=").append(proCId);
        sb.append(", proCUsId=").append(proCUsId);
        sb.append(", proCVedio=").append(proCVedio);
        sb.append(", proCStory=").append(proCStory);
        sb.append(", proCSupport=").append(proCSupport);
        sb.append(", proCRepay=").append(proCRepay);
        sb.append(", proCAboutme=").append(proCAboutme);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}