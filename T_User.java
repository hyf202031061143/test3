package com.wolfcode.entity;

import java.sql.Date;
import java.util.List;

public class T_User {
    private String ucode;
    private String uname;
    private String uphoto;
    private short usex;
    private Date ubirthday;
    private String uphone;
    private String utype;
    private Short ustatus;
    private String upwd;
    private String uaddress;
    private Integer rid;

    public List<T_privilage> getPriList() {
        return priList;
    }

    public void setPriList(List<T_privilage> priList) {
        this.priList = priList;
    }

    //表示用户对应的权限
    private List<T_privilage> priList;

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUphoto() {
        return uphoto;
    }

    public void setUphoto(String uphoto) {
        this.uphoto = uphoto;
    }

    public short getUsex() {
        return usex;
    }

    public void setUsex(short usex) {
        this.usex = usex;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public Short getUstatus() {
        return ustatus;
    }

    public void setUstatus(Short ustatus) {

        this.ustatus = ustatus;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "T_User{" +
                "ucode='" + ucode + '\'' +
                ", uname='" + uname + '\'' +
                ", uphoto='" + uphoto + '\'' +
                ", usex=" + usex +
                ", ubirthday=" + ubirthday +
                ", uphone='" + uphone + '\'' +
                ", utype='" + utype + '\'' +
                ", ustatus=" + ustatus +
                ", upwd='" + upwd + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", rid=" + rid +
                ", priList=" + priList +
                '}';
    }
}
