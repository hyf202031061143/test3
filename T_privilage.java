package com.wolfcode.entity;

import java.util.List;

public class T_privilage {
    private Integer pid;
    private String pname;
    private String purl;
    private Integer psort;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public Integer getPsort() {
        return psort;
    }

    public void setPsort(Integer psort) {
        this.psort = psort;
    }

    public Boolean getPable() {
        return pable;
    }

    public void setPable(Boolean pable) {
        this.pable = pable;
    }

    public Integer getP_pid() {
        return p_pid;
    }

    public void setP_pid(Integer p_pid) {
        this.p_pid = p_pid;
    }

    public List<T_privilage> getPriList() {
        return priList;
    }

    public void setPriList(List<T_privilage> priList) {
        this.priList = priList;
    }

    private Boolean pable;
    private Integer p_pid;
    private List<T_privilage> priList;

    @Override
    public String toString() {
        return "T_privilage{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", purl='" + purl + '\'' +
                ", psort=" + psort +
                ", pable=" + pable +
                ", p_pid=" + p_pid +
                ", priList=" + priList +
                '}';
    }
}
