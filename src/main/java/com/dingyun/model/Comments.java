package com.dingyun.model;

import java.io.Serializable;

/**
 * comments
 * @author 
 */
public class Comments implements Serializable {
    private Integer cmId;

    private Integer cmUsId;

    private Integer cmPsId;

    private String cmContent;

    private static final long serialVersionUID = 1L;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public Integer getCmUsId() {
        return cmUsId;
    }

    public void setCmUsId(Integer cmUsId) {
        this.cmUsId = cmUsId;
    }

    public Integer getCmPsId() {
        return cmPsId;
    }

    public void setCmPsId(Integer cmPsId) {
        this.cmPsId = cmPsId;
    }

    public String getCmContent() {
        return cmContent;
    }

    public void setCmContent(String cmContent) {
        this.cmContent = cmContent;
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
        Comments other = (Comments) that;
        return (this.getCmId() == null ? other.getCmId() == null : this.getCmId().equals(other.getCmId()))
            && (this.getCmUsId() == null ? other.getCmUsId() == null : this.getCmUsId().equals(other.getCmUsId()))
            && (this.getCmPsId() == null ? other.getCmPsId() == null : this.getCmPsId().equals(other.getCmPsId()))
            && (this.getCmContent() == null ? other.getCmContent() == null : this.getCmContent().equals(other.getCmContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCmId() == null) ? 0 : getCmId().hashCode());
        result = prime * result + ((getCmUsId() == null) ? 0 : getCmUsId().hashCode());
        result = prime * result + ((getCmPsId() == null) ? 0 : getCmPsId().hashCode());
        result = prime * result + ((getCmContent() == null) ? 0 : getCmContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cmId=").append(cmId);
        sb.append(", cmUsId=").append(cmUsId);
        sb.append(", cmPsId=").append(cmPsId);
        sb.append(", cmContent=").append(cmContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}