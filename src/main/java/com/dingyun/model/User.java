package com.dingyun.model;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private Integer usId;

    private String usEmail;

    private String usName;

    private String usPassword;

    private Double usMoney;

    private String usIdcard;

    private String usPhone;

    private String usAddress;

    private Integer usRole;

    private String usSex;

    private String usCode;

    private static final long serialVersionUID = 1L;

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUsEmail() {
        return usEmail;
    }

    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName;
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }

    public Double getUsMoney() {
        return usMoney;
    }

    public void setUsMoney(Double usMoney) {
        this.usMoney = usMoney;
    }

    public String getUsIdcard() {
        return usIdcard;
    }

    public void setUsIdcard(String usIdcard) {
        this.usIdcard = usIdcard;
    }

    public String getUsPhone() {
        return usPhone;
    }

    public void setUsPhone(String usPhone) {
        this.usPhone = usPhone;
    }

    public String getUsAddress() {
        return usAddress;
    }

    public void setUsAddress(String usAddress) {
        this.usAddress = usAddress;
    }

    public Integer getUsRole() {
        return usRole;
    }

    public void setUsRole(Integer usRole) {
        this.usRole = usRole;
    }

    public String getUsSex() {
        return usSex;
    }

    public void setUsSex(String usSex) {
        this.usSex = usSex;
    }

    public String getUsCode() {
        return usCode;
    }

    public void setUsCode(String usCode) {
        this.usCode = usCode;
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
        User other = (User) that;
        return (this.getUsId() == null ? other.getUsId() == null : this.getUsId().equals(other.getUsId()))
            && (this.getUsEmail() == null ? other.getUsEmail() == null : this.getUsEmail().equals(other.getUsEmail()))
            && (this.getUsName() == null ? other.getUsName() == null : this.getUsName().equals(other.getUsName()))
            && (this.getUsPassword() == null ? other.getUsPassword() == null : this.getUsPassword().equals(other.getUsPassword()))
            && (this.getUsMoney() == null ? other.getUsMoney() == null : this.getUsMoney().equals(other.getUsMoney()))
            && (this.getUsIdcard() == null ? other.getUsIdcard() == null : this.getUsIdcard().equals(other.getUsIdcard()))
            && (this.getUsPhone() == null ? other.getUsPhone() == null : this.getUsPhone().equals(other.getUsPhone()))
            && (this.getUsAddress() == null ? other.getUsAddress() == null : this.getUsAddress().equals(other.getUsAddress()))
            && (this.getUsRole() == null ? other.getUsRole() == null : this.getUsRole().equals(other.getUsRole()))
            && (this.getUsSex() == null ? other.getUsSex() == null : this.getUsSex().equals(other.getUsSex()))
            && (this.getUsCode() == null ? other.getUsCode() == null : this.getUsCode().equals(other.getUsCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsId() == null) ? 0 : getUsId().hashCode());
        result = prime * result + ((getUsEmail() == null) ? 0 : getUsEmail().hashCode());
        result = prime * result + ((getUsName() == null) ? 0 : getUsName().hashCode());
        result = prime * result + ((getUsPassword() == null) ? 0 : getUsPassword().hashCode());
        result = prime * result + ((getUsMoney() == null) ? 0 : getUsMoney().hashCode());
        result = prime * result + ((getUsIdcard() == null) ? 0 : getUsIdcard().hashCode());
        result = prime * result + ((getUsPhone() == null) ? 0 : getUsPhone().hashCode());
        result = prime * result + ((getUsAddress() == null) ? 0 : getUsAddress().hashCode());
        result = prime * result + ((getUsRole() == null) ? 0 : getUsRole().hashCode());
        result = prime * result + ((getUsSex() == null) ? 0 : getUsSex().hashCode());
        result = prime * result + ((getUsCode() == null) ? 0 : getUsCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usId=").append(usId);
        sb.append(", usEmail=").append(usEmail);
        sb.append(", usName=").append(usName);
        sb.append(", usPassword=").append(usPassword);
        sb.append(", usMoney=").append(usMoney);
        sb.append(", usIdcard=").append(usIdcard);
        sb.append(", usPhone=").append(usPhone);
        sb.append(", usAddress=").append(usAddress);
        sb.append(", usRole=").append(usRole);
        sb.append(", usSex=").append(usSex);
        sb.append(", usCode=").append(usCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}