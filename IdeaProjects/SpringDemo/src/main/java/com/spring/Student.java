package com.spring;

public class Student {
    private int sid;
    private String sname;
    private String scourse;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScourse() {
        return scourse;
    }

    public void setScourse(String scourse) {
        this.scourse = scourse;
    }

    public Student(int sid, String sname, String scourse) {
        this.sid = sid;
        this.sname = sname;
        this.scourse = scourse;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scourse='" + scourse + '\'' +
                '}';
    }
}
