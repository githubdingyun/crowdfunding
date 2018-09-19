package com.dingyun.model;

import java.io.Serializable;
import java.util.Date;

/**
 * questionother
 * @author 
 */
public class Questionother implements Serializable {
    private Integer questionotherid;

    private Integer questionid;

    private String questionothername;

    private String questionanswer;

    private Date questiondate;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionotherid() {
        return questionotherid;
    }

    public void setQuestionotherid(Integer questionotherid) {
        this.questionotherid = questionotherid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestionothername() {
        return questionothername;
    }

    public void setQuestionothername(String questionothername) {
        this.questionothername = questionothername;
    }

    public String getQuestionanswer() {
        return questionanswer;
    }

    public void setQuestionanswer(String questionanswer) {
        this.questionanswer = questionanswer;
    }

    public Date getQuestiondate() {
        return questiondate;
    }

    public void setQuestiondate(Date questiondate) {
        this.questiondate = questiondate;
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
        Questionother other = (Questionother) that;
        return (this.getQuestionotherid() == null ? other.getQuestionotherid() == null : this.getQuestionotherid().equals(other.getQuestionotherid()))
            && (this.getQuestionid() == null ? other.getQuestionid() == null : this.getQuestionid().equals(other.getQuestionid()))
            && (this.getQuestionothername() == null ? other.getQuestionothername() == null : this.getQuestionothername().equals(other.getQuestionothername()))
            && (this.getQuestionanswer() == null ? other.getQuestionanswer() == null : this.getQuestionanswer().equals(other.getQuestionanswer()))
            && (this.getQuestiondate() == null ? other.getQuestiondate() == null : this.getQuestiondate().equals(other.getQuestiondate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionotherid() == null) ? 0 : getQuestionotherid().hashCode());
        result = prime * result + ((getQuestionid() == null) ? 0 : getQuestionid().hashCode());
        result = prime * result + ((getQuestionothername() == null) ? 0 : getQuestionothername().hashCode());
        result = prime * result + ((getQuestionanswer() == null) ? 0 : getQuestionanswer().hashCode());
        result = prime * result + ((getQuestiondate() == null) ? 0 : getQuestiondate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionotherid=").append(questionotherid);
        sb.append(", questionid=").append(questionid);
        sb.append(", questionothername=").append(questionothername);
        sb.append(", questionanswer=").append(questionanswer);
        sb.append(", questiondate=").append(questiondate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}