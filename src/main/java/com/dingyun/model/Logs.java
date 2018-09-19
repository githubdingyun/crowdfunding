package com.dingyun.model;

import java.io.Serializable;

/**
 * logs
 * @author 
 */
public class Logs implements Serializable {
    private Integer logId;

    private Integer logUsId;

    private String logContent;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogUsId() {
        return logUsId;
    }

    public void setLogUsId(Integer logUsId) {
        this.logUsId = logUsId;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
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
        Logs other = (Logs) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogUsId() == null ? other.getLogUsId() == null : this.getLogUsId().equals(other.getLogUsId()))
            && (this.getLogContent() == null ? other.getLogContent() == null : this.getLogContent().equals(other.getLogContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogUsId() == null) ? 0 : getLogUsId().hashCode());
        result = prime * result + ((getLogContent() == null) ? 0 : getLogContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logUsId=").append(logUsId);
        sb.append(", logContent=").append(logContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}