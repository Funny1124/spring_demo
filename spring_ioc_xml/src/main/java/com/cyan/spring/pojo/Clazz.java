package com.cyan.spring.pojo;

public class Clazz {
    private Integer cid;
    private String cName;

    public Clazz() {
    }

    public Clazz(Integer cid, String cName) {
        this.cid = cid;
        this.cName = cName;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                '}';
    }
}
