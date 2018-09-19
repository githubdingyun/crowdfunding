package com.dingyun.model;

import java.io.Serializable;
import java.util.Date;

/**
 * projectstype
 * @author 
 */
public class Projectstype implements Serializable {
    private Integer pstId;

    private String pstName;

    private String pstDesc;

    private Date pstStardate;

    private Integer pstType;

    private static final long serialVersionUID = 1L;

    public Integer getPstId() {
        return pstId;
    }

    public void setPstId(Integer pstId) {
        this.pstId = pstId;
    }

    public String getPstName() {
        return pstName;
    }

    public void setPstName(String pstName) {
        this.pstName = pstName;
    }

    public String getPstDesc() {
        return pstDesc;
    }

    public void setPstDesc(String pstDesc) {
        this.pstDesc = pstDesc;
    }

    public Date getPstStardate() {
        return pstStardate;
    }

    public void setPstStardate(Date pstStardate) {
        this.pstStardate = pstStardate;
    }

    public Integer getPstType() {
        return pstType;
    }

    public void setPstType(Integer pstType) {
        this.pstType = pstType;
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
        Projectstype other = (Projectstype) that;
        return (this.getPstId() == null ? other.getPstId() == null : this.getPstId().equals(other.getPstId()))
            && (this.getPstName() == null ? other.getPstName() == null : this.getPstName().equals(other.getPstName()))
            && (this.getPstDesc() == null ? other.getPstDesc() == null : this.getPstDesc().equals(other.getPstDesc()))
            && (this.getPstStardate() == null ? other.getPstStardate() == null : this.getPstStardate().equals(other.getPstStardate()))
            && (this.getPstType() == null ? other.getPstType() == null : this.getPstType().equals(other.getPstType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPstId() == null) ? 0 : getPstId().hashCode());
        result = prime * result + ((getPstName() == null) ? 0 : getPstName().hashCode());
        result = prime * result + ((getPstDesc() == null) ? 0 : getPstDesc().hashCode());
        result = prime * result + ((getPstStardate() == null) ? 0 : getPstStardate().hashCode());
        result = prime * result + ((getPstType() == null) ? 0 : getPstType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pstId=").append(pstId);
        sb.append(", pstName=").append(pstName);
        sb.append(", pstDesc=").append(pstDesc);
        sb.append(", pstStardate=").append(pstStardate);
        sb.append(", pstType=").append(pstType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}