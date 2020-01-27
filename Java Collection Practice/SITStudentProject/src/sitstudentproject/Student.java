
package sitstudentproject;



    public class Student {

    private long stdID;
    private String fName, sName;
    private double weight, height;

    public Student() {
    }

    public Student(long stdID, String fName, String sName, double weight, double height) {
        this.stdID = stdID;
        this.fName = fName;
        this.sName = sName;
        this.weight = weight;
        this.height = height;
    }

    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    public String signature(){
        String sig;
        sig=""+fName.charAt(0)+sName.charAt(0);
        return sig.toUpperCase();        
    }
    
    public String getEmail(){
        String email;
        email = fName.toLowerCase()+"."+sName.substring(0,3).toLowerCase()+"@sit.kmutt.ac.th";
        return email;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", fName=" + fName + ", sName=" + sName + ", weight=" + weight + ", height=" + height + '}';
    }
}
