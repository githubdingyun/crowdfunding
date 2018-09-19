package com.dingyun.model;

import java.io.Serializable;

/**
 * questionall
 * @author 
 */
public class Questionall implements Serializable {
    private Integer questionid;

    private String questionname;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
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
        Questionall other = (Questionall) that;
        return (this.getQuestionid() == null ? other.getQuestionid() == null : this.getQuestionid().equals(other.getQuestionid()))
            && (this.getQuestionname() == null ? other.getQuestionname() == null : this.getQuestionname().equals(other.getQuestionname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionid() == null) ? 0 : getQuestionid().hashCode());
        result = prime * result + ((getQuestionname() == null) ? 0 : getQuestionname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionid=").append(questionid);
        sb.append(", questionname=").append(questionname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}