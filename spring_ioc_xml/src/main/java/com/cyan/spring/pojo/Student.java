package com.cyan.spring.pojo;

import java.util.Arrays;

public class Student implements Person {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Clazz clazz;
    private String[] bobby;
    public Student() {
    }

    public Student(Integer sid, String sname, Integer age, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.clazz = clazz;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Clazz clazz, String[] bobby) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.clazz = clazz;
        this.bobby = bobby;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getBobby() {
        return bobby;
    }

    public void setBobby(String[] bobby) {
        this.bobby = bobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", clazz=" + clazz +
                ", bobby=" + Arrays.toString(bobby) +
                '}';
    }
}
