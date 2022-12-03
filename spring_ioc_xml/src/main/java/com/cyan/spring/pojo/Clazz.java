package com.cyan.spring.pojo;

import java.util.List;

public class Clazz {
    private Integer cid;
    private String cName;
    private List<Student> students;

    public Clazz() {
    }

    public Clazz(Integer cid, String cName) {
        this.cid = cid;
        this.cName = cName;
    }

    public Clazz(Integer cid, String cName, List<Student> students) {
        this.cid = cid;
        this.cName = cName;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                ", students=" + students +
                '}';
    }
}
