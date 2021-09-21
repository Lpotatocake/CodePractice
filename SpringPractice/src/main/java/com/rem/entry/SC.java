package com.rem.entry;

public class SC {
    private String Sno;
    private String Cno;
    private int Grade;

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getCno() {
        return Cno;
    }

    public void setCno(String cno) {
        Cno = cno;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "SC{" +
                "Sno='" + Sno + '\'' +
                ", Cno='" + Cno + '\'' +
                ", Grade=" + Grade +
                '}';
    }
}
