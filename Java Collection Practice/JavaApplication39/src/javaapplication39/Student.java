package javaapplication39;

public class Student {

    private String fname, sname;
    private long stdID;
    private double height, weight;

    public Student() {
    }

    public Student(String fname, String sname, long stdID, double height, double weight) {
        this.fname = fname;
        this.sname = sname;
        this.stdID = stdID;
        this.height = height;
        this.weight = weight;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" + '}';
    }

    
    
    
    
    
}
