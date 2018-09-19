package com.dingyun.model;

import java.io.Serializable;

/**
 * letter
 * @author 
 */
public class Letter implements Serializable {
    private Integer leId;

    private Integer leUsAddresserid;

    private Integer leUsRecipientsid;

    private String leContent;

    private static final long serialVersionUID = 1L;

    public Integer getLeId() {
        return leId;
    }

    public void setLeId(Integer leId) {
        this.leId = leId;
    }

    public Integer getLeUsAddresserid() {
        return leUsAddresserid;
    }

    public void setLeUsAddresserid(Integer leUsAddresserid) {
        this.leUsAddresserid = leUsAddresserid;
    }

    public Integer getLeUsRecipientsid() {
        return leUsRecipientsid;
    }

    public void setLeUsRecipientsid(Integer leUsRecipientsid) {
        this.leUsRecipientsid = leUsRecipientsid;
    }

    public String getLeContent() {
        return leContent;
    }

    public void setLeContent(String leContent) {
        this.leContent = leContent;
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
        Letter other = (Letter) that;
        return (this.getLeId() == null ? other.getLeId() == null : this.getLeId().equals(other.getLeId()))
            && (this.getLeUsAddresserid() == null ? other.getLeUsAddresserid() == null : this.getLeUsAddresserid().equals(other.getLeUsAddresserid()))
            && (this.getLeUsRecipientsid() == null ? other.getLeUsRecipientsid() == null : this.getLeUsRecipientsid().equals(other.getLeUsRecipientsid()))
            && (this.getLeContent() == null ? other.getLeContent() == null : this.getLeContent().equals(other.getLeContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLeId() == null) ? 0 : getLeId().hashCode());
        result = prime * result + ((getLeUsAddresserid() == null) ? 0 : getLeUsAddresserid().hashCode());
        result = prime * result + ((getLeUsRecipientsid() == null) ? 0 : getLeUsRecipientsid().hashCode());
        result = prime * result + ((getLeContent() == null) ? 0 : getLeContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leId=").append(leId);
        sb.append(", leUsAddresserid=").append(leUsAddresserid);
        sb.append(", leUsRecipientsid=").append(leUsRecipientsid);
        sb.append(", leContent=").append(leContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}